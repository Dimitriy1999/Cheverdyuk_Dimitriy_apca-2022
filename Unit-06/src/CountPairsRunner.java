//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*; 

public class CountPairsRunner
{
	public static void main( String[] args )
	{
		//System.out.println( CountPairs.pairCounter("test_cases") );
		//add in all of the provided test cases from the lab handout	
		CountPairs test = new CountPairs();
		out.println(test.pairCounter("ddogccatppig"));
		out.println(test.pairCounter("dogcatpig"));
		out.println(test.pairCounter("xxyyzz"));
		out.println(test.pairCounter("a"));
		out.println(test.pairCounter("abc"));
		out.println(test.pairCounter("aabb"));
		out.println(test.pairCounter("dogcatpigaabbcc"));
		out.println(test.pairCounter("aabbccdogcatpig"));
		out.println(test.pairCounter("dogabbcccatpig"));
		out.println(test.pairCounter("aaaa"));
		out.println(test.pairCounter("AAAAAAAAA"));
		
		
	}
}