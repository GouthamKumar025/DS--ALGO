package myproject;

import java.io.*;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, 1, 4, 6, 5 };
		int n = arr.length;
		System.out.println(triplet(arr, n));
	}

	static boolean triplet(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					int x = arr[i] * arr[i];
					int y = arr[j] * arr[j];
					int z = arr[k] * arr[k];
					if (x == y + z || y == x + z || z == x + y)
						return true;
				}
			}
		}
		return false;
	}

}
