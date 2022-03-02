//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countEvenDigits(int num)
	{
		if(num == 0)
		{
			return 0;
		}
		int number = num % 10;
		if(number % 2 == 0)
		{
			return 1 + countEvenDigits(num / 10);
		}	
		return countEvenDigits(num / 10);
	}
}