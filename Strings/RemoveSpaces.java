package com.tcsnqt.Strings;

public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "take u forward";
		System.out.println(removeSpaces(str));
	}

	public static String removeSpaces(String str) {
		return str.replaceAll("\\s+", "");

	}

}
