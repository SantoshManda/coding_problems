package org.coding.santosh.InterviewBit;
/*Given an integer n, write a function that returns count of trailing zeroes in n!.

Examples:
Input: n = 5
Output: 1 
Factorial of 5 is 20 which has one trailing 0.

Input: n = 20
Output: 4
Factorial of 20 is 2432902008176640000 which has
4 trailing zeroes.

Input: n = 100
Output: 24*/

public class TrailingZeroesInFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(NumberOfTrailingZeroesFactorial(100));
	}
	/*Trailing 0s in n! = Count of 5s in prime factors of n!
            = floor(n/5) + floor(n/25) + floor(n/125) + ....*/
	public static int NumberOfTrailingZeroesFactorial(int A)
	{
		// Initialize result
        int count = 0;
 
        // Keep dividing n by powers of 5 and update count
        for (int i=5; A/i>=1; i *= 5)
            count += A/i;
 
        return count;
	}

}
