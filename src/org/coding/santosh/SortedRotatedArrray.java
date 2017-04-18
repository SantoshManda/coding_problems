package org.coding.santosh;

public class SortedRotatedArrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int x[] = {4,5,6,7,0,1,2}; 
int x[] = {1,2,3,4,5,6,7};

int result = ReturnPivot(x);
System.out.println("Pivot is "+result);
	}

	public static int ReturnPivot(int x[])
	{
		int n = x.length;
		if (n <= 0 )
			return -1;
		int i ,j;
		for( i=0, j = 1 ; i < n && j < n ; i++ , j++)
		{
			if (x[i] > x[j])
			return i;
		}
		return -1;
	}
}
