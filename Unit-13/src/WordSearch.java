//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    	for(int i = 0; i < m.length; i++)
    	{
    		for(int j = 0; j < m[i].length; j++)
    		{
    			m[i][j] = str.substring(i * size + j, i * size + j 	+ 1);
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	
    	for(int i = 0; i < m.length; i++)
    	{
    		for(int j = 0; j < m[i].length; j++)
    		{
    			if(checkLeft(word, i, j))
    			{
    				return true;
    			}    				
    		}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		for(int i = 0; i < w.length() - 1; i++)
		{
			if(!w.substring(i, i + 1).equals(m[r][c + i]))
			{
				return false;
			}
		}
		return true;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		for(int i = 1; i < w.length(); i++)
		{
			if(!w.substring(i, i + 1).equals(m[r][c - 1]))
			{
				return false;
			}				
		}
		return true;
	}

	public boolean checkUp(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
	   return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		return false;
	}

    public String toString()
    {
 		String output = "";
 		for(int i = 0; i < m.length; i++)
 		{
 			for(int j = 0; j < m[i].length; j++)
 			{
 				output += m[i][j] + " ";
 			}
 			output += "\n";
 		}
 		return output;
    }
}
