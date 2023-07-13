package myproject;
import java.util.*;
public class TwoD_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        int[][]arr=new int[3][4];
        for(int row=0;row<3;row++) {
        	for(int col=0;col<4;col++) {
        		arr[row][col]=in.nextInt();
        	}
        }
        for(int i=0;i<3;i++) {
        	for(int j=0;j<4;j++) {
        		System.out.print(arr[i][j]+ " ");
        	}
        	System.out.println();
        }
        in.close();
	}

}
