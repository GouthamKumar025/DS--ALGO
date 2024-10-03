package com.tcsnqt.Arrays;

import java.util.Arrays;

public class Median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {21,43,6,3,32,3};
		Arrays.sort(arr);
		int n = arr.length;
		if(n%2==0) {
			System.out.println((double)(arr[(n/2)-1] + arr[n/2])/2.0);
		}
		else {
			System.out.println(arr[n/2]);
		}
	}

}
