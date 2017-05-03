package com.coding.problems;

import java.util.HashMap;

public class NumberOnlyOnceInArray {

	public static HashMap<Integer,Integer> map;
	NumberOnlyOnceInArray()
	{
		map = new HashMap<Integer,Integer>();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int [] arr = {3,3,3,4,4,4,5};
  
  int count = ReturnValueBitWise(arr,3);//ReturnValue(arr);
  if(count >= 0)
  System.out.println("The Element Repeating only once is "+count);
  else
	  System.out.println("No element occurs only once in the given array");
  //int x = 5 & 1;
  //System.out.println(x);
	}

	public static int ReturnValue(int [] arr)
	{
		int i, count = 0;
		map = new HashMap<Integer,Integer>();
		Integer val;
		for(i=0;i< arr.length; i++)
		{
			val = new Integer(arr[i]);
			if(i==0)
				map.put(val, 1);
			else
			{
				if(map.containsKey(val))
				{
					count = map.get(val);
					map.put(val, count+1);
				}
				else
					map.put(val, 1);
			}
		}
		for (Integer k : map.keySet())
		{
			if(map.get(k) == 1)
				return k.intValue();
		}
		return -5;
	}
	
	public static int ReturnValueBitWise(int [] arr , int N)
	{
		int [] bitarray = new int[32];
		int bitsum = 0;
		int uniqueValue = 0;
		for (int i = 0 ; i < arr.length ; i++)
		{
			for(int k = 0 ; k < 32 ; k++)
			{
				bitsum = 1 << k ;
				if((arr[i]&bitsum) == bitsum)
				{
					bitarray[k]++;
				}
			}
		}
		
		for(int i = 0 ; i < 32 ; i++)
		{
			bitarray[i]= bitarray[i] % N;
			if(bitarray[i] == 1)
			uniqueValue = uniqueValue | (1 << i);
		}
		return uniqueValue;
	}
}
