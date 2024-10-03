package com.tcsnqt.Arrays;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {21,17,36,42,12};
		double sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += (double)arr[i];
		}
	    System.out.println(sum / arr.length);

	}

}
