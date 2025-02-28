class Solution {
    private HashMap<Integer,Integer>map = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        
        return findBuildTree(inorder,postorder,0,inorder.length-1,postorder.length-1);
    }
    
    public TreeNode findBuildTree(int [] inorder, int [] postorder, int inStart, int inEnd, int postIndex){
        if(inStart > inEnd){
            return null;
        }
        int rootValue = postorder[postIndex];
        TreeNode root = new TreeNode(rootValue);
        
        // build the right subtree
        int inorderRootIndex = map.get(rootValue);
        root.right = findBuildTree(inorder, postorder,inorderRootIndex+1,inEnd,postIndex-1);
        
        // build the left subtree
        int rightSubtreeSize = inEnd - inorderRootIndex;
        root.left = findBuildTree(inorder,postorder,inStart,inorderRootIndex-1,postIndex-rightSubtreeSize-1);
        
        return root;
    }
}
