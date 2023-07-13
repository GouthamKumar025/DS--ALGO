package myproject;
import java.util.*;
public class Search_in_TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][]arr= {
        		{12,36,47},
        		{7,18,52,37},
        		{4,9,28,44}
        		};
        int target=52;
        int[]ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
      }
	static int[] search(int[][]a,int target) {
		
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
				if(a[row][col]==target) {
					return new int[] {row,col};
				}
			}
		}
		return new int[] {-1,-1};
	}
}