//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		if(number / 10 == 0)
		{
			return 1;
		}
		return 1 + getNumDigits(number / 10);
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		//adds the values to the array so we can sort it later
		for(int i = 0; i < sorted.length; i++)
		{
			sorted[i] = number % 10;
			number = number / 10;
		}
		//sort array with bubble algorithm
		for(int i = 0; i < sorted.length; i++)
		{
			for(int j = i; j < sorted.length; j++)
			{
				if(sorted[j] < sorted[i])
				{
					int temp = sorted[i];
					sorted[i] = sorted[j];
					sorted[j] = temp;
				} 
			}
		}
		return sorted;
	}
}