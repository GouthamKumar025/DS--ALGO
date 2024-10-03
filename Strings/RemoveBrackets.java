package com.tcsnqt.Strings;

public class RemoveBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(a+b)+(c+d)";
		System.out.println(removeBrackets(s));
	}
	
	public static String removeBrackets(String s) {
		StringBuilder ans = new StringBuilder();
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			if(ch != '(' && ch != ')') {
				ans.append(s.charAt(i));
			}
		}
		return ans.toString();
	}

}
