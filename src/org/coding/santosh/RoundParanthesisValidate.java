package org.coding.santosh;

public class RoundParanthesisValidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "((BCD)AE)";
	//	String x = ")(PH)N(X)";
		if(ParanthesisValidate(x))
			System.out.println("The Expression is Valid");
		else
			System.out.println("The Expression is inValid");
	}
	
	public static boolean ParanthesisValidate(String arr)
	{
		if(arr == null)
			return false;
		else if(arr.length() == 0)
			return false;
		
		int sum = 0;
		boolean result = false;
		for(int i = 0 ; i < arr.length(); i++)
		{
			switch(arr.charAt(i))
			{
			case '(' : sum = sum + 1; break;
			case ')' : if(sum > 0)
						{
						sum = sum-1;
						}
						else if(sum == 0)
						{
						return false;
						}
						break;
			}
		}
	result = (sum ==0)?true:false;
	return result;
	}
}
