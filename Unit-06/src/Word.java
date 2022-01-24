//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
		word = "test";
	}

	public Word(String s)
	{
		word = s;
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		return word.charAt(0);
	}

	public char getLastChar()
	{
		return word.charAt(word.length() - 1);
	}

	public String getBackWards()
	{
		String back="";
		//Going backwards in the array so we start from the back instead of the front then just add that to a string
		char [] arr = word.toCharArray();
		for(int i = arr.length - 1; i >= 0; i--)
		{
			back = back + arr[i];
		}
		return back;
	}

 	public String toString()
 	{
 		return getFirstChar() + "\n" + getLastChar() + "\n" + getBackWards() + "\n" + word + "\n";
	}
}