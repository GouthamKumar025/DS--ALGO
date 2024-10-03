package com.tcsnqt.Numbers;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		System.out.println(isPrime(n));
	
	}
	
	static boolean isPrime(int n) {

        // Numbers less than or equal to 1 are not prime
        if (n <= 1)
            return false;

        // Check divisibility from 2 to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) 
                return false;

        // If no divisors were found, n is prime
        return true;
    }

}
