package myproject;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int factorial = 1;
		int n = in.nextInt();
		if (n != 0) {
			for (int i = 1; i <= n; i++) {
				factorial *= i;
			}
		} else {
			factorial = 1;
		}
		System.out.println(factorial);
	}
}
