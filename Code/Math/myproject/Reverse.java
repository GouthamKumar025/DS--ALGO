package myproject;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 25647;
		int ans = 0;
		while (num > 0) {
			int rem = num % 10;
			num = num / 10;

			ans = ans * 10 + rem;
		}
		System.out.println(ans);
	}

}
