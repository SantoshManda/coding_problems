package org.coding.santosh.InterviewBit;

import java.util.ArrayList;

public class MinStepsInfinateGrid {
	
public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        if(A == null || B == null)
        return 0;
        int size_x = A.size();
        int size_y = B.size();
        if(size_x != size_y || size_x <= 1 || size_y <=1)
        	return 0;
        int x = A.get(0);
        int y = B.get(0);
        //System.out.println(x);
      //  System.out.println(y);
        
        int i = 1;
        int steps=0;
        	while(i < size_x)
        		{
        		  //  System.out.println(A.get(i));
        		//    System.out.println(B.get(i));
            //    steps=calculateDistance(x,y,A.get(i),B.get(i));
              steps=steps+(Math.abs(x-A.get(i)) > Math.abs(y-B.get(i)) ? Math.abs(x-A.get(i)) : Math.abs(y-B.get(i)));;
                x=A.get(i);
                y=B.get(i);
                i++;
                }
        	return steps;
    }

}
