class Solution {
    int maxDepth = 0;
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        int maxL = maxDepth(root.left);
        int maxR = maxDepth(root.right);
        maxDepth = Math.max(maxL,maxR) + 1;
        
        return maxDepth;
    }
}
