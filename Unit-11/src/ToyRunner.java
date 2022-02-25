//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy test = new Toy();
		test.setCount(5);
		test.setName("gi joe");
		System.out.println(test);
		test.setName("sorry");
		test.setCount(1);
		System.out.println(test);
	}
}