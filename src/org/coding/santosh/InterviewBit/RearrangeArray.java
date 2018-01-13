package org.coding.santosh.InterviewBit;

import java.util.List;

public class RearrangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
// increment array by (A[A[i]]%n)*n then array will have both old and new value divide by n to get new value and %n to get old value
/*Given a number as

	   A = B + C * N   if ( B, C < N )
	   A % N = B
	   A / N = C*/
	public static List<Integer> reverse(List<Integer> A)
	{
		if(A.size()<=1)
			return A;
		int n = A.size();
		for(int i = 0 ; i < A.size(); i++)
		{
		A.set(i,A.get(i)+(A.get(A.get(i))%n)*n);	
		}
		for(int i = 0 ; i < A.size(); i++)
		{
		A.set(i,A.get(i)/n);	
		}
		return A;
	}	
}
