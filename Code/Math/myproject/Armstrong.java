package myproject;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		System.out.println(armstrongNo(a));
		for (int i = 100; i < 1000; i++) {
			if (armstrongNo(i)) {
				System.out.println(i); // printing all the 3-digit armstrong numbers
			}
		}
	}

	static boolean armstrongNo(int a) {
		int original_number = a;
		int sum = 0;
		while (a > 0) {
			int rem = a % 10;
			int cube = rem * rem * rem;
			sum += cube;
			a = a / 10;
		}
		return original_number == sum;

	}

}
