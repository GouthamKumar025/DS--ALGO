package com.tcsnqt.Numbers;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4554;
		System.out.println(palindrome(n));
	}

	public static boolean palindrome(int n) {
		int original = n;
		int reverse = 0;
		while (n > 0) {
			int rem = n % 10;
			reverse = reverse * 10 + rem;
			n /= 10;
		}
		if (original != reverse) {
			return false;
		}
		return true;
	}

}
