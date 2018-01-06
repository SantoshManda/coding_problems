package org.coding.santosh.InterviewBit;

public class PettyPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(prettyPrint(5));
	}
	
	public String findDigitsInBinary(int A) {
        StringBuffer s = new StringBuffer();
        if(A==0)
        	return "0";
      while(A > 0){
          s.append(A%2);
          A = A/2;
      }
      s.reverse();
      return s.toString();
      
	}
	public static int[][] prettyPrint(int A)
	{
		int[][] result = null;
		int layer = 0;
		if(A<=0)
			return result;
		int top = 0 , bottom = 2*A-1 ,left = 0 , right = 2*A-1 ;
	 result = new int[2*A-1][2*A-1];
	 while(layer<A)
	 {
		 int x = A-layer;
		 if(layer==A-1)
		 {
			 result[layer][layer]=x;
		 }
		 for(int i = left;i < right ; i++)
		 {
			 result[top][i]=x;
		 }
		 for(int i = top;i < bottom ; i++)
		 {
			 
			 result[i][right-1]=x;
		 }
		 for(int i = right;i > left ; i--)
		 {
			 result[bottom-1][i-1]=x;
		 }
		 for(int i = bottom;i > top ; i--)
		 {
			 result[i-1][left]=x;
		 }
		 layer++;
		 left=left+1;
		 right=right-1;
		 top=top+1;
		 bottom=bottom-1;
	 }
	 return result;
	}

}
