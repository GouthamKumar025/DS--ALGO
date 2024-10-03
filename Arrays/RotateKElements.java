package com.tcsnqt.Arrays;

import java.util.Arrays;

public class RotateKElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 21, 32, 17, 9, 46 };
		int k = 2;
		rotate(arr, k);
		System.out.print(Arrays.toString(arr));
	}

	public static void rotate(int[] arr, int k) {
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);
		reverse(arr,0,arr.length-1);
	}

	public static void reverse(int[] arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
		}
	}

// method - 2

//	public static int[] rotate(int[] arr, int k) {
//		int[] ans_arr = new int[arr.length];
//		for (int i = k; i <= arr.length - 1; i++) {
//			ans_arr[i - k] = arr[i];
//		}
//		for (int i = 0; i < k; i++) {
//			ans_arr[arr.length - k + i] = arr[i];
//		}
//		return ans_arr;
//	}

}
