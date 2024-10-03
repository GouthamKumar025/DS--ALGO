package com.tcsnqt.Strings;

public class FrequencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "takeuforward";
		
		int freq[] = new int[26];
		
		for(int i=0;i<str.length();i++) {
			freq[str.charAt(i) - 'a']++; 
		}
		for(int i=0;i<26;i++) {
			if(freq[i]!=0) {
				System.out.print((char) (i + 'a'));
				System.out.print(freq[i] + " ");
			}
		}

	}

}
