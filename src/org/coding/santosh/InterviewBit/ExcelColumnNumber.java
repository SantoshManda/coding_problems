package org.coding.santosh.InterviewBit;

public class ExcelColumnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Column("A"));
	}
	
	public static int Column(String A)
	{
		if(A==null)
			return 0;
		char[] array = A.toCharArray();
		int result = 0;
		
		for(char c : array)
		{
			if(Character.isLowerCase(c))
				{System.out.println("Invalid Input [A-Z] Expected");return result;}
			
			result *= 26;
			result = result+c-'A'+1;
		}
		
		return result;
	}

}
