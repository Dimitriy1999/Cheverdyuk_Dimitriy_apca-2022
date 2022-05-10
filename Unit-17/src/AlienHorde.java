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
	private boolean check;
	public AlienHorde(int size)
	{
		updateYPos = 30;
		check = true;
		aliens = new ArrayList<Alien>();
		for(int i = 0; i < size; i++)
		{
			/*
			
			int x = (int)(Math.random() * 700);
			int y = (int)(Math.random() * 300);
			if(CheckAlienPosition() && aliens.size() > 0)
			{
				x = (int)(Math.random() * 700);
				aliens.add(new Alien(x, y));
			}
			else
			{
				aliens.add(new Alien(x, y));
			}
			 */
			aliens.add(new Alien(1, 1));
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
		//ToDo: Fix Right condition as once we add to updateYPos it won't work
		for(int i = 0; i < aliens.size(); i++)
		{
			Alien alien = aliens.get(i);
			if(alien.getX() < 750 && alien.getY() == updateYPos - 29)
			{
				alien.move("RIGHT");
			}
			if((alien.getX() >= 750 || alien.getX() <= 1) && alien.getY() <= updateYPos)
			{
				alien.move("DOWN");
			} 
			else if(alien.getY() > updateYPos && alien.getX() > 1)
			{
				alien.move("LEFT");
			}
			if(alien.getX() == 1 && check)
			{
				updateYPos +=15;
				check = false;
			}
			System.out.println("Old Y: " + alien.getY() + " New Y " + updateYPos);
			//System.out.println("X: " + alien.getX());
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
}
