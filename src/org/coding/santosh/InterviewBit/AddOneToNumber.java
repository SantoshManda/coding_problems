package org.coding.santosh.InterviewBit;

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
