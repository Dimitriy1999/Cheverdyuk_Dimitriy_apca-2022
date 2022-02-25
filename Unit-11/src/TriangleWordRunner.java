//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		TriangleWord test = new TriangleWord();
		boolean keepGoing = true;
		String readInput = "";
		while(keepGoing)
		{
			Scanner Keyboard = new Scanner(System.in);
			out.print("Enter A word :: ");
			String inputWord = Keyboard.next();
			test.setWord(inputWord);
			System.out.print(test.printTriangle());
			
			out.println("Do you want to play again? :: ");
			//In case they put uppercase we just set it to lower
			readInput = Keyboard.next().toLowerCase();
			if(readInput.equals("y"))
			{
				keepGoing = true;
			}
			else
			{
				out.print("Thank You for Playing");
				keepGoing = false;
			}
		}
	}
}