package myproject;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 9, 12, 15, 27, 34, 52, 89 };
		int target = 27;
		System.out.println(binarysearch(a, target));

	}

	static int binarysearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target > arr[mid]) {
				start = mid + 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;

	}

}
