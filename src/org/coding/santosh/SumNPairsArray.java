package org.coding.santosh;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class SumNPairsArray {

	public HashMap<Integer , String> result_table;
	
	public SumNPairsArray()
	{
		result_table = new HashMap<Integer , String>();
	}
	public void PrintPairs(int x[] , int sum)
	{
		if(x.length == 0)
			return;
		int length = x.length;
		
		for(int i = length-1 ; i >= 0 ; i--)
		{
			
			Integer j = new Integer(x[i]);
			
			/*if(result_table == null)
			{
				result_table.put(j, "N");
				break;
			}*/
			
			if(!result_table.containsKey(j))
			{
				result_table.put(j, "N");
				Integer k = new Integer(sum-x[i]);
				if(result_table.containsKey(k))
				{
					result_table.replace(j, "N" ,"Y");
					//break;
				}
				
			}
			
			else 
			{
				Integer k = new Integer(sum-x[i]);
				if(result_table.containsKey(k))
				{
					result_table.replace(j, "N", "Y");
					//break;
				}
			}
		}
		
		Iterator<Entry<Integer, String>> k = result_table.entrySet().iterator();
		while (k.hasNext())
		{
			@SuppressWarnings("rawtypes")
			Map.Entry p = (Map.Entry) k.next();
			 
			if( !p.getValue().equals("Y"))
			{
				k.remove();
			}
		}
		
		int j = 1;
		for (Integer i : result_table.keySet())
		{
				if(j == (result_table.keySet().size()/2)+1)
				System.out.println("{"+i.intValue()+","+(sum-i.intValue())+"}");
			j++;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumNPairsArray s = new SumNPairsArray();
		int x[] = {2,3,4,5,6,7,3,0,1,1};
		//int x[] = {};
		s.PrintPairs(x, 5);
	}
}
