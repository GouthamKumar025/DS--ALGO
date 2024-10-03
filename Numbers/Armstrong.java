package com.tcsnqt.Numbers;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153;
		System.out.println(isArmstrong(n));
	}
	
	public static boolean isArmstrong(int n) {
		int k = String.valueOf(n).length();
		int org_sum = 153;
		int sum = 0;
		while(n > 0) {
			int rem = n % 10;
			sum += Math.pow(rem, k);
			n/=10;
		}
		if(sum == org_sum) {
			return true;
		}
		return false;
	}

}
