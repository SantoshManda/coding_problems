package org.coding.santosh; 

public class MinimumCostPathMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][] = {
		{3,2,8},
		{1,9,7},
		{0,8,2},
		{6,4,3}};
int sum = MinimumCost(arr,3,2);
System.out.println(sum);
	}

	public static int MinimumCost(int arr[][] , int x , int y)
	{
		if(x < 0 || y < 0 || x > arr.length || y > arr.length)
		return -5;
		int sum = 0,i=0,j=0 , minimum ;
		while(i <= x && j <= y)
		{
		/*if(i == x && j+1 == y)
			{sum = sum + arr[i][j+1];j++;
			return sum;
			}
		else if(i+1 == x && j == y)
		{sum = sum + arr[i+1][j];i++;
		return sum;
		}
		else if(i+1 == x && j+1 == y)
		{sum = sum + arr[i+1][j+1];i++;j++;
		return sum;
		}*/
			if(i+1 > arr.length-1)
				minimum = arr[i][j+1];
			else if(j+1 > arr[0].length-1)
			minimum = arr[i+1][j];
			else
			minimum = Min(arr[i+1][j+1],arr[i+1][j],arr[i][j+1]);
		if(i == 0 && j == 0 )
			{sum = sum + arr[i][j];
			if(arr[i+1][j+1] == minimum)
			{i++;j++;}
		else if (arr[i+1][j] == minimum)
			i++;
		else
			j++;
			}
		else
		{
			sum = sum + minimum +arr[i][j];
			if( i == x && j == y ) return sum;
			if(arr[i+1][j+1] == minimum)
				{i++;j++;}
			else if (arr[i+1][j] == minimum)
				i++;
			else
				j++;
		}
			
		}
		return sum;
	}
	
	public static int Min(int x ,int y ,int z)
	{
		return (x <= y && x <= z ? x : (y <= x && y <= z ? y: z ));
	}
}
