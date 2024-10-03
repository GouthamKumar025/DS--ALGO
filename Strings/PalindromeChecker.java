package com.tcsnqt.Strings;

public class PalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "madam";
		System.out.println(checkPalindrome(s));
	}
	
	public static boolean checkPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;
		while(left < right) {
			if(Character.isLowerCase(s.charAt(left))!=Character.isLowerCase(s.charAt(right))) {
				return false;
			}
			left ++;
			right --;
		}
		return true;
		
	}

}
