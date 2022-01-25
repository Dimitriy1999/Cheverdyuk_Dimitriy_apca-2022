//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors 
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors() 
	{
		playChoice = "R";
		compChoice = "S";
	}

	public RockPaperScissors(String player) 
	{
		playChoice = player;
		setPlayers(player);
	}

	public void setPlayers(String player) 
	{
		playChoice = player;
	}

	public String determineWinner() 
	{
		// why?
		int computerChoice = (int) (Math.random() * 3) + 1;
		switch (computerChoice) 
		{
		case 1:
			compChoice = "R";
			break;
		case 2:
			compChoice = "P";
			break;
		case 3:
			compChoice = "S";
			break;
		}
		out.println("player had " + playChoice);
		out.println("computer had " + compChoice);
		
		//Draw Case
		if((compChoice.equals(playChoice)))
		{
			return "!Draw Game!";
		}
		//Computer Cases
		if(compChoice.equals("S") && playChoice.equals("P"))
		{
			return "!Computer Wins <<Scissors Cut Paper>>!";
		}
		if(compChoice.equals("P") && playChoice.equals("R"))
		{
			return "!Computer Wins <<Paper Covers Rock>>!";
		}
		if(compChoice.equals("R") && playChoice.equals("S"))
		{
			return "!Computer Wins <<Rock Breaks Scissors>>!";
		}
		//end Computer Case
		
		//Player Cases
		if(compChoice.equals("P") && playChoice.equals("S"))
		{
			return "!Player Wins <<Scissors Cut Paper>>!";
		}
		if(compChoice.equals("R") && playChoice.equals("P"))
		{
			return "!Player Wins <<Paper Covers Rock>>!";
		}
		if(compChoice.equals("S") && playChoice.equals("R"))
		{
			return "!Player Wins <<Rock Breaks Scissors>>!";
		}

		return "hi";
	}

	public String toString() 
	{
		String output = determineWinner();
		return output;
	}
}