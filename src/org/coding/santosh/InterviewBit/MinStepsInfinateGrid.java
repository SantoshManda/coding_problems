package org.coding.santosh.InterviewBit;

import java.util.ArrayList;


/*You are in an infinite 2D grid where you can move in any of the 8 directions :

 (x,y) to 
    (x+1, y), 
    (x - 1, y), 
    (x, y+1), 
    (x, y-1), 
    (x-1, y-1), 
    (x+1,y+1), 
    (x-1,y+1), 
    (x+1,y-1) 

You are given a sequence of points and the order in which you need to cover the points. Give the minimum number of steps in which you can achieve it. You start from the first point.

Example :

Input : [(0, 0), (1, 1), (1, 2)]
Output : 2

It takes 1 step to move from (0, 0) to (1, 1). It takes one more step to move from (1, 1) to (1, 2).

This question is intentionally left slightly vague. Clarify the question by trying out a few cases in the “See Expected Output” section.
*/
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
