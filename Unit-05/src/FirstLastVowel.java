//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
		char [] firstVowel = {'a', 'e', 'i', 'o', 'u'};
		for(int i = 0; i < firstVowel.length - 1; i++)
		{
			char vowels = firstVowel[i];
			char firstLetter = a.toLowerCase().charAt(0);
			char lastLetter = a.toLowerCase().charAt(a.length() - 1);
			if(firstLetter == vowels || lastLetter == vowels)
			{
				return "yes";
			}
		}
		return "no";
	}
}