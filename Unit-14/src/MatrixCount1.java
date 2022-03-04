//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class MatrixCount1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 6, 7, 1, 2, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 5, 4, 3, 2, 1}};
    private static int counter;

    public static int count( int val  )
    {
    	int countValue = 0;
		for(int i = 0; i < m.length; i++)
		{
			for(int j = 0; j < m.length; j++)
			{
				if(counter == 0)
				{
					System	.out.print(" " + m[i][j] + " ");					
				}
				if(m[i][j] == val)
				{
					countValue++;
				}
			}
			if(counter == 0)
			{
				System.out.println();				
			}
		}
		counter++;
		return countValue;
    }
}
