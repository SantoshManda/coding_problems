package org.coding.santosh;

public class MinimumStepsInfinateGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetMinimumSteps(11);
	}
	
	public static void GetMinimumSteps(int Max)
	{
		int x=0,y=0;
		boolean flag = isOdd(Max);
		for(int i = 1; i <= Max ; i++)
		{
			if(y+i == Max)
			{
				System.out.println("("+y+","+(y+i)+")");
				System.out.println(i+" steps are needed to reach "+Max);
				break;
			}
			else
				
			{
				if(flag)
				{
					x = y ; y = y + i;
				}
				else
				{
					if(i == 1)
					{
						y--;
					}
					else
					{
						x = y;
						y = y+i;
					}
				}
			}
		}
	}
	
	public static boolean isOdd(int x)
	{
		if (x%2 == 0 )
			return false;
		return true;
	}

}
