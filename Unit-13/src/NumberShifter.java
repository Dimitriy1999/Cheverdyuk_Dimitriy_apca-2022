//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int [] newArr = new int [size];
		for(int i = 0; i < newArr.length; i++)
		{
			newArr[i] = (int)(Math.random() * 10);
		}
		return newArr;
	}
	public static void shiftEm(int[] array)
	{
		int indexValue = 0;
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == 7)
			{
				int temp = array[indexValue];
				array[indexValue] = array[i];
				array[i] = temp;
				indexValue++;
			}
		}
	}
}