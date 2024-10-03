package com.tcsnqt.Arrays;

import java.util.Arrays;

public class SecondSmallAndLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 21, 31, 61, 20, 37, 42 };

		int min = Integer.MAX_VALUE;
		int second_min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int second_max = Integer.MIN_VALUE;

		for (int num : arr) {

			// finding the second_minimum
			if (num < min) {
				second_min = min;
				min = num;
			} else if (num > min && num < second_min) {
				second_min = num;
			}

			// finding the second_maximum
			if (num > max) {
				second_max = max;
				max = num;
			} else if (num < max && num > second_max) {
				second_max = num;
			}

		}

		System.out.print(second_min + " ");
		System.out.print(second_max);

	}

}

// By using sorting method
//Arrays.sort(arr);
//System.out.print(arr[1]+ " ");
//System.out.print(arr[arr.length-2]);