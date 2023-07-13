package myproject;
import java.util.*;
public class Maximum_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        int[]arr=new int[5];
        for(int i=0;i<arr.length;i++) {
        	arr[i]=in.nextInt();
        }
        for(int n:arr) {
        	System.out.println(n);
        }
        int max=arr[0];
        for(int i=1;i<arr.length;i++) {        	
        	if(arr[i]>max) {
        		max=arr[i];
        	}
        }
        System.out.println("The Max Element is "+ max);
	}

}
