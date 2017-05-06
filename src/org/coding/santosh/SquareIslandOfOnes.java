package org.coding.santosh;

import java.util.Scanner;

public class SquareIslandOfOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[][] = {
    		{1,1,1,1,1},
    		{1,1,1,1,1},
    		{1,1,1,1,1},
    		{1,1,1,1,1},
    		{1,1,1,1,1}};
    int arr1[][] = 
    			{{0,5,6},
    			{4,12,6},
    			{4,9,7},
    			{10,9,10}};
    ;
    int r = arr.length;
    int c = arr[0].length;
    int p,q, result, MaxResult;
    int currMax = 2, MaxValue = 2 ,MaxX , MaxY;
    boolean value = false;
    for(int i = 0 ; i < r ; i++)
    {
    	for(int j = 0 ; j < c ; j++)
    	{
    		currMax = 0;
    		if(arr[i][j] == 0)
    			continue;
    		else
    		{
    			if( r-i >= MaxValue+1 && c-j >= MaxValue+1 )
    			{
    				p = i;
    				q = j;
    			value = baseCase(arr,i,j);
    			if(value)
    			{
    				
    				MaxValue = MaxValue > 2 ? MaxValue : 2;
    				currMax = 2;
    				MaxX = i ;
    				MaxY = j ;
    				while(value)
    				{
    				p++;
    				q++;
    				if((j+1) <= c-1 && (i+1) <= r-1 )
    				{
    				value = CheckBorders(arr,p,q,MaxValue+1);
    				if(value)
    					{
    					currMax = MaxValue+1;
    					MaxX = i ;
        				MaxY = j ;
    					}
    				MaxValue = (MaxValue > currMax ? MaxValue : currMax);
    				}
    				}
    			}
    			}
    		}
    		}
    	}
    System.out.println("Solution with O(mn*n) time and O(1) space 'CheckBorders()' : "+ MaxValue);
   result = maximumSizeOnesSquareDP(arr);
    System.out.println("DP Solution with O(mn) time and O(mn) space is 'maximumSizeOnesSquareDP()' : "+result);
    
    Scanner s = new Scanner(System.in);
    int x = s.nextInt();
    MaxResult =  MaxSumSquareIsland(arr1,x);
    if(MaxResult > 0 )
    System.out.println("Maxium Square with "+ x + "*" + x +" dimentions from MaxSumSquareIsland() is  "+MaxResult);
    else
    	System.out.println("Not found");
    }
   //boolean x = CheckBorders(arr,2,2,4);
    
   // System.out.println(x);
	
	public static int MaxSumSquareIsland(int arr[][] , int m)
	{
		if( m < 0 || m > arr.length || m > arr[0].length)
			return -5;
		int Maxi = -9 , Maxj = -9, MaxSum = 0;
		int r = arr.length;
		int c = arr[0].length;
		
		int sumArr[][] = new int [r+1][c+1];
		int countArr[][] = new int[r+1][c+1];
		
		for(int i = 0 ; i < r ; i++)
		{
			sumArr[i][0] = arr[i][0];
			countArr[i][0] = (arr[i][0] == 0 ? 0 : 1);
		}
		
		for(int j = 0 ; j < c ; j++)
		{
			sumArr[0][j] = arr[0][j];
			countArr[0][j] = (arr[0][j] == 0 ? 0 : 1);
		}
		
		for(int i = 1 ; i < r ; i++)
		{
			for(int j = 1 ; j < c ; j++)
			{
				if(arr[i][j] == 0)
				{
					sumArr[i][j] = 0 ;
					countArr[i][j] = 0;
				}
				else
				{
					if(arr[i-1][j-1] > 0 && arr[i-1][j] > 0 && arr[i][j-1] > 0)
					{
					sumArr[i][j] = arr[i][j]+sumArr[i-1][j-1]+sumArr[i-1][j]+sumArr[i][j-1];
					}
					else
					sumArr[i][j] = arr[i][j];
					countArr[i][j] = 1 + min(countArr[i-1][j-1],countArr[i][j-1],countArr[i-1][j]);
				}
			}
		}
		
		for(int i = 0 ; i < r ; i++)
		{
			for(int j = 0 ; j < c ; j++)
			{
				if(countArr[i][j] == m && sumArr[i][j] > MaxSum)
					{
					Maxi = i;
					Maxj = j;
					MaxSum = sumArr[i][j] ;
					}		
			}
		}
		
		return (Maxi >=0 && Maxj>=0 ? sumArr[Maxi][Maxj] : -5);
	}
	
	public static boolean baseCase(int arr[][], int i , int j )
	{
		if(i+1 < arr.length && j+1 < arr[0].length)
		{
		if(arr[i+1][j+1] == 1 && arr[i+1][j] == 1 && arr[i][j+1] == 1)
			return true;}
		
	     return false;
	}
	
	
	public static boolean CheckBorders(int arr[][] , int i , int j , int N)
	{
		int r = arr.length;
	    int c = arr[0].length;
	    
		if(i > r-1 && j > c-1 )
			return false;
		int k = 1;
		boolean y = false;
		y = baseCase(arr,i,j);
		if(y)
		{
		while((i-k >= 0))
		{
			y = baseCase(arr,i-k,j);k++;
			if(!y)
				break;
		}
		if(!y)
			return false;
		k = 1;
		while(y && (j-k) >=0 )
		{
			y = baseCase(arr,i,j-k); k++;
			if(!y)
				break;
		}
		}
		return y;
	}
	
	
	public static int maximumSizeOnesSquareDP(int arr[][])
	{
		int r = arr.length;
	    int c = arr[0].length;
	    int table[][] = new int[r][c];
	    int MaxSize = 0;
	    for(int i = 0; i < r ; i++)
	    {
	    	for(int j = 0 ; j < c ; j++)
	    	{
	    		if(i == 0 || j == 0 )
	    		{
	    			table[i][j] = arr[i][j];
	    		}
	    		else if( arr[i][j] == 0 )
	    			table[i][j] = 0;
	    		else
	    		{
	    			table[i][j] = min(table[i-1][j-1],table[i-1][j],table[i][j-1])+1;
	    			MaxSize = table[i][j] > MaxSize ? table[i][j] : MaxSize;
	    		}
	    	}
	    }
	    return MaxSize;
	}

	private static int min(int i, int j, int k) {
		// TODO Auto-generated method stub
		return (i <= j && i <= k ? i : (j <=i && j <=k ? j : k));
	}
	
	
	
	
	
}
