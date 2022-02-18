//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{	
	private static String wordInput;
	
	public TriangleWord()
	{
		setWord("Hi");
	}
	
	public void setWord(String word)
	{
		wordInput = word;
	}
	
	public static String printTriangle()
	{	
		String output = "";
		String word = wordInput;
		for(int i = 0; i <= word.length(); i++)
		{
			for(int j = 0; j < i; j++)
			{
				output = output + word.substring(0, i);				
			}
			output = output + "\n";
		}
		return output;
	}
}