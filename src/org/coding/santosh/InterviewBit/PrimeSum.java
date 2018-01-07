package org.coding.santosh.InterviewBit;

import java.util.ArrayList;

public class PrimeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(primeSum(100));
	}
	
	public static boolean isPrime(int A) {
        if(A<=1)
        return false;
        for(int i = 2 ; i <= (int)Math.sqrt(A); i++)
        {
            if(i<A && A%i==0)
            return false;
        }
        return true;
    }

	public static ArrayList<Integer> primeSum(int A)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(A%2!=0)
			return result;
		else
		{
			for(int i = 2 ; i < A ; i++)
			{
				if(i%2!=0 || i == 2)
				{
					if(isPrime(i)&&isPrime(A-i))
					{
						result.add(i);
						result.add(A-i);
						break;
					}
				}
			}
		}
		return result;
	}
}
