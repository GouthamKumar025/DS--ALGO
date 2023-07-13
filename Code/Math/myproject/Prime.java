package myproject;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(isPrime(n));
	}
	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		int a=2;
		while(a*a<=n) {
			if(n%a==0) {
				return false;
			}
			a++;
		}
		return a*a>n;
	}

}
