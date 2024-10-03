package com.tcsnqt.Numbers;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for(int i=0;i<n;i++) {
			System.out.print(fib(i) + " ");
		}

	}
	
	public static int fib(int n) {
		if(n<=1) {
			return n;
		}
		return fib(n-1) + fib(n-2);
	}

}
