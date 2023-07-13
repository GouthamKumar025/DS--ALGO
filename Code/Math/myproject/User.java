package myproject;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int max = 0;
		while (true) {
			int n = in.nextInt();
			if (n == 0) {
				break;
			}
			if (n > max) {
				max = n;
			}
		}
		System.out.println(max);
		in.close();
	}

}
