package com.tcsnqt.Arrays;

import java.util.HashMap;

public class UniqueInUnsortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		int arr[] = { 4, 3, 9, 2, 4, 1, 10, 89, 34 };

		duplicate(arr, n);
	}

	public static void duplicate(int[] arr, int n) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				System.out.print(arr[i] + " ");
				map.put(arr[i], 1);
			}
		}
	}

//  using normal pointers
//	public static void duplicate(int[]arr, int n) {
//		int [] mark = new int[n];
//		
//		for(int i=0;i<mark.length;i++) {
//			mark[i] = 1;
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			if(mark[i]==1) {
//				for(int j=i+1;j<arr.length;j++) {
//					if(arr[i] == arr[j]) {
//						mark[j] = 0;
//					}
//				}
//			}
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			if(mark[i] == 1) {
//				System.out.print(arr[i]+" ");
//			}
//		}
//	}

}
