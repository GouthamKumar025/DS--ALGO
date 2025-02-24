class Solution {
    // Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root) {
        // write code here
        ArrayList<Integer>arr = new ArrayList<>();
        findPreOrder(root,arr);
        return arr;
    }
    
    public static void findPreOrder(Node root, ArrayList<Integer>ans){
        if(root == null) return;
        
        ans.add(root.data);
        findPreOrder(root.left,ans);
        findPreOrder(root.right,ans);
    }
}
