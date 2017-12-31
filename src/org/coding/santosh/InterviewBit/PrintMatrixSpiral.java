package org.coding.santosh.InterviewBit;

import java.util.ArrayList;
import java.util.List;

public class PrintMatrixSpiral {
	public static void main(String[] args) {
		//int[][] x = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//		int [][] x ={{1}};// {{1,2},{3,4},{5,6}};
		//{{1,2,3,4},
		//{5,6,7,8},
		//{9,10,11,12}}
		List<ArrayList<Integer>> y = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> x1 = new ArrayList<Integer>();
		x1.add(1);
		x1.add(2);
		ArrayList<Integer> x2 = new ArrayList<Integer>();
		x2.add(3);
		x2.add(4);
		ArrayList<Integer> x3 = new ArrayList<Integer>();
		x3.add(5);
		x3.add(6);
		y.add(x1);
		y.add(x2);
		y.add(x3);
		ArrayList<Integer> result = spiralOrder(y);
		System.out.println(result);
		/*System.out.println("Print Spiral clock wise");
		PrintSpiral(x);
		System.out.println();
		System.out.println("Print Spiral Anti clock wise");
		PrintSpiralAntiClockWise(x);*/
	}
    public static void PrintSpiral(int [][] arr)
    {
    	if(arr.length == 0) return;
    	int top,bottom,left,right,i,j;
    	top=0;
    	left=0;
    	bottom = arr.length-1;
    	right = arr[0].length-1;
    	while(true)
    	{
    		for(i = left ; i <= right ; i++)
    			System.out.print(arr[top][i]+" ");
    		top++;
    		if(top > bottom || left > right)
    			break;
    		for(j = top ; j <= bottom ; j++)
    			System.out.print(arr[j][right]+" ");
    		right--;
    		if(top > bottom || left > right)
    			break;
    		for(i= right ; i >= left ; i--)
    			System.out.print(arr[bottom][i]+" ");
    		bottom--;
    		if(top > bottom || left > right)
    			break;
    		for(j= bottom ; j >= top ; j--)
    			System.out.print(arr[j][left]+" ");
    		left++;
    		if(top > bottom || left > right)	break;
    	}
    }
    
    public static void PrintSpiralAntiClockWise(int [][] arr)
    {
    	if(arr.length == 0)
    		return;
    	int top,bottom,left,right,i,j;
    	top=0;
    	left=0;
    	bottom = arr.length-1;
    	right = arr[0].length-1;
    	while(true)
    	{
    		for(i = right ; i >= left ; i--)
    			System.out.print(arr[top][i]+" ");
    		top++;
    		if(top > bottom || left > right) break;
    		for(j = top ; j <= bottom ; j++)
    			System.out.print(arr[j][left]+" ");
    		left++;
    		if(top > bottom || left > right) break;
    		for(i = left ; i <= right ; i++)
    			System.out.print(arr[bottom][i]+" ");
    		bottom--;
    		if(top > bottom || left > right)
    			break;
    		for(j = bottom ; j >= top ; j--)
    			System.out.print(arr[j][right]+" ");
    		right--;
    		if(top > bottom || left > right)
    			break;
    	}
    }
    
    public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
   	 ArrayList<Integer> result = new ArrayList<Integer>();
	 if(a.size() == 0) return null;
	int top,bottom,left,right,i,j;
	top=0;
	left=0;
	bottom = a.size()-1;
	right = a.get(0).size()-1;
	int x = 0;
	/*if(a.size() == 1 && a.get(0).size() == 1)
	result = a.get(0);*/
	while(true)
	{
		for(i = left ; i <= right ; i++,x++)
		{
		//	Integer y = a.get(0).get(0);
			result.add(x, a.get(top).get(i));
		//	System.out.print(a.get(top0[i]+" ");
		}
		top++;
		if(top > bottom || left > right)
			break;
		for(j = top ; j <= bottom ; j++,x++)
			result.add(x, a.get(j).get(right));
			//System.out.print(arr[j][right]+" ");
		right--;
		if(top > bottom || left > right)
			break;
		for(i= right ; i >= left ; i--,x++)
			result.add(x, a.get(bottom).get(i));
			//System.out.print(arr[bottom][i]+" ");
		bottom--;
		if(top > bottom || left > right)
			break;
		for(j= bottom ; j >= top ; j--,x++)
			result.add(x, a.get(j).get(left));
		//	System.out.print(arr[j][left]+" ");
		left++;
		if(top > bottom || left > right)	break;
}
	 
	 // Populate result;
	 return result;
	 
    }
    
    public ArrayList<Integer> spiralOrder_solution(final List<ArrayList<Integer>> A) {
		 ArrayList<Integer> result = new ArrayList<Integer>();
		 // Populate result;
		 int m, n;
		 
		 m = A.size();
		 n = A.get(0).size();
		 
		 if (m == 0)
		    return result;
		 
	//	 int len;
		 int dir = 0; // right
		 int row, col, layer;
		 row = col = layer = 0;
		 
		 result.add(A.get(0).get(0));
		 
       
       for (int step = 1; step < m * n; step++) {
           
           switch(dir) {
               
               // Go right
               case 0:
                   
                   if (col == n - layer - 1) {
                       dir = 1;
                       row++;
                   } else {
                       col++;
                   }
                   
                   break;
                   
               // Go down
               case 1:
                   
                   if (row == m - layer - 1) {
                       dir = 2;
                       col--;
                   } else {
                       row++;
                   }
                   
                   break;
                   
               // Go left
               case 2:
                   
                   if (col == layer) {
                       dir = 3;
                       row--;
                   } else {
                       col--;
                   }
                   
                   break;
               
               // Go up
               case 3:
                   
                   if (row == layer + 1) {
                       dir = 0;
                       col++;
                       layer++;
                   } else {
                       row--;
                   }
                   
                   break;
               
           }
           
           //System.out.println(row + " " + col);
           result.add(A.get(row).get(col));
           
       }
       
       
		 
		 
		 return result;
	}

}
