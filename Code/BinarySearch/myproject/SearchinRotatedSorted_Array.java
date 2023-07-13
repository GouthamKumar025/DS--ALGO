package myproject;

public class SearchinRotatedSorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10,10,1,10,10};
		System.out.println(findMin(nums));

	}

	public static int findMin(int[] nums) {
		int low = 0;
		int high = nums.length - 1;
		int ans = Integer.MAX_VALUE;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			// left-sorted array
			if (nums[low] <= nums[mid]) {
				ans = Math.min(ans, nums[low]);
				low = mid + 1; // omitting the left sorted array and moving to right array
			}
			// right-sorted array
			else {
				ans = Math.min(ans, nums[mid]);
				high = mid - 1; // omitting the right sorted array and moving to left array
			}
		}
		return ans;

	}

}
