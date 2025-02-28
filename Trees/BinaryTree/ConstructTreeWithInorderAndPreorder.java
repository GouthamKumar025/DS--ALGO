class Solution {
    private HashMap<Integer,Integer>map = new HashMap<>();
    private int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return findBuildTree(preorder,0,inorder.length-1);
    }
    
    private TreeNode findBuildTree(int [] preorder, int inStart, int inEnd){
        if(inStart > inEnd){
            return null;
        }
        int rootValue = preorder[preIndex++];
        TreeNode root = new TreeNode(rootValue);
        int inorderRootIndex = map.get(rootValue);
        
        root.left = findBuildTree(preorder, inStart, inorderRootIndex-1);
        root.right = findBuildTree(preorder,inorderRootIndex+1,inEnd);
        
        return root;
        
    }
}
