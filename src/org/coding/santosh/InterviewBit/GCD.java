package org.coding.santosh.InterviewBit;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(gcd_recursive(0,9));
	}
	
/*	Given 2 non negative integers m and n, find gcd(m, n)

	GCD of 2 integers m and n is defined as the greatest integer g such that g is a divisor of both m and n.
	Both m and n fit in a 32 bit signed integer.

	Example

	m : 6
	n : 9

	GCD(m, n) : 3 */

	  public static int gcd_recursive(int A, int B) {
	         if(A==0)
	        return B;
	    else
	return gcd_recursive(B%A, A);
	    }
	
	public static int gcd_iterative(int A,int B)
	{
		int x= 0, y = 0 , temp = 0;
		if(A==0||B==0)
			return 0;
		else if(A==B)
			return A;
		else
		{
			if(A>B)
			{
				x=A;y=B;
			}
			else 
			{
				x=B;y=A;
			}
			
			while(x>0)
			{
				if(x%y==0)
					break;
				else
				{
					temp = x;
					y = x%y;
					x = temp;
				}		
			}
			return y;
		}
	}
}
