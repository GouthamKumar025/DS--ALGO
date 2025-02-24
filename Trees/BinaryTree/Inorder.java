class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer>ans = new ArrayList<>();
        findInorder(root,ans);
        return ans;
    }
    
    public void findInorder(Node root,ArrayList<Integer>ans){
        if(root == null){
            return;
        }
        
        findInorder(root.left,ans);
        ans.add(root.data);
        findInorder(root.right,ans);
    }
}
