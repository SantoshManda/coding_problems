package org.coding.santosh.InterviewBit;
/*Write an efficient algorithm that searches for a value in an m x n matrix.

This matrix has the following properties:

        Integers in each row are sorted from left to right.
        The first integer of each row is greater than or equal to the last integer of the previous row.

Example:

Consider the following matrix:

[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]

Given target = 3, return 1 ( 1 corresponds to true )

Return 0 / 1 ( 0 if the element is not present, 1 if the element is present ) for this problem*/
import java.util.ArrayList;
import java.util.List;

public class MatrixBinarySearch {
	
	public static void main(String args[])
	{
		List<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(1);x.add(3);x.add(5);x.add(7);	
		ArrayList<Integer> y = new ArrayList<Integer>();
		y.add(10);y.add(11);y.add(16);y.add(20);
		ArrayList<Integer> z = new ArrayList<Integer>();
		z.add(23);z.add(30);z.add(34);z.add(50);
		A.add(x);A.add(y);A.add(z);
		System.out.println(MatrixSearch(A,3));
	}
	

	public static boolean MatrixSearch(List<ArrayList<Integer>> A , int B)
	{
		int rows = A.size();
		int columns = A.get(0).size();
		
		int low = 0 , high = rows*columns-1;
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			int midX = mid/columns;
			int midY = mid%columns;
			
			if(A.get(midX).get(midY)==B)
				return true;
			else if(A.get(midX).get(midY)>B)
				high = mid-1;
			else
				low = mid+1;
		}
		
		return false;
	}
}
