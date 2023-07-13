package myproject;

public class Nthroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		int m = 9;
		System.out.println(nroot(n, m));

	}

	static int nroot(int n, int m) {
		int low = 1;
		int high = m;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (power(mid, n) == m) {
				return mid;
			} else if (power(mid, n) > m) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}
		return -1;

	}

	static int power(int mid, int n) {
		return (int) Math.pow(mid, n);
	}

}
