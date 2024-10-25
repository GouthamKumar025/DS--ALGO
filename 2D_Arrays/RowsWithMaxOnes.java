class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int index = 0;
        int cntMax = 0;
        for (int i = 0; i < mat.length; i++) {
            int count_ones = 0;
            for (int j = 0; j < mat[0].length; j++) {
                count_ones += mat[i][j];
            }
            if (count_ones > cntMax) {
                cntMax = count_ones;
                index = i;
            }
        }
        int[] ans = { index, cntMax };
        return ans;

    }
}
