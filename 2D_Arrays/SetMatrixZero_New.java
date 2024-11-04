class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int cols0 = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    // set the ith row
                    matrix[i][0] = 0;
                    // set the jth row
                    if (j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        cols0 = 0;
                    }
                }
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] != 0) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }

            }
        }
        for(int j=0;j<m;j++){
            if(matrix[0][0] == 0){
                matrix[0][j] = 0;
            }
        }
        for(int i=0;i<n;i++){
            if(cols0 == 0){
                matrix[i][0] = 0;
            }
        }
    }
}
