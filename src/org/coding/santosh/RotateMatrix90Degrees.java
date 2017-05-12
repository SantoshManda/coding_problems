package org.coding.santosh;
import java.util.ArrayList;

public class RotateMatrix90Degrees {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = 
		  		{{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}};
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		
		/*int arr[][]={{1,2}
		,{3,4}};*/
		/*int arr[][]= 
				{{1,2,3},
				{4,5,6},
				{7,8,9}};*/
		int start = 0;
		//int n;
		int t1;//,t4= arr[0][0];
		int end =  arr[0].length-1;
		while(start <= end)
		{
			//t4 = arr[start][end];
		//	n = end - start;
			for(int i = start , k = end; i < end ; i++,k-- )
			{
			/*t1 = arr[i][end];
			arr[i][end]=arr[start][i];//arr[start][i];
			t2=arr[end][k];
			arr[end][k]=t1;
			t3 = arr[k][start];
			arr[k][start]= t2;
			//t4=arr[start][i];
			arr[start][i]=t3;*/
				t1 = arr[i][end];
				arr[i][end]=arr[start][i];//arr[start][i];
				arr[start][i]=arr[k][start];
				arr[k][start]= arr[end][k];
				arr[end][k]=t1;
				//t4=arr[start][i];
				
			}
			start++;end--;
		}
		for(int i = 0 ; i < arr.length;i++)
		{
			System.out.print("[");
			for(int j = 0 ; j < arr.length;j++)
			{
				
				System.out.print(arr[i][j]);
				if(j!= arr.length-1)
				System.out.print(", ");
				
			}
			System.out.print("]");
			if(i!= arr.length-1)
			System.out.print(",");
			System.out.println();
		}
	}
	
	public void rotate(ArrayList<ArrayList<Integer>> arr) {
    	int start = 0;
		//int n;
		Integer t1;//,t4= arr[0][0];
		int end =  arr.get(0).size()-1;
		while(start <= end)
		{
			//t4 = arr[start][end];
		//	n = end - start;
			for(int i = start , k = end; i < end ; i++,k-- )
			{
				t1 = arr.get(i).get(end);
				arr.get(i).set(end,arr.get(start).get(i));
				arr.get(start).set(i,arr.get(k).get(start));
				arr.get(k).set(start,arr.get(end).get(k));
				arr.get(end).set(k, t1);
				//t4=arr[start][i];
				
			}
			start++;end--;
		}
    	 
		for(int i = 0 ; i < arr.size();i++)
		{
			System.out.print("[ ");
			for(int j = 0 ; j < arr.get(0).size();j++)
			{
				
				System.out.print(arr.get(i).get(j).intValue());
			//	if(j!= arr.get(0).size()-1)
			//	System.out.print(", ");
				
			}
			System.out.print(" ]");
		//	if(i!= arr.size()-1)
		//	System.out.print(",");
			//System.out.println();
		}
		for(ArrayList<Integer> x : arr)
		{
			System.out.print("[");
			for(Integer k : x)
			{	
				System.out.println(k.intValue());
			}
			System.out.print(" ");
			System.out.print("]");
		}

	/*public static void swap(int arr[][],int i,int j,int k, int l)
	{
		int temp;
		temp = arr[i][j];
		arr[i][j]=arr[k][l];
		//arr[k][l];
	}*/
	}
}
