//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		char [] chrArr = str.toCharArray();
		for(int i = 0; i < chrArr.length - 1; i++)
		{
			char firstValue = chrArr[i];
			char secondValue = chrArr[i + 1];
			if(firstValue == secondValue)
			{
				count++;
			}
		}
		return count;
	}
}