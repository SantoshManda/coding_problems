package org.coding.santosh.InterviewBit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*Given an integer array, find if an integer p exists in the array such that the number of integers greater than p in the array equals to p
If such an integer is found return 1 else return -1.*/
public class NobleInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A = new ArrayList<Integer> ();
		A.add(5);
		A.add(6);
		A.add(2);
		
		//A.add(5);
		//A.add(5);
		System.out.println(solve(A));
	}
	
	public static int solve(ArrayList<Integer> A) {
		if(A.size()==0)
			return -1;
	
		Collections.sort(A,Comparator.naturalOrder());
		 int n = A.size();
	        for (int i=0; i<n-1; i++)
	        {
	            if (A.get(i) == A.get(i+1))
	                continue;
	 
	            // In case of duplicates, we
	            // reach last occurrence here.
	            if (A.get(i) == n-i-1)
	                return 1;
	        }
	 
	        if (A.get(n-1) == 0)
	            return 1;
	 
	        return -1;    

}}
