package myproject;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		/**
		 * int max=a; if(b>max) { max=b; }if(c>max) { max=c; }
		 **/
		int max = Math.max(c, Math.max(a, b));
		System.out.println(max);
		sc.close();

	}

}
