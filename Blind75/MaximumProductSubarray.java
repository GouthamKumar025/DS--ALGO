class Solution {
    public int maxProduct(int[] nums) {
        int prefixsum = 1;
        int suffixsum = 1;
        int max_ans = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            if(prefixsum == 0) prefixsum = 1;
            if(suffixsum == 0) suffixsum = 1;
            prefixsum *= nums[i];
            suffixsum *= nums[n-i-1];

            max_ans = Math.max(max_ans,Math.max(prefixsum,suffixsum));
        }
        return max_ans;

    }
}
