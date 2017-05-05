package org.coding.santosh; 

public class MinimumCostPathMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {
		{3,2,1},
		{1,9,1},
		{0,5,1},
		{6,5,3}};
	int sum = MinimumCostDP(arr,3,2);
	System.out.println(sum);
	}

	public static int MinimumCostDP(int arr[][] , int x , int y)
	{
		if(x < 0 || y < 0 || x > arr.length || y > arr.length)
			return -5;
		int sum = 0;
		int r = arr.length;
		int c = arr[0].length;
		int [][] ResultArray = new int[r+1][c+1];
		
		//sum = arr[0][0];
		
		for(int i = 0 ; i < r ; i++)
		{
			ResultArray[i][0] = sum + arr[i][0];
			sum = ResultArray[i][0];
		}
		
		sum = 0;
		
		for(int j = 0 ; j < c ; j++)
		{
			ResultArray[0][j] = sum + arr[0][j];
			sum = ResultArray[0][j];
		}
		
		for(int i = 1; i < r ; i++)
		{
			for(int j = 1 ; j < c ; j++)
			{
				ResultArray[i][j] = arr[i][j] + Min(ResultArray[i-1][j-1],ResultArray[i-1][j],ResultArray[i][j-1]);
			}
		}
		
		return ResultArray[x][y];
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
			if(i == x && j == y)
			{
				//sum = sum + arr[i][j];
				return sum;
			}
			
			if(i+1 == arr.length)
				minimum = arr[i][j+1];
			else if(j+1 == arr[0].length)
			minimum = arr[i+1][j];
			else
			minimum = Min(arr[i+1][j+1],arr[i+1][j],arr[i][j+1]);
			
			if(i == 0 && j == 0 )
				{sum = sum + arr[i][j] + minimum;
					if(arr[i+1][j+1] == minimum)
					{i++;j++;}
					else if (arr[i+1][j] == minimum)
					i++;
					else
					j++;
				}
			else
			{
			sum = sum + minimum  ;
			//if( i == x && j == y ) return sum;
			if(i+1 == arr.length)
				j++;
			else if (j+1 == arr[0].length)
				i++;
			else
			{
				if(arr[i+1][j+1] == minimum)
				{i++;j++;}
				else if (arr[i+1][j] == minimum)
				i++;
				else
				j++;
			}
			}
			
		}
			return sum;
		}	
	
	
	
	public static int Min(int x ,int y ,int z)
	{
		return (x <= y && x <= z ? x : (y <= x && y <= z ? y: z ));
	}
}