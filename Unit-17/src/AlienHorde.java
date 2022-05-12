//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
	private int updateYPos;
	private static int score;
	private int state;
	public AlienHorde(int size)
	{
		updateYPos = 30;
		aliens = new ArrayList<Alien>();
		score = 0;
		state = 1;
		int alienXOffset = 0;
		for(int i = 0; i < size; i++)
		{
			aliens.add(0, new Alien(alienXOffset, 0, 1));
			alienXOffset += 50;
		}
	}

	public boolean CheckAlienPosition() 
	{
		for(int i = 0; i < aliens.size(); i++)
		{
			for(int j = 0; j < aliens.size(); j++)
			{
				if(aliens.get(j).getX() <= aliens.get(i).getX() + aliens.get(i).getWidth() + Math.abs(aliens.get(j).getSpeed())
				&& (aliens.get(j).getY() >= aliens.get(i).getY() && aliens.get(j).getY() <= aliens.get(i).getY() + aliens.get(i).getHeight()) 
				&& !(aliens.get(j).getX() < aliens.get(i).getX()))
				{
					System.out.println("Alien's are in contact, Swapping Position");
					return true;
				}
			}
		}
		return false;
	}
	
	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for(int i = 0; i < aliens.size(); i++)
		{
			aliens.get(i).draw(window);
		}
	}

	public void moveEmAll()
	{
		for(int i = 0; i < aliens.size(); i++)
		{
			Alien alien = aliens.get(i);
			
			if(state == 1)
			{
				if(alien.getX() < 750)
				{
					alien.move("RIGHT");
				}
				else
				{
					state = 2;
				}
			}
			else if(state == 2)
			{
				if(alien.getY() < updateYPos)
				{
					alien.move("DOWN");
				}
				else
				{
					state = 3;
					updateYPos += 30;
				}
			}
			else if(state == 3)
			{
				if(alien.getX() > 0)
				{
					alien.move("LEFT");
				}
				else
				{
					state = 4;
				}
			}
			else if(state == 4)
			{
				if(alien.getY() < updateYPos)
				{
					alien.move("DOWN");
				}
				else
				{
					state = 1;
					updateYPos += 30;
				}
			}
		}
	}

	public void removeDeadOnes(List<Ammo> ammo)
	{
		for(int i = 0; i < aliens.size(); i++)
		{
			for(int j = 0; j < ammo.size(); j++)
			{
				if(ammo.get(j).getX() <= aliens.get(i).getX() + aliens.get(i).getWidth() + Math.abs(ammo.get(j).getSpeed()) 
				&& (ammo.get(j).getY() >= aliens.get(i).getY() && ammo.get(j).getY() <= aliens.get(i).getY() + aliens.get(i).getHeight())
				&& !(ammo.get(j).getX() < aliens.get(i).getX()))
				{
					ammo.remove(j);
					aliens.remove(i);
					score++;
				}
			}
		}
	}
	
	public List<Alien> getList()
	{
		return aliens;
	}

	public String toString()
	{
		return "";
	}
	
	public int ReturnScore()
	{
		return score;
	}
}
