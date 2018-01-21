package org.coding.santosh.InterviewBit;
/*Given an m x n matrix of 0s and 1s, if an element is 0, set its entire row and column to 0.

Do it in place.

Example

Given array A as

1 0 1
1 1 1 
1 1 1

On returning, the array A should be :

0 0 0
1 0 1
1 0 1

*/
public class SetMatrixZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] X = {{0,0,0},{0,0,0},{1,1,1}};
		int [][] y = setZeroes(X);
		System.out.println(y);
	}
	
	public static int[][] setZeroes(int[][] A)
	{
		//int [][] B = A;
		if(A.length==0)
			return A;
		int[] row_array = new int[A.length];
		int[] column_array = new int[A[0].length];
		
		for(int i = 0 ; i <A.length;i++)
		{
			for(int j = 0 ; j < A[0].length;j++)
			{
					if(A[i][j]==0)
					{
				    if(row_array[i]!=1)
				    {
				    row_array[i]=1;	
				    }
				    if(column_array[j]!=1)
				    {
				    column_array[j]=1;	
				    }	
					}
				}	
			}
		
	for(int r = 0 ; r < row_array.length ; r++)
	{
		if(row_array[r]==1)
			changeArrayRow(A,r);
	}
	for(int c = 0 ; c < column_array.length ; c++)
	{
		if(column_array[c]==1)
			changeArrayColumn(A,c);
	}
		return A;
	}

	private static void changeArrayRow(int[][] a, int i) {
		// TODO Auto-generated method stub
		for(int k = 0 ; k < a.length;k++)
		{
			a[i][k]=0;
		}
	}
	
	private static void changeArrayColumn(int[][] a, int j) {
		// TODO Auto-generated method stub
		for(int k = 0 ; k < a.length;k++)
		{
			a[k][j]=0;
		}
	}

}
