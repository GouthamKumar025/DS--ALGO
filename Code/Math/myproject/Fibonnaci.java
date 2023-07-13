package myproject;

import java.util.Scanner;

public class Fibonnaci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = 0;
		int q = 1;
		int count = 2;
		while (count <= n) {
			int temp = q;
			q = p + q;
			p = temp;
			count++;
		}
		System.out.println(q);
		in.close();
	}

}
