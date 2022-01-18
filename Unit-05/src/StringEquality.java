//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{
		setWords("", "");
		wordOne = "";
		wordTwo = "";
	}

	public StringEquality(String one, String two)
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

	public boolean checkEquality( )
	{
		//Not Clarified if we should return true if the letters are the same but different capitalization. I am assuming we should  
		char [] wordOneArr = wordOne.toLowerCase().toCharArray();
		char [] wordTwoArr = wordTwo.toLowerCase().toCharArray();
		for(int i = 0; i < wordOneArr.length - 1; i++)
		{
			char wordOneArrValue = wordOneArr[i];
			for(int j = 0; j < wordTwoArr.length - 1; j++)
			{
				char wordTwoArrValue = wordTwoArr[i];
				if(wordOneArrValue != wordTwoArrValue || (wordOneArr.length < wordTwo.length() || wordTwoArr.length < wordOneArr.length))
				{
					return false;
				}
			}
		}
		return true;
	}

	public String toString()
	{
		if(checkEquality() == false)
		{
			return wordOne + " does not have the same letters as " + wordTwo + "\n";
		}
		else
		{
			
			return wordOne + " has the same letters as " + wordTwo + "\n";
		}
	}
}