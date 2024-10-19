class Solution {
    int[][] rotateMatrix(int k, int mat[][]) {
        // code here
        int n = mat.length;
        int cols = mat[0].length;
        k = k % cols;
        reverse(mat,0,k-1,cols);
        reverse(mat,k,cols-1,cols);
        reverse(mat,0,cols-1,cols);
        
        return mat;
    }
    
    public void reverse(int[][]mat,int low, int high, int cols){
        while(low < high){
            for(int i = 0; i < mat.length; i++){
                if(low < cols && high < cols){
                    int temp = mat[i][low];
                     mat[i][low] = mat[i][high];
                    mat[i][high] = temp;
                }
                
            }
            low++;
            high--;
        }
    }
}
