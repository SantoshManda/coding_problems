package org.coding.santosh;

import java.util.Scanner;

public class SubSetSumProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,9,2};
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		s.close();
		if(SubSetSum(arr,N))
			System.out.println("The Array Contains a Subset whose Sum is " + N);
		else
			System.out.println("The Array Does not Contains a Subset whose Sum is "+N);
	}
	
	public static boolean SubSetSum(int x[], int N)
	{
		
		if(x == null) return false;
		int l = x.length;
		if(l == 0 || N < 0 ) return false;
		 
		boolean a[][] = new boolean[l+1][N+1];
		a[0][0] = true;
		for(int i = 1; i < N+1; i ++)
			a[0][i] = false;
		for(int j = 1; j < l+1 ; j++)
			a[j][0] = true;
		
		for(int i = 1 ; i < l+1 ; i++)
		{
			for(int j = 1 ; j < N+1 ; j++)
			{
				if(a[i-1][j])
					a[i][j] = true;
				else 
				{
					if(j-x[i-1] < 0)
						a[i][j] = a[i-1][j];
					else
						a[i][j] = a[i-1][j-x[i-1]];
				}
			}
		}
		
		return a[l][N];
	}
}
