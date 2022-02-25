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
		String [] strArr = toys.split(" ");
		for(int i = 0; i < strArr.length; i++)
		{
			Toy toy = getThatToy(strArr[i]);
			if(toy == null)
			{
				Toy toyToAdd = new Toy(strArr[i]);
				toyList.add(toyToAdd);
			}
			else
			{
				toy.setCount(toy.getCount() + 1);
			}
		}
	}
   
  	public Toy getThatToy( String nm )
  	{
  		//for each loop
  		for(Toy toy : toyList)
  		{
  			if(toy.getName().equals(nm))
  			{
  				return toy;
  			}
  		}
  		return null; 	
  	}
  
  	public String getMostFrequentToy()
  	{
  		int originalValue = 0;
  		for(int i = 0; i < toyList.size() - 1; i++)
  		{
  			//check if first value is less than value ahead of it and if so just set the first value to the value bigger
  			if(toyList.get(originalValue).getCount() < toyList.get(i).getCount())
  			{
  				originalValue = toyList.get(i).getCount();
  			}
  		}
  		return "max == " + toyList.get(originalValue).getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		for(int i = 0; i < toyList.size(); i++)
  		{
  			for(int j = i + 1; j < toyList.size(); j++)
  			{
  				if(toyList.get(j).getCount() > toyList.get(i).getCount())
  				{
  					Toy temp = toyList.get(i);
  					toyList.set(i, toyList.get(j));
  					toyList.set(j, temp);
  				}
  			}
  		}
  	}  
  	  
	public String toString()
	{
	   return toyList.toString();
	}
}