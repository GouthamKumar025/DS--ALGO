package com.tcsnqt.Strings;

public class CountingVowelsConsonantsAndWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Take u forward is Awesome";
		countConditions(str);
	}

	public static void countConditions(String s) {
		String str = s.toLowerCase();
		int vol_count = 0;
		int cons_count = 0;
		int space = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vol_count++;
			}
			else if(Character.isLetter(ch)) {
				cons_count++;
			}
			else if(ch == ' ') {
				space++;
			}
		}
		System.out.println("vol_count " + vol_count);
		System.out.println("cons_count " + cons_count);
		System.out.println("space " + space);
	}

}
