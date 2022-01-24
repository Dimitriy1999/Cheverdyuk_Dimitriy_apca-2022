//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover(sentence, lookFor);
	}
	public LetterRemover(String s, char rem)
	{
		setRemover(s, rem);
	}
	//add in second constructor
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned = sentence;
		int index = sentence.indexOf(lookFor);
		while(index >= 0)
		{
			cleaned = cleaned.substring(0, index) + cleaned.substring(index + 1);
			index = cleaned.indexOf(lookFor);
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}