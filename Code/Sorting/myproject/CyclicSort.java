package myproject;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 3, 2, 5, 1 };
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void sort(int[] arr) {
		int i = 0; // initialisation
		while (i < arr.length) {
			int check_nums = arr[i] - 1; // Identify the correct index the number has to be placed
			if (arr[i] != arr[check_nums]) { // checking the correct index the number has to be replaced(or)swapped
				swap(arr, i, check_nums);
			} else {
				i++; // if it is in correct sorted manner then increment the index

			}
		}
	}

	static void swap(int[] arr, int i, int check_nums) {
		int temp = arr[i];
		arr[i] = arr[check_nums];
		arr[check_nums] = temp;
	}

}
