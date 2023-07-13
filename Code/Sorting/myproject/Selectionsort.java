package myproject;

import java.util.Arrays;

public class Selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 3, 7, 4, 1, 8 };
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int last = arr.length - i - 1;
			int maxIndex = maxelement(arr, 0, last);
			swap(arr, maxIndex, last);
		}

	}

	static void swap(int[] arr, int maxIndex, int last) {
		int temp = arr[maxIndex];
		arr[maxIndex] = arr[last];
		arr[last] = temp;
	}

	static int maxelement(int[] arr, int start, int end) {
		int max = start;
		for (int i = 0; i <= end; i++) {
			if (arr[i] > arr[max]) {
				max = i;
			}
		}
		return max;
	}

}
