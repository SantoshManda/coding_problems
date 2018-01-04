package org.coding.santosh.InterviewBit;



/*Given a positive integer N, print all the integers from 1 to N. But for multiples of 3 print “Fizz” instead of the number and for the multiples of 5 print “Buzz”. Also for number which are multiple of 3 and 5, prints “FizzBuzz”.

Example

N = 5
Return: [1 2 Fizz 4 Buzz]

Note: Instead of printing the answer, you have to return it as list of strings.
*/
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		List<String> result = new ArrayList<String>();	
		result =  print(1000000);
		System.out.println(result);
	}
	
	public static List<String> print(int A)
	{
		if(A <= 0 )
			return null;
		if( A == 1 || A == 2)
			return null;
		ArrayList<String> result = new ArrayList<String>();
		//boolean r3=false,r5=false;
		String temp = "";
		for(int i = 1; i <= A; i++)
		{
			temp = "";
		//	r3=false;
		//	r5=false;
			
			switch(i % 15) {
		       case 0:    
		           temp="FizzBuzz";
		           break;
		       case 3: case 6: case 9: case 12:
		           temp="Fizz";
		           break;
		       case 5: case 10:
		           temp="Buzz";
		           break;
		       default:
		    	   temp=String.valueOf(i);break;
		    }
//			if( i == 1 || i == 2)
//				{result.add(String.valueOf(i));continue;}
//			
//			if( i%3 == 0)
//			{
//				temp="Fizz";
//				r3=true;
//			}
//			if(i%5 == 0)
//			{
//				temp="Buzz";
//				r5=true;
//			}
//			if(r3 && r5)
//			{
//				temp="FizzBuzz";
//			}
//			if(!r3 && !r5)
//			{
//				temp = String.valueOf(i);
//			}
			result.add(temp);
		}
		return result;
	}

}
