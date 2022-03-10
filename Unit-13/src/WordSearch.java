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
    			m[i][j] = str.substring(i * size + j, i * size + j + 1);
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	
    	for(int i = 0; i < m.length; i++)
    	{
    		for(int j = 0; j < m[i].length; j++)
    		{
    	
    			if(checkRight(word, i, j))
    			{
    				return true;
    			} 
    			if(checkLeft(word, i, j))
    			{
    				return true;
    			} 
    			if(checkUp(word, i, j))
    			{
    				return true;
    			} 
    			if(checkDown(word, i, j))
    			{
    				return true;
    			}    
    			if(checkDiagUpRight(word, i, j))
    			{
    				return true;
    			}    
    			if(checkDiagUpLeft(word, i, j))
    			{
    				return true;
    			}    
    			if(checkDiagDownRight(word, i, j))
    			{
    				return true;
    			}   
    			if(checkDiagDownLeft(word, i, j))
    			{
    				return true;
    			}    
    		}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		if(c > m.length - w.length())
		{
			return false;
		}
		
		for(int i = 0; i < w.length(); i++)
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
		//1 2 3 4 5 6 7
		//c = 2
		//w = 3
		if(c < w.length() - 1)
		{
			return false;
		}
		for(int i = 0; i < w.length(); i++)
		{
			if(!w.substring(i, i + 1).equals(m[r][c - i]))
			{
				return false;
			}		
		}
		return true;
	}

	public boolean checkUp(String w, int r, int c)
	{
		if(r < w.length() - 1)
		{
			return false;
		}
		for(int i = 0; i < w.length() - 1; i++)
		{
			if(!w.substring(i, i + 1).equals(m[r - i][c]))
			{
				return false;
			}
		}
		return true;
	}

	public boolean checkDown(String w, int r, int c)
   {
		if(c > w.length() - 1)
		{
			return false;
		}
		for(int i = 0; i < w.length() - 1; i++)
		{
			if(!w.substring(i, i + 1).equals(m[r + i][c]))
			{
				return false;
			}
		}
		return true;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		if(r - w.length() < 0 || c + w.length() > 0)
		{
			return false;
		}
		for(int i = 0; i < w.length();i++)
		{
			if(!w.substring(i, i + 1).equals(m[r - i][c + i]))
			{
				return false;
			}
		}
		return true;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		if(r - w.length() < 0 || c + w.length() > 0)
		{
			return false;
		}
		for(int i = 0; i < w.length();i++)
		{
			if(!w.substring(i, i + 1).equals(m[r + i][c - i]))
			{
				return false;
			}
		}
		return true;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		if(r > w.length() - 1 || c < w.length() - 1)
		{
			return false;
		}
		for(int i = 0; i < w.length(); i++)
		{
			if(!w.substring(i, i + 1).equals(m[r + i][c - i]))
			{
				return false;
			}
		}
		return true;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		if(r < w.length() - 1 || c > w.length() - 1)
		{
			return false;
		}
		for(int i = 0; i < w.length(); i++)
		{
			if(!w.substring(i, i + 1).equals(m[r + i][c + i]))
			{
				return false;
			}
		}
		return true;
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
