package org.coding.santosh.InterviewBit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MaxSumContiguousSubArray {
public static int MaxSumContiguous(ArrayList<Integer> arr)
{
//	int max = arr.stream().collect(Collectors.summarizingInt(Integer::intValue)).getMax();
	int local_sum=0,sum=0;
	for(int i = 1 ; i < arr.size() ; i++)
	{
		for(int j = 0;j < arr.size(); j++)
		{
			local_sum = 0;
			for(int k = j ,counter = 0; counter < i && k < arr.size() ; k++,counter++)
			{
			local_sum=local_sum+arr.get(k);
			}
			if(local_sum > sum)
			{
				sum=local_sum;
			}
		}
	}
	return sum;	
}

public static int returnMax(List<Integer> arr)
{
	int ans=Integer.MIN_VALUE;
	for(Integer x : arr)
	{
		ans=x>ans?x:ans;
	}
	return ans;
}
public static int MaxSumContiguousKadaneAlgorithm(ArrayList<Integer> arr)
{
	
	boolean positiveflag=false;
	for(Integer x : arr)
	{
		if(x>0)
		{
			positiveflag=true;
			break;
		}
	}
	if(positiveflag)
	{
	int sum=0,ans=0;
	for(int i = 1 ; i < arr.size() ; i++)
	{
		if(sum+arr.get(i)>0)
			sum=sum+arr.get(i);
		else
			sum=0;
		ans = sum > ans ? sum : ans;
	}
	return ans;	
	}
	else
	{
		return arr.stream().collect(Collectors.summarizingInt(Integer::intValue)).getMax();
	}
}


public static void main(String arg[])
{
	Scanner s = new Scanner(System.in);
	ArrayList<Integer> arr = new ArrayList<Integer>();
	while(s.hasNext())
	{
		arr.add(s.nextInt());
	}
	s.close();
	int result = MaxSumContiguousKadaneAlgorithm(arr);
	System.out.println("Maximum Sum in contiguous sub array is "+result);
}
}
