package com.coding.problems;

public class SquareIslandOfOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[][] = {
    		{1,1,1,1,1},
    		{1,1,1,1,1},
    		{1,1,1,1,1},
    		{1,1,1,1,1},
    		{1,1,1,1,1}};
    int r = arr.length;
    int c = arr[0].length;
    int p,q, result;
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
    
    }
   //boolean x = CheckBorders(arr,2,2,4);
    
   // System.out.println(x);
	
	
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
