package org.coding.santosh.InterviewBit;



/*Given a non-negative number represented as an array of digits,

add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

Example:

If the vector has [1, 2, 3]

the returned vector should be [1, 2, 4]

as 123 + 1 = 124.

    NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer.
    For example, for this problem, following are some good questions to ask :

        Q : Can the input have 0’s before the most significant digit. Or in other words, is 0 1 2 3 a valid input?

        A : For the purpose of this question, YES
        Q : Can the output have 0’s before the most significant digit? Or in other words, is 0 1 2 4 a valid output?
        A : For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.

*/
import java.util.ArrayList;
import java.util.Iterator;

public class AddOneToNumber {

    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		 boolean carry = false;
		 
		 ArrayList<Integer> result = new ArrayList<Integer> ();
		 if(A.size() == 0){
			 result.add(1);
	    }
	 	else
	 	{
		 for(int i = A.size()-1 ; i >=0 ; i--)
		 {
			 if(A.get(i) < 0 || A.get(i) > 9)
			 {
				 System.out.println("Invalid Input");
				 return result;
			 }
			 else if(A.get(i) == 9)
			 {
				 if (carry)
				 {
				  carry=true;
				  A.set(i,0);
				 }
				 else if(i==A.size()-1)
				 {
					 carry=true;
					 A.set(i,0);
				 }
			 }
			 else if(A.get(i) < 9)
			 {
				 if(carry)
				 {
				 A.set(i,A.get(i)+1);
				 carry = false;
				 }
				 else if(i==A.size()-1)
				 {
				 A.set(i,A.get(i)+1);
				 carry = false;
				 }
			 }
		   }
		
	
		 if(carry)
		 {
			 result.add(1);
		 }
		 result.addAll(A);
	 	 }
		 
 Iterator<Integer> it = result.iterator();
		 
		 if(result.size()>1)
		 {
		 while(it.hasNext())
		 	{
		 	    Integer x = new Integer(it.next());
		 		if(x == 0)
		 		{
		 			it.remove();
		 		}
		 		if( x > 0)
		 			break;
		 	}
		 }
		return result;
	 }
}
