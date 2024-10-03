package com.tcsnqt.Strings;

public class OnlyAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "takeu13%@47a";
		System.out.println(onlyAlphabets(str));
	}
	
	public static String onlyAlphabets(String str) {
		StringBuffer ans = new StringBuffer();
		for(int i=0;i<str.length();i++) {
			int ascii = str.charAt(i);
			if((ascii >=65 && ascii <=90) || (ascii >=97 && ascii <=122)) {
				ans.append(str.charAt(i));
			}
		}
		return ans.toString();
	}

}
