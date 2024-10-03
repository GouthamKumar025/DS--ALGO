package com.tcsnqt.Strings;

import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "listen";
        String str2 = "silent";
        if(isAnagram(str1,str2)) {
        	System.out.println("Both are anagram of each other");
        }
        else {
        	System.out.println("Not anagrams");
        }
	}
	
	public static boolean isAnagram(String str1, String str2) {
		if(str1.length()!=str2.length()){
			return false;
		}
		HashMap<Character,Integer>countMap = new HashMap<>();
		
		for(char ch: str1.toCharArray()) {
			countMap.put(ch, countMap.getOrDefault(ch,0) + 1);
		}
		
		for(char ch: str2.toCharArray()) {
			if(!countMap.containsKey(ch)) {
				return false;
			}
			countMap.put(ch, countMap.get(ch) - 1);
			
			if(countMap.get(ch) == 0) {
				countMap.remove(ch);
			}
		}
		
		return countMap.isEmpty();
		
	}

}
