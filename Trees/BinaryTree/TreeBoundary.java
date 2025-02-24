
class Solution {
    ArrayList<Integer> boundaryTraversal(Node node) {
        // code here
        ArrayList<Integer>ans = new ArrayList<>();
        if(node == null) return ans;
        if(!isLeaf(node)) ans.add(node.data);
        leftBoundary(node.left,ans);
        leafBoundary(node,ans);
        rightBoundary(node.right,ans);
        
        return ans;
    }
    
    public void leftBoundary(Node root, ArrayList<Integer>ans){
        Node curr = root;
        
        while(curr != null){
            if(!isLeaf(curr)) ans.add(curr.data);
            if(curr.left!=null) curr = curr.left;
            else curr = curr.right;
        }
    }
    
    public void leafBoundary(Node root,ArrayList<Integer>ans) {
        // Your code here
        if(root == null) return;
        if(isLeaf(root)){
            ans.add(root.data);
            return;
        }
        leafBoundary(root.left,ans);
        leafBoundary(root.right,ans);
        
    
    }
    
    public void rightBoundary(Node root, ArrayList<Integer>ans){
        Stack<Integer>stack = new Stack<>();
        Node curr = root;
        while(curr != null){
            if(!isLeaf(curr)) stack.push(curr.data);
            if(curr.right != null) curr = curr.right;
            else curr = curr.left;
        }
        while(!stack.isEmpty()){
            ans.add(stack.pop());
        }
    }
    
    private boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }
}
