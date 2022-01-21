//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;
   //add constructors
   	public Perfect()
   	{
   		setNumber(number);
   	}

	//add a set method
   	public void setNumber(int num) 
   	{
   		number = num;
   	}
   	
	public boolean isPerfect()
	{
		int checkNumber = 0;
		int sum = 0;
		int i = 1;
		while(i < number)
		{
			checkNumber = checkNumber + i;
			if(number % checkNumber == 0)
			{
				out.println(checkNumber);
				if(checkNumber == number)
				{
					return true;
				}
			}
			i++;
		}
		//round, pow, min,max,floor
		return false;
	}

	//add a toString	
	public String toString()
	{
		if(isPerfect())
		{
			return number + " is a perfect number";
		}
		return number + " is not a perfect number";
	}
}