package myproject;

import java.util.Scanner;

public class CaseCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		char ch = in.next().trim().charAt(0);
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("Lowercase");
		} else {
			System.out.println("Uppercase");
		}
		in.close();

	}

}
