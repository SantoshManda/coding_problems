package org.coding.santosh.InterviewBit;
/*Given an input string, reverse the string word by word.

Example:

Given s = "the sky is blue",

return "blue is sky the".

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.*/
public class StringReversalWordWise {
	
	public static void main(String[] args)
	{
		String A = "the sky is blue";
		System.out.println(reverse(A));
	}
	public static String reverse(String A)
	{
		A = A.trim().replaceAll("\\s{2,}", " ");
		StringBuffer result = new StringBuffer();
		String[] arr = A.split(" ");
		for(int i = arr.length-1;i>=0;i--)
			{
			result.append(arr[i]);
			if(i!=0) result.append(" ");
			}
		return result.toString();
	}

}
