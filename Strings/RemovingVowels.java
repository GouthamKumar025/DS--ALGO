package com.tcsnqt.Strings;

public class RemovingVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "take u forward";
		System.out.println(removeVowels(s));
	}
	
	public static String removeVowels(String str) {
		for(int i =0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch =='e' || ch=='i' || ch =='o' || ch=='u') {
				str = str.substring(0,i) + str.substring(i+1);
				i--;
			}
		}
		return str;
	}

}
