package myproject;

//consider the array starts from 0 to N.
public class Missingno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 1, 0, 2 };
		System.out.println(missingno(arr));
	}

	static int missingno(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i];
			if (arr[i] < arr.length && arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}
		}
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index) {
				return index;
			}
		}
		return arr.length;
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
