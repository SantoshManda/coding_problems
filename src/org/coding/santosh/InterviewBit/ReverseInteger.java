package org.coding.santosh.InterviewBit;
/*Reverse digits of an integer.

Example1:

x = 123,

return 321
Example2:

x = -123,

return -321

Return 0 if the result overflows and does not fit in a 32 bit signed integer*/
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub2147483647
		System.out.println(reverseInteger(5));
	}
	
	public static int reverseInteger(int A)
	{
		long x = A;
		long return_value = 0;
		StringBuffer result = new StringBuffer();
		if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE)
			return 0;
		else
		{
			
			if(A < 0)
				result.append("-");
			if(A==0)
				return A;
			
			A = Math.abs(A);
		
		while(A>0)
		{
			result.append(A%10);
			A=A/10;
		}
		}
		return_value = Long.parseLong(result.toString());
		if(return_value > Integer.MAX_VALUE || return_value < Integer.MIN_VALUE )
		return 0;
		else
			return Integer.parseInt(result.toString());
	}

}
