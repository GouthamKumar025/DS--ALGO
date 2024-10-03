package com.tcsnqt.Strings;

public class Capitalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "take u forward is awesome";
		System.out.println(capitalize(s));
	}
	
	public static String capitalize(String s) {
		StringBuilder sb = new StringBuilder(s);
		
		for(int i=0;i<s.length();i++) {
			if(i==0 || i== s.length()-1) {
				sb.setCharAt(i, Character.toUpperCase((char)(int)s.charAt(i)));
			}
			else if(s.charAt(i) == ' ') {
				sb.setCharAt(i-1, Character.toUpperCase((char)(int)s.charAt(i-1)));
				sb.setCharAt(i+1,Character.toUpperCase((char)(int)s.charAt(i+1)));
			}
		}
		return sb.toString();
		
	}

}
