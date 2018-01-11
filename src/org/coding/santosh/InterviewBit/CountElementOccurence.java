package org.coding.santosh.InterviewBit;
/*Given a sorted array of integers, find the number of occurrences of a given target value.
Your algorithm’s runtime complexity must be in the order of O(log n).
If the target is not found in the array, return 0

**Example : **
Given [5, 7, 7, 8, 8, 10] and target value 8,
return 2.*/
public class CountElementOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public int findCount(final int[] A, int B) {
         
	       int secondINdex = -1;
	        int firstINdex = search(A,A.length,B,true);
	        if(firstINdex==-1)
	        return 0;
	        else
	        secondINdex = search(A,A.length,B,false);
	        
	        return secondINdex-firstINdex+1;
	    }
	    
	    public int search(final  int[] A, int n ,int B,boolean searchFirst) {
	        int low = 0 , high = n-1 , result = -1 ,mid = 0;
	        while(low<=high)
	        {
	        mid = (low+high)/2;
	        if(A[mid]==B)
	        {
	            result = mid;
	            if(searchFirst)
	                high = mid-1;
	            else
	                low = mid+1;
	        }
	        else if(B<A[mid])
	        high = mid-1;
	        else
	        low = mid+1;
	        }
	        
	        return result;
	    }
}
