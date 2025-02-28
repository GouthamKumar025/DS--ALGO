class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return false;
        
        return findSymmetric(root.left,root.right);
    }
    
    public boolean findSymmetric(TreeNode n1, TreeNode n2){
        if(n1 == null && n2 == null) return true;
        if(n1 == null || n2 == null) return false;
        
        return n1.val == n2.val && findSymmetric(n1.left,n2.right) && findSymmetric(n1.right,n2.left);
    }
}
