package org.coding.santosh;
import java.util.ArrayList;
public class MaxSubStringKCharecter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aabbbbbbbbbcccccccxxxxxxxyyyyyyyyzzzzzzzz";
		//String s = "zzz";
		//ArrayList<String> res = MaxSubString(s,2);
		//for (String r : res)
		//	System.out.println(r);
		String k = MaxSubString_new(s,3);
		System.out.println(k);
	}
	public static StringBuilder delete(StringBuilder s)
	{
		int count = 0;
		char[] arr = s.toString().toCharArray();
		char x = arr[0];
		for(int i = 0 ; i < s.length() ; i++ )
		{
			count++;
			if (x != arr[i])
				break;
		}
		s.delete(0, count);
		return s;
	}
	public static String MaxSubString_new(String x , int k)
	{
		int shift = 0 , window_length = 0;;
		StringBuilder s = new StringBuilder();
		StringBuilder result = new StringBuilder();
		int len = x.length();
		char[] arr = x.toCharArray();
		for (int i = 0 ; i < len ; i++)
		{
			s.append(arr[i]);
			if(shift >= 1 && k > 1)
			{
				if(i!=0)
				{
					if(arr[i] != arr[i-1])
					{
						shift++;
						if(window_length == 0)
						{
						window_length = s.length();
						result.append(s.toString());
						}
						else
						{
						if(s.length() > window_length)
						{
							window_length = s.length();
							result.delete(0, result.length()-1);
							result.append(s.toString());
						}
						}
						s = delete(s);
					}
				}
			}
			else{
				if(i!=0)
				{
					if(arr[i]!=arr[i-1])
					{
						shift++;
					}
				}
			}
		}
	return result.toString();
	}
	
	
	
	
	public static ArrayList<String> MaxSubString(String x , int k)
	{
		if (x == null || x == "")
			return null;
		
		int uc = 1,count = 0,count_prev = 0;
		ArrayList<String> result = new ArrayList<String>();
		StringBuilder str = new StringBuilder();
		char[] arr = x.toCharArray();
		for (int i = 0 ; i < x.length() ; i++)
		{
			if(uc <= k)
			{
				if(i == 0 )
				{
					str.append(arr[i]);
				}	else
					{
				if(arr[i] == arr[i-1])
				{
					count++;
					str.append(arr[i]);
				}
					
				else
				{	
					count_prev = count;
					count = 0;
					str.append(arr[i]);
					uc++;
				}
				}
			}
			else
			{
		       	result.add(str.toString());
		       	if (str != null ){
		       		if(i+count <= x.length()-1)
		       			str.delete(0, count_prev);
		       	}
				uc = 1;
				count_prev = count;
				count = 0;
				
			}
		}
		 result.add(str.toString());
		 return result;
	}
}
