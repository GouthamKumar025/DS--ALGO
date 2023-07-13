package myproject;

public class CountOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 45323135;
		int count = 0;
		while (n > 0) {
			int rem = n % 10;
			if (rem == 3) {
				count++;
			}
			n = n / 10;
		}
		System.out.println(count);

	}

}
