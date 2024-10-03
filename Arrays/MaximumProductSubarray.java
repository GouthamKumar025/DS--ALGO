package com.tcsnqt.Arrays;

import java.util.Arrays;

public class MaximumProductSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,-3,0,-4,-5};
		int n = arr.length;
		System.out.println(findmaxsubarray(arr,n));
	}
	
	public static int findmaxsubarray(int[]arr,int n) {
		int pref = 1, suff = 1;
		int ans = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				pref = 1;
				suff = 1;
			}
			pref = pref * arr[i];
			suff = suff * arr[n-i-1];
			ans = Math.max(ans, Math.max(pref, suff));
		}
		return ans;

	}

}
