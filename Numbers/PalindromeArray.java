package com.tcsnqt.Numbers;

import java.util.ArrayList;

public class PalindromeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 10;
		int end = 300;

		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = start; i <= end; i++) {
			if (isPalindrome(i)) {
				arr.add(i);
			}
		}

		System.out.println(arr);

	}

	public static boolean isPalindrome(int n) {
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
