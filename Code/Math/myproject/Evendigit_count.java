package myproject;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
import java.util.*;
public class Evendigit_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {12,345,2,6,7896};
		System.out.println(even(arr));

	}
	static int even(int[]nums) {
		int count=0;
		for(int num:nums) {
			while(num>0) {
				count++;
				num/=10;
			}
		}
		return count;
	}

}
