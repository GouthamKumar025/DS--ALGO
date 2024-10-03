package com.tcsnqt.Numbers;

import java.util.ArrayList;

public class Primefactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 60;
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				arr.add(i);
			}
			while (n % i == 0) {
				n = n / i;
			}
		}
		System.out.println(arr);

	}

}
