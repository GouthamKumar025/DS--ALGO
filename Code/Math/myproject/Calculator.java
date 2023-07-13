package myproject;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int ans = 0;
		while (true) {
			System.out.println("Enter the Operator");
			char ch = in.next().trim().charAt(0);
			if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
				System.out.println("Enter two numbers");
				int num1 = in.nextInt();
				int num2 = in.nextInt();
				if (ch == '+') {
					ans = num1 + num2;
				}
				if (ch == '-') {
					ans = num1 - num2;
				}
				if (ch == '*') {
					ans = num1 * num2;
				}
				if (ch == '/') {
					if (num2 != 0) {
						ans = num1 / num2;
					}
				}
				if (ch == '%') {
					ans = num1 % num2;
				}
				System.out.println(ans);
			} else if (ch == 'x' || ch == 'X') {
				break;
			} else {
				System.out.println("Invalid Operator Specified");
			}

		}
		in.close();
	}

}
