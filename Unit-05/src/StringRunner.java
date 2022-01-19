//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import java.util.Scanner;

public class StringRunner {
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		StringOddOrEven test = new StringOddOrEven();

		System.out.print("Enter an word :: ");
		String word = keyboard.next();
		test.setString(word);
		System.out.println(test.toString());

		System.out.print("Enter an word :: ");
		word = keyboard.next();
		test.setString(word);
		System.out.println(test.toString());

		System.out.print("Enter an word :: ");
		word = keyboard.next();
		test.setString(word);
		System.out.println(test.toString());

		System.out.print("Enter an word :: ");
		word = keyboard.next();
		test.setString(word);
		System.out.println(test.toString());

	}
}