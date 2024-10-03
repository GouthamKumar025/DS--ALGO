package com.tcsnqt.Numbers;

public class GP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		double r = 0.5;
		int n = 3;

		double sum = (a * (Math.pow(r, n) - 1)) / (r - 1);
		System.out.println(sum);
	}

}
