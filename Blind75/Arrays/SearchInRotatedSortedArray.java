class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                return mid;
            }
            //consider the right part of the array is sorted
            if(nums[mid] < nums[high] || nums[mid] < nums[low]){
                if(target > nums[mid] && target <= nums[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
            // consider the left part of the array is sorted
            else if(nums[mid] > nums[high] || nums[mid] > nums[low]){
                  if(target >= nums[low] && target < nums[mid]){
                    high = mid - 1;
                  }
                  else{
                    low = mid + 1;
                  }
            }
            else{
                high --;
            }
            
        }
        return -1;
    }
}
