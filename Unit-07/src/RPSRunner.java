//(c) A+ Computer Science
// www.apluscompsci.com
//Name Dimitriy C 

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner 
{
	public static void main(String args[]) 
	{
		boolean keepGoing = true;
		String readQuitInput = "";
		while (keepGoing) {
			Scanner keyboard = new Scanner(System.in);
			String response;

			out.print("type in your prompt [R,P,S] :: ");

			String readInput = keyboard.next();
			response = readInput.substring(0).toUpperCase();
			RockPaperScissors game = new RockPaperScissors();
			game.setPlayers(response);
			out.println(game.toString());

			out.print("Do you want to play again? :: ");
			readQuitInput = keyboard.next().toUpperCase();

			if (readQuitInput.equals("Y")) 
			{
				keepGoing = true;
			} else 
			{
				out.println("GoodBye");
				keepGoing = false;
			}
		}
	}
}
