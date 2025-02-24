class Solution {
    // Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root) {
        // Your code goes here
        ArrayList<Integer>ans = new ArrayList<>();
        findPostorder(root,ans);
        return ans;
    }
    
    public void findPostorder(Node root, ArrayList<Integer>ans){
        if(root == null) return;
        
        findPostorder(root.left,ans);
        findPostorder(root.right,ans);
        ans.add(root.data);
    }
}
