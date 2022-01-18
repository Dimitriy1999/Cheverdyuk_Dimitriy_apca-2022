//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	   WordsCompare test = new WordsCompare();
	   test.setWords("abe", "ape");
	   test.compare();
	   out.println(test.toString());
	   test.setWords("giraffe", "gorilla");
	   test.compare();
	   out.println(test.toString());
	   test.setWords("one", "two");
	   test.compare();
	   out.println(test.toString());
	   test.setWords("fun", "funny");
	   test.compare();
	   out.println(test.toString());
	   test.setWords("123", "19");
	   test.compare();
	   out.println(test.toString());
	   test.setWords("193", "1910");
	   test.compare();
	   out.println(test.toString());
	   test.setWords("goofy", "godfather");
	   test.compare();
	   out.println(test.toString());
	   test.setWords("funnel", "fun");
	   test.compare();
	   out.println(test.toString());
	}
}