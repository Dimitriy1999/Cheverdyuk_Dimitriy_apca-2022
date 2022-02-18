//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(Toy i : toyList)
  		{
  			if(i.getName().equals(nm))
  			{
  				return i;
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		return "";
  	}  
  
  	public void sortToysByCount()
  	{
  		//Collections.sort(toyList, toys);
  	}  
  	  
	public String toString()
	{
	   return toyList.toString();
	}
}