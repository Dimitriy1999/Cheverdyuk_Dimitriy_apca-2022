//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		StringEquality test = new StringEquality();
		test.setWords("hello", "goodbye");
		test.checkEquality();
		out.println(test.toString());
		test.setWords("one", "two");
		test.checkEquality();
		out.println(test.toString());
		test.setWords("three", "four");
		test.checkEquality();
		out.println(test.toString());
		test.setWords("TCEA", "UIL");
		test.checkEquality();
		out.println(test.toString());
		test.setWords("State", "Champions");
		test.checkEquality();
		out.println(test.toString());
		test.setWords("ABC", "AbC");
		test.checkEquality();
		out.println(test.toString());
		test.setWords("ABC", "CBA");
		test.checkEquality();
		out.println(test.toString());
		test.setWords("Same", "Same");
		test.checkEquality();
		out.println(test.toString());
	}
}