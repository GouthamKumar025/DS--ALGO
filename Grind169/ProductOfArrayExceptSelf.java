class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];
        ans[0] = 1;

        for(int i=1;i<nums.length;i++){
            ans[i] = nums[i-1] * ans[i-1];
        }
        
        int r = 1;
        for(int j=n-1;j>=0;j--){
            ans[j] = ans[j] * r;
            r = r * nums[j];
        }

        return ans;
    }
}
