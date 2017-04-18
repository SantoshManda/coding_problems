package org.coding.santosh;
public class PrintMatrixSpiral {
	public static void main(String[] args) {
		int[][] x = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		//{{1,2,3,4},
		//{5,6,7,8},
		//{9,10,11,12}}
		System.out.println("Print Spiral clock wise");
		PrintSpiral(x);
		System.out.println();
		System.out.println("Print Spiral Anti clock wise");
		PrintSpiralAntiClockWise(x);
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
}
