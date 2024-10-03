package com.tcsnqt.Arrays;

public class Largenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 21, 31, 61, 20, 37, 42 };
		System.out.println(findmax(arr));
	}

	public static int findmax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
