class Solution {
    public int maxSubArray(int[] nums) {
        int curr_Sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            curr_Sum = curr_Sum + nums[i];
            if(curr_Sum < nums[i]){
                curr_Sum = nums[i];
            }
            max_sum = Math.max(max_sum,curr_Sum);
        }
        return max_sum;
    }
}
