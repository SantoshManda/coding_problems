package org.coding.santosh.InterviewBit;
/*Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.

Sample Input:

[3 4 1 4 1]

Sample Output:

1

If there are multiple possible answers ( like in the sample case above ), output any one.*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> A = new ArrayList<Integer> ();	
		A.add(3);
		A.add(4);
		A.add(1);
		A.add(-4);
		A.add(1);
		System.out.println(ArrayDuplicate(A));
	}
	
	
	
	public static int ArrayDuplicate(List<Integer> A)
	{
		if(A.size()==0)
			return -1;
		HashMap<Integer,Integer> result = new HashMap<Integer,Integer>();
		
		for(int i = 0 ; i < A.size(); i++)
		{
			if(!result.containsKey(A.get(i)))
			{
				result.put(A.get(i),1);
			}
			else
				return A.get(i);
		}
		
		return -1;
	}

}
