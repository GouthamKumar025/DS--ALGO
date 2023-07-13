package myproject;

import java.util.Arrays;

public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -4, -7, 2, 9, 7, 21 };
		InsertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void InsertionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j++) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
				} else {
					break;
				}
			}
		}
	}

	static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
