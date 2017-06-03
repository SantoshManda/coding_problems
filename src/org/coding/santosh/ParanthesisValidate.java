package org.coding.santosh;

public class ParanthesisValidate {

	public static void main(String[] args) {

		String x = "[()][{}()][](){}([{}(())([[{}]])][])[]([][])(){}{{}{[](){}}}()[]({})[{}{{}([{}][])}]";
	//	String x = "[]((BCD){}AE)";
	//	String x = ")(PH)N(X)";
		if(ParanthesisValidation(x))
			System.out.println("The Expression is Valid");
		else
			System.out.println("The Expression is inValid");
	}
	
	public static boolean ParanthesisValidation(String arr)
	{
		if(arr == null)
			return false;
		else if(arr.length() == 0)
			return false;
		
		int r_sum=0;
		int sq_sum = 0;
		int fl_sum = 0;
		boolean result = false;
		for(int i = 0 ; i < arr.length(); i++)
		{
			switch(arr.charAt(i))
			{
			case '(' : r_sum = r_sum + 1; break;
			case ')' : if(r_sum > 0)
						{
						r_sum = r_sum-1;
						}
						else if(r_sum == 0)
						{
						return false;
						}
						break;
			case '[' : sq_sum = sq_sum+1; break;
			case ']' : if(sq_sum > 0)
						{
						sq_sum = sq_sum-1;
						}
						else if(sq_sum == 0)
						{
							return false;
						}
						break;
			case '{' : fl_sum = fl_sum+1; break;
			case '}' : if(fl_sum > 0)
						{
						fl_sum = fl_sum-1;
						}
						else if(fl_sum == 0)
						{
							return false;
						}
						break;	
			}
		}
	result = (r_sum ==0 && sq_sum == 0 && fl_sum == 0)?true:false;
	return result;
	}
}