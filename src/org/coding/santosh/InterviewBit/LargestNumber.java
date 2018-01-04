package org.coding.santosh.InterviewBit;


//Given a list of non negative integers, arrange them such that they form the largest number.
//
//For example:
//
//Given [3, 30, 34, 5, 9], the largest formed number is 9534330.
//
//Note: The result may be very large, so you need to return a string instead of an integer.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner s = new Scanner(System.in);
		List<Integer> arr =  new ArrayList<Integer>();
		arr.add(472);
		arr.add(663);
		arr.add(964);
		arr.add(722);
		arr.add(485);
		arr.add(852);
		arr.add(635);
		arr.add(4);
		arr.add(368);
		arr.add(676);
		arr.add(319);
		arr.add(412);
		//arr.add(0);
		//arr.add(9999);
		//arr.add(9998);
	//	arr.add(0);
		/*while(s.hasNext())
		{
			arr.add(s.nextInt());
		}*/
		System.out.println(PrintLargestNumber(arr));
	}
	
	public static void Append1(StringBuilder res, String y)
	{
		if((res.toString()+y).compareTo(y+res.toString()) > 0)
			 res.append(y);
		else
			res.insert( 0, y);
	}
	
	
	public static  String PrintLargestNumber(List<Integer> A)
	{	
		Collections.sort(A,new Comparator<Integer>() {
			  public int compare(Integer o1, Integer o2) {
				    String s1 = o1.toString();
				    String s2 = o2.toString();
				    return (s2+s1).compareTo(s1+s2);
				  }});
		
		StringBuilder res = new StringBuilder();
		if(A.size() == 0 )
			return "0";
		
		for(Integer x : A)
			res.append(x);
		for(char x : res.toString().toCharArray())
		{
		if(x>'0')
			return res.toString().trim();
		}
		return "0";	
	}
}
