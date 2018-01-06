package org.coding.santosh.HackerEarth;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.OptionalInt;

public class MinimumNumber {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(new File("D:\\data_files\\input2.txt"));
		ArrayList<ArrayList<Integer>> parameter_list = new  ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> input = new  ArrayList<ArrayList<Integer>>();
		int num_test_cases = Integer.parseInt(s.nextLine());
		for(int i = 1 ; i <= num_test_cases;i++)
		{
			String[] parameters = s.nextLine().split(" "); 
			String[] inputs = s.nextLine().split(" ");
			ArrayList<Integer> temp_param = new ArrayList<Integer>();
			ArrayList<Integer> temp_input = new ArrayList<Integer>();
			for(String x : parameters)
			{
				temp_param.add(Integer.parseInt(x));
			}
			for(String x : inputs)
			{
				temp_input.add(Integer.parseInt(x));
			}
			parameter_list.add(temp_param);
			input.add(temp_input);
		}
		
		for(int i = 0 ; i < num_test_cases ; i++)
		{
			ArrayList<Integer> param = parameter_list.get(i);
			ArrayList<Integer> input_list = input.get(i);
			ArrayList<Integer> result_list = new ArrayList<Integer>();
			int size = param.get(0);
			int num_segments = param.get(1);
			int Q = param.get(2);
			if(size >= num_segments)
			{
				if(size%num_segments==0)
				{
					for(int j = 0 ; j < size ; j=j+size/num_segments)
					{
						result_list.add(findMax(input_list,j,j+size/num_segments));
					}
					OptionalInt min = result_list.stream().mapToInt(x ->x).min();
					if(min.getAsInt()<Q)
						System.out.println(min.getAsInt());
					else
						System.out.println("NO");
				}
				else
				{
					for(int j = 0 ; j <num_segments ; j=j+size/num_segments)
					{
						if(j==num_segments-(size/num_segments))
							result_list.add(findMax(input_list,j,size));
						else
							result_list.add(findMax(input_list,j,j+size/num_segments));
					}
					OptionalInt min = result_list.stream().mapToInt(x ->x).min();
					if(min.getAsInt()<Q)
						System.out.println(min.getAsInt());
					else
						System.out.println("NO");
				}
			}
			else
			{
				System.out.println("NO");
			}
		}
		
	}

	private static Integer findMax(ArrayList<Integer> A,int i, int j) {
		int result=Integer.MIN_VALUE;
		if(j > A.size()-1)
		{
			j = A.size()-1;
			for(int x = i ; x <= j  ; x++)
			{
				result = A.get(x)>result?A.get(x):result;
			}
			return result;
		}
		else
		{
			for(int x = i ; x < j  ; x++)
			{
				result = A.get(x)>result?A.get(x):result;
			}
		}
		// TODO Auto-generated method stub
		return result;
	}
}
