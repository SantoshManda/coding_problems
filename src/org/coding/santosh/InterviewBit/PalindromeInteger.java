package org.coding.santosh.InterviewBit;

public class PalindromeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(123));
	}
	
	public static int isPalindrome(int A)
	{
		long x = A;
		long return_value = 0;
		int remainder = 0;
	//	StringBuffer result = new StringBuffer();
		if(x > Integer.MAX_VALUE || x < 0)
			return 1;
		else
		{
			
			if(A>=0 && A < 10)
				return 1;
			
		//	A = Math.abs(A);
		
		while(A>0)
		{
			remainder = A%10;
			return_value = 10*return_value + remainder;
			A=A/10;
		}
		}
		//return_value = Long.parseLong(result.toString());
		if(return_value > Integer.MAX_VALUE )
		return 0;
		else
			return return_value == x ? 1 : 0;
	}

}
