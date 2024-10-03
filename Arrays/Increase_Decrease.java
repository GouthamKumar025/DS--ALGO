package com.tcsnqt.Arrays;

import java.util.Arrays;

public class Increase_Decrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 21, 41, 7, 32, 54, 13 };
		int n = arr.length;
		IncreaseDecrease(arr, n);
	}

	public static void IncreaseDecrease(int[] arr, int n) {
		Arrays.sort(arr);
		for (int i = 0; i < n / 2; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = n - 1; i >= n / 2; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
