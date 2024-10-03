package com.tcsnqt.Numbers;

public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		System.out.println(isPerfect(n));
	}
	
	public static boolean isPerfect(int n) {
		int sum = 0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum == n) {
			return true;
		}
		return false;
	}

}
