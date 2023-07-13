package myproject;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(2, 3, 5, 7, 9, 4, 6, 1, 8, 7);

	}

	static void fun(int... y) {
		System.out.println(Arrays.toString(y));

	}

}
