//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	private String monsterName;
	private int monsterAge;
	//add instance variables	

	public Skeleton()
	{
		setMonsterName("Tom");
		setMonsterAge(12);
	}
	
	public Skeleton(String name, int age)
	{
		setMonsterName(name);
		setMonsterAge(age);
	}
	
	public void setMonsterName(String name)
	{
		monsterName = name;
	}
	public void setMonsterAge(int age)
	{
		monsterAge = age;
	}
	
	public String getName()
	{
		return monsterName;
	}
	public int getHowBig()
	{
		return monsterAge;
	}
	
	public boolean isBigger(Monster other)
	{
		if(getHowBig() > other.getHowBig())
		{
			return true;
		}
		return false;
	}
	
	public boolean isSmaller(Monster other)
	{
		if(getHowBig() < other.getHowBig())
		{
			return true;
		}
		return false;
	}
	
	public boolean namesTheSame(Monster other)
	{
		if(monsterName.equals(other.getName()))
		{
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		return monsterName + " " + monsterAge; 
	}
}