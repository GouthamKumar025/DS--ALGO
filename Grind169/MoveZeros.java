class Solution {
    public void moveZeroes(int[] nums) {
        int snowball = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                snowball++;
            }
            else if(snowball > 0){
                int temp = nums[i];
                nums[i] = 0;
                nums[i-snowball] = temp;
            }
        }

    }
}
