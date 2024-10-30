class Solution {
    public int splitArray(int[] nums, int k) {
        if(nums.length <= 1){
            return nums[0];
        }
        int left = Arrays.stream(nums).max().orElseThrow();
        int right = Arrays.stream(nums).sum();

        while(left <= right){
            int mid = (left + right) / 2;
            if(splitSum(nums,mid,k)){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;

    }

    public boolean splitSum(int[]arr,int mid, int k){
        int count = 1;
        int total = 0;
        for(int i: arr){
            total += i;
            if(total > mid){
                total = i;
                count++;
            }
            if(count > k){
                return false;
            }
        }
        return true;
    }
}
