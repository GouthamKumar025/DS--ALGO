package com.tcsnqt.Arrays;

public class Smallnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 21, 31, 61, 20, 37, 42 };
		System.out.println(findmin(arr));
	}

	public static int findmin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

}
