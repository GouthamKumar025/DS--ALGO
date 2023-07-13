package myproject;

public class Ceiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2,3,5,9,16,17,19};
		int target = 18;  //ceiling --> smallest number which is greater than or equal to target
		System.out.println(binarysearch_ceiling(a, target));

	}

	static int binarysearch_ceiling(int[] arr, int target) {
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
		return start;

	}

}
