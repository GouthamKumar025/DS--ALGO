class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] ans = new int[nums.length];
        int l = 0;
        int h = nums.length - 1;
        for(int j = ans.length-1; j>=0; j--){
            int sqr_l = nums[l] * nums[l];
            int sqr_h = nums[h] * nums[h];
            if(sqr_h > sqr_l){
                ans[j] = sqr_h;
                h--;
            }
            else{
                ans[j] = sqr_l;
                l++;
            }
        }
        return ans;
    }
}
