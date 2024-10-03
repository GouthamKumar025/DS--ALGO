package com.tcsnqt.Numbers;

public class MinMax {
	public static void main(String[] args) {
		int n = 32864;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		while (n > 0) {
			int rem = n % 10;
			min = Math.min(min, rem);
			max = Math.max(max, rem);
			n /= 10;
		}
		System.out.println("Max: " + max + " Min: " + min);
	}

}
