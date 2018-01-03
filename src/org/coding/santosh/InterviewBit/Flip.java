package org.coding.santosh.InterviewBit;

import java.util.ArrayList;
import java.util.List;
//You are given a binary string(i.e. with characters 0 and 1) S consisting of characters S1, S2, …, SN. In a single operation, you can choose two indices L and R such that 1 ≤ L ≤ R ≤ N and flip the characters SL, SL+1, …, SR. By flipping, we mean change character 0 to 1 and vice-versa.
//
//Your aim is to perform ATMOST one operation such that in final string number of 1s is maximised. If you don’t want to perform the operation, return an empty array. Else, return an array consisting of two elements denoting L and R. If there are multiple solutions, return the lexicographically smallest pair of L and R.
//
//Notes:
//
//    Pair (a, b) is lexicographically smaller than pair (c, d) if a < c or, if a == c and b < d.
//
//For example,
//
//S = 010
//
//Pair of [L, R] | Final string
//_______________|_____________
//[1 1]          | 110
//[1 2]          | 100
//[1 3]          | 101
//[2 2]          | 000
//[2 3]          | 001
//
//We see that two pairs [1, 1] and [1, 3] give same number of 1s in final string. So, we return [1, 1].
//
//Another example,
//
//If S = 111
//
//No operation can give us more than three 1s in final string. So, we return empty array [].
//

public class Flip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> result = new ArrayList<Integer>();
		result =  count("0000");
		System.out.println(result);
	}

	public static List<Integer> count(String A)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		ArrayList<Integer> temp_array = new ArrayList<Integer>();
		
		
		for(int i = 0 ; i < A.length(); i++)
		{
			if(A.charAt(i)=='0')
			{
				temp_array.add(i,1);
			}
			else
			{
				temp_array.add(i,-1);
			}
		}
		
		int left = 0; 
		int left_ans = 0;
		int right_ans = 0;
		int cumulative_sum = 0;
		int max_sum=Integer.MIN_VALUE;
		
		for(int i = 0 ; i < A.length(); i++)
		{
			cumulative_sum += temp_array.get(i);
			
			if(cumulative_sum<0)
			{
				left = i+1;
				cumulative_sum = 0;
			}
			else if(cumulative_sum>max_sum)
			{
				left_ans=left;
				right_ans=i;
				max_sum=cumulative_sum;
			}
		}
			if(max_sum <= 0)
				return result;
			else
			{
				result.add(left_ans+1);
				result.add(right_ans+1);
			}
		
		return result;
	}
	public static List<Integer> flipCalculator(String A)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		//HashMap<String,Integer> decision_table = new HashMap<String,Integer>();
		
		int counter = 0;
		if(A.length()==0)
		return null;
		int[][] decision_table = new int[A.length()][A.length()];
		if(count(A,0,A.length()-1,'1')==A.length())
			return result;
		else
		{
			int max_value = 0;
			for(int i = 0 ; i < A.length() ; i++)
			{
				for(int j = 0 ; j < A.length();j++)
				{
					if(i<=j)
					{
					if(i==j && i == 0)
						counter = (A.charAt(i) == '0' ? 1 : 0) + count(A,1,A.length()-1,'1');
					else if (i==j && i == A.length())
						counter = count(A,0,A.length()-2,'1')+(A.charAt(i) == '0' ? 1 : 0); 
					else if(i==j)
						counter = count(A,0,i-1,'1')+(A.charAt(i) == '0' ? 1 : 0)+count(A,i+1,A.length()-1,'1');
					else 
					{
						if(i>0&&j<A.length()-1)
						counter = count(A,0,i-1,'1')+count(A,i,j,'0')+count(A,j+1,A.length()-1,'1');
						else if(i==0&&j<A.length()-1)
						counter = count(A,0,j,'0')+count(A,j+1,A.length()-1,'1');
						else if(i>0&&j==A.length()-1)
						counter = count(A,0,i-1,'1')+count(A,i,j,'0');
						else
						counter = count(A,0,A.length()-1,'0');	
					}
					decision_table[i][j]= counter;
					max_value=max_value > decision_table[i][j]?max_value:decision_table[i][j];
					}
				}
			}
			
			for(int i = 0 ; i < A.length() ; i++)
			{
				for(int j = 0 ; j < A.length();j++)
				{
					if(decision_table[i][j]==max_value)
					{
						result.add(i+1);
						result.add(j+1);
						return result;
					}
				}
			}
				
			return result;
		}
	}
	public static int count(String A,int x,int y , char z)
	{
		int counter = 0;
		if(x==y) return (A.charAt(x) == z ? 1 : 0);
		for(int i = x ; i <= y ; i++)
		{
			if(A.charAt(i)==z)
			{
				counter++;
			}
		}
		return counter;
	}
}
