//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompare
{
	private String wordOne, wordTwo;
   private int compare;

	public WordsCompare()
	{
		setWords("", "");
		wordOne = "";
		wordTwo = "";
	}

	public WordsCompare(String one, String two)
	{
		setWords(one, two);
		wordOne = "";
		wordTwo = "";
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public void compare()
	{
		String firstWord = wordOne;
		String secondWord = wordTwo;
		
		compare = firstWord.compareTo(secondWord);
		int secondCompare = secondWord.compareTo(firstWord);
		if(compare < secondCompare)
		{
			compare = -1;
		}
	}

	public String toString()
	{
		if(compare<0)
		{
			return String.format(wordOne + " should be placed before " + wordTwo + "\n");
		}
		else
		{
			return String.format(wordOne + " should be placed after " + wordTwo + "\n");
		}
	}
}