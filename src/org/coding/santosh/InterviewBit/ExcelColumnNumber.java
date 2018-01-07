package org.coding.santosh.InterviewBit;

/*Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 

and vice-versa*/
public class ExcelColumnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(Column("AZOT"));	
    System.out.println(printBinaryform(35562));
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
	
	
	
	private static String printBinaryform(int number)
	{
        int remainder;
        StringBuffer s = new StringBuffer();
        while(number>0)
        {
        remainder = number %26;
        if(remainder==0)
        {
        	s.append('Z');
        	number=(number/26)-1;
        }
        else
        {
        	s.append((char) ('A'-1+remainder));
        	number=number/26;
        }
        }
        s.reverse();
        return s.toString();
    }
	
	

}
