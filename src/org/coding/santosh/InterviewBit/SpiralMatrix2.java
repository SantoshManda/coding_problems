package org.coding.santosh.InterviewBit;

import java.util.ArrayList;

public class SpiralMatrix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> result= new ArrayList<ArrayList<Integer>>();
		result=generateMatrix(3);
	}
	public static ArrayList<ArrayList<Integer>> generateMatrix(int A) 
	{
		ArrayList<ArrayList<Integer>> result= new ArrayList<ArrayList<Integer>>();
		int [][] result_arr = new int[A][A];
		
	//	int step = 1;
		 if(A == 0) return null;
			int top,bottom,left,right,i,j;
			top=0;
			left=0;
			bottom = A-1;
			right = A-1;
			int x = 1;
			/*if(a.size() == 1 && a.get(0).size() == 1)
			result = a.get(0);*/
			while(true)
			{
				for(i = left ; i <= right ; i++,x++)
				{
				//	Integer y = a.get(0).get(0);
				//	result.get(top).set(i,x*x);
					result_arr[top][i]=x;
				//	System.out.print(a.get(top0[i]+" ");
				}
				top++;
				if(top > bottom || left > right)
					break;
				for(j = top ; j <= bottom ; j++,x++)
				//	result.get(j).set(right,x*x);
				result_arr[j][right]=x;
					//System.out.print(arr[j][right]+" ");
				right--;
				if(top > bottom || left > right)
					break;
				for(i= right ; i >= left ; i--,x++)
				//	result.get(bottom).set(i,x*x);
				result_arr[bottom][i]=x;
					//System.out.print(arr[bottom][i]+" ");
				bottom--;
				if(top > bottom || left > right)
					break;
				for(j= bottom ; j >= top ; j--,x++)
				//	result.get(j).set(left,x*x);
				result_arr[j][left]=x;
				//	System.out.print(arr[j][left]+" ");
				left++;
				if(top > bottom || left > right) break;
		}
			 
			 // Populate result;
			for(int i1 = 0 ; i1 < A ; i1++)
			{
				ArrayList<Integer> temp = new ArrayList<Integer>(); ;
				for(int i2 = 0 ; i2 < A ; i2++)
				{
				temp.add(result_arr[i1][i2]);
				}
				result.add(temp);
			}
			 return result;
    }
}
