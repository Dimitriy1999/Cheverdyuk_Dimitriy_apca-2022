import java.util.ArrayList;
import java.util.List;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for(int i = 0; i < grid.length; i++)
		{
			for(int j = 0; j < grid[i].length; j++)
			{
				grid[i][j] = vals[(int) (Math.random() * vals.length)];
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int endResult = 0;
		String stringValue = "";
		String highestValueLetter = "";
		int highestNumber = 0;
		for(int i = 0; i < vals.length; i++)
		{
			for(int j = i; j < vals.length; j++)
			{
				endResult = countVals(vals[i]);
				stringValue = vals[i];
			}
			System.out.println(stringValue + " count is " + endResult);
			
			if(highestNumber < endResult)
			{
				highestNumber = endResult;
				highestValueLetter = stringValue;
			}
		}
		return "\n" + highestValueLetter + " Occurs the most.";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for(int i = 0; i < grid.length; i++)
		{
			for(int j = 0; j < grid[i].length; j++)
			{
				if(grid[i][j].equals(val))
				{
					count++;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for(int i = 0; i < grid.length; i++)
		{
			for(int j = 0; j < grid[i].length; j++)
			{
				output += grid[i][j] + " ";
			}
			output += "\n";
		}
		return output;
	}
}