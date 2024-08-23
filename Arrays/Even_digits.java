class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int even_count = 0;
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            while(num > 0){
                count++;
                num/=10;
            }
            if(count % 2 == 0 ){
                even_count++;
            }
            count = 0;
        }
        return even_count;
    }
}
