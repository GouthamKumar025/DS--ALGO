package myproject;
import java.util.*;
public class Reversing_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]arr= {2,6,1,8,3};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
	}
	static void reverse(int[]arr) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			swap(arr,start,end);
			start++;
			end--;
		}
	}
	static void swap(int[]arr,int index_1,int index_2) {
		int temp=arr[index_1];
		arr[index_1]=arr[index_2];
		arr[index_2]=temp;
	}

}
