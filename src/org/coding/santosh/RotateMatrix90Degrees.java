package org.coding.santosh;

public class RotateMatrix90Degrees {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int arr[][] = 
		 * 		{{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}};*/
		/*int arr[][]={{1,2}
		,{3,4}};*/
		int arr[][]= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		int start = 0;
		//int n;
		int t1,t2,t3,t4= arr[0][0];
		int end =  arr[0].length-1;
		while(start < end)
		{
			
		//	n = end - start;
			for(int i = start , k = end; i < end ; i++,k-- )
			{
			t1 = arr[start][end];
			arr[start][end]=t4;
			t2=arr[end][k];
			arr[end][k]=t1;
			t3 = arr[k][start];
			arr[k][start]= t2;
			t4=arr[start][i];
			arr[start][i]=t3;
			}
			start++;end--;
		}
		for(int i = 0 ; i < arr.length;i++)
		{
			for(int j = 0 ; j < arr.length;j++)
			{
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void swap(int arr[][],int i,int j,int k, int l)
	{
		int temp;
		temp = arr[i][j];
		arr[i][j]=arr[k][l];
		//arr[k][l];
	}
	
}
