//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		setString("");
		word = "";
	}

	public StringOddOrEven(String s)
	{
		setString(word);
		word = "";
	}

	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{
 		if (word.length() % 2 == 1)
 		{
 			return false; 			
 		}
 		return true;
	}

 	public String toString()
 	{
 		if (isEven())
 		{
 			return word + " is " + "even";
 		}
 		return word + " is " + "odd";
	}
}