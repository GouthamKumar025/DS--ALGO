package myproject;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 6, 8, 12, 32, 46, 58, 69, 80 };
		int target = 12;
		System.out.println(binarySearch(arr, target, 0, arr.length - 1));

	}

	static int binarySearch(int[] arr, int target, int start, int end) {
		if (start > end) {
			return -1;
		}
		int mid = start + (end - start) / 2;
		if (arr[mid] == target) {
			return mid;
		}
		if (target < arr[mid]) {
			return binarySearch(arr, target, start, mid - 1);
		} else {
			return binarySearch(arr, target, mid + 1, end);
		}
	}

}
