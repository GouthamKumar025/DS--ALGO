package myproject;

import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // obtaining the size of the array
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		int target = in.nextInt(); // the element need to be found or searched
		int ans = linearSearch(arr, target);
		System.out.println(ans);
		in.close();
	}

	static int linearSearch(int[] arr, int target) {
		if (arr.length == 0) {
			System.out.println(-1);
		}
		for (int index = 0; index < arr.length; index++) {
			int solution = arr[index];
			if (solution == target) {
				return index;
			}
		}
		return -1;
	}

}
