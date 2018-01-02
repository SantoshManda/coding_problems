package org.coding.santosh.InterviewBit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class RepeatingAndMissingNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr =  new ArrayList<Integer>();
		List<Integer> result =  new ArrayList<Integer>();
		arr.add(3);
		arr.add(1);
		arr.add(2);
		arr.add(5);
		arr.add(3);
		result = RepeatingMissingArrayEquation(arr);
		for(Integer x : result)
		{
			System.out.println(x);
		}
	}

	public static List<Integer> RepeatingMissingArrayEquation(final List<Integer> A)
	{
		int size = A.size();
		int repeating_number = 0;
		int missing_number =0;
		long sum = 0; 
		long sum_squares = 0;
		long array_sum = A.stream().mapToLong(p -> p).sum();
		sum = (long) ((Math.pow(size,2)+size)/2);
		long diff = array_sum-sum;
		long array_square = A.stream().mapToLong(p -> p*p).sum();
		sum_squares = (long) ((long) (2*(Math.pow(size, 3))+3*(Math.pow(size, 2))+size)/6);
		long diff_sqr =  array_square - sum_squares;
		long sum_arr = diff_sqr/diff;
		repeating_number = (int) (sum_arr+diff)/2;
		missing_number = (int) (repeating_number-diff);
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(repeating_number);
		result.add(missing_number);
		return result;
	}
	public static List<Integer> RepeatingMissingArray(final List<Integer> A)
	{
		int Repeating_value = Integer.MIN_VALUE;
		Integer missing_value = Integer.MIN_VALUE;
		ArrayList<Integer> result = new ArrayList<Integer>();
		HashMap<Integer, Integer> counters = new HashMap<Integer,Integer>();
		//boolean found = false;
		//int index = 0;
		Collections.sort(A,Comparator.naturalOrder());
		for(Integer x : A)
		{
			if(counters!=null)
			{
			if(counters.containsKey(x))
				counters.put(x, 2);
			else
				counters.put(x,1);
			}
			else
				counters.put(x, 1);
		}
		//HashMap<Integer, Long> counters = (HashMap) A.stream().collect(Collectors.groupingBy(p -> p, 
		  //       Collectors.counting()));
		for(Integer x : counters.keySet())
		{
		//	index++;
		if(counters.get(x)==2)
		{
		Repeating_value = x;
		break;
		}
		}
		
	//	counters.remove(Repeating_value);
		//missing_value=counters.keySet().stream().max(Integer::compareTo).orElse(0);
		counters.clear();
		for(int i = 1; i < A.size()-1; i++)
		{
			
					if(A.get(i+1)==A.get(i))
					{
						if(A.get(i)-A.get(i-1)>1)
						{
							missing_value = A.get(i-1)+1;
							break;
						}
						else if((i+2)!= A.size() && A.get(i+2)-A.get(i+1)>1)
						{
							missing_value = A.get(i+1)+1;
							break;
						}
					}
			
		}
		result.add(Repeating_value);
		result.add(missing_value);
		return result;
		}
}

