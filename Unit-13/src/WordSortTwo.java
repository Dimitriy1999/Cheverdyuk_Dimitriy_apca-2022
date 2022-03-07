//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public void sort()
	{
		for(int i = 0; i < wordRay.length; i++)
		{
			for(int j = i; j < wordRay.length; j++)
			{
				if(wordRay[i].compareTo(wordRay[j]) > 0)
				{
					String temp = wordRay[i];
					wordRay[i] = wordRay[j];
					wordRay[j] = temp;
				}
			}
		}
	}

	public String toString()
	{
		sort();
		String output= "";
		for(int i = 0; i < wordRay.length; i++)
		{
			output += wordRay[i];
			output += "\n";
		}
		return output;
	}
}