package com.tcsnqt.Arrays;

import java.util.Arrays;

public class Reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 21, 31, 61, 20, 37, 42 };
		System.out.println(Arrays.toString(reverse(arr)));
	}

	public static int[] reverse(int[] arr) {
		int n = arr.length;
		int[] reversed_arr = new int[n];
		for (int i = n - 1; i > 0; i--) {
			reversed_arr[n - i - 1] = arr[i];
		}
		return reversed_arr;
	}

}
