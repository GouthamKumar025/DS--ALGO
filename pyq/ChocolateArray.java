package com.tcsnqt.pyq;

import java.util.Arrays;

public class ChocolateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		int [] arr = {4,5,0,1,9,0,5,0};
		System.out.println(Arrays.toString(chocoarray(arr,n)));
	}
	
	public static int[] chocoarray(int[]arr,int n) {
		int count = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				arr[count] = arr[i];
				count ++;
			}
		}
		for(int i=count+1;i<n;i++) {
			arr[i] = 0;
		}
		
		return arr;
	}

}
