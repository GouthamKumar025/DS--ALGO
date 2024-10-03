package com.tcsnqt.Arrays;

import java.util.HashMap;
import java.util.Map;

public class FindingNonRepeatedElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 2, 3, 4, 4, 5, 2 };
		int n = arr.length;
		HashMap<Integer,Integer>countMap = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(countMap.containsKey(arr[i])){
				countMap.put(arr[i], countMap.get(arr[i]) + 1);
			}
			else {
				countMap.put(arr[i], 1);
			}
		}
		
		for(Map.Entry<Integer,Integer>entry : countMap.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.print(entry.getKey() + " ");
			}
		}
	}

}
