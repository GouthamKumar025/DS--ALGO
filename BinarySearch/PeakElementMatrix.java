class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            int row = maxElement(mat,m,mid);
            int left = mid - 1 >= 0 ? mat[row][mid-1] : -1;
            int right = mid + 1 < n ? mat[row][mid+1] : -1;
            if(mat[row][mid] > left && mat[row][mid] > right){
                return new int[]{row,mid};
            } 
            else if(mat[row][mid] < left){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }

    public int maxElement(int[][]mat,int m,int col){
        int maxRow = 0;
        for(int i=1;i<m;i++){
            if(mat[i][col] > mat[maxRow][col]){
                maxRow = i;
            }
        }
        return maxRow;

    }
}