package myproject;

import java.util.Arrays;

public class FirstandLastPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {5,7,7,7,7,8,8,10};
		int target=7;
		System.out.println(Arrays.toString(searchRange(a,target)));

	}

	static int[] searchRange(int[] nums, int target) {
		int[] ans = { -1, -1 };
		int start = search(nums, target, true);
		int end = search(nums, target, false);
		ans[0] = start;
		ans[1] = end;
		int res=end-start+1;
		System.out.println(res);
		return ans;
	}

	static int search(int[] nums, int target, boolean isStartIndex) {
		int ans = -1;
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target > nums[mid]) {
				start = mid + 1;
			} else if (target < nums[mid]) {
				end = mid - 1;
			} else {
				// potential answer value
				ans = mid;
				if (isStartIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return ans;
	}

}
