//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}
	
	public int compareTo( Word rhs )
	{		
		if(word.length() == rhs.word.length())
		{
			//if length is equal we need to make sure it's in alphabetical order
			return word.compareTo(rhs.word);
		}
		else
		{
			return word.length() - rhs.word.length();	
		}
	}

	public String toString()
	{
		return word;
	}
}