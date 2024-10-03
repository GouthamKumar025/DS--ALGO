package com.tcsnqt.Arrays;

import java.util.*;

public class UniqueInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 2, 2, 2, 3, 3 };
		int n = arr.length;

		int i = 0;
		for (int j = 1; j < arr.length; j++) {
			if (arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}

		System.out.println(i + 1);

// Using Hashset

//		HashSet<Integer>set = new HashSet<Integer>();
//		
//		for(int num: arr) {
//			set.add(num);
//		}
//		
//		System.out.println(Arrays.toString(set.toArray()));

	}

}
