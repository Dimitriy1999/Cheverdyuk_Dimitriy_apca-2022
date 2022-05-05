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

	public AlienHorde(int size)
	{
		for(int i = 0; i < size; i++)
		{
			aliens = new ArrayList<>(size);
		}
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
			aliens.get(i).move("DOWN");
		}
	}

	public void removeDeadOnes(List<Ammo> ammo)
	{
		for(int i = 0; i < aliens.size(); i++)
		{
			for(int j = 0; j < ammo.size(); j++)
			{
				if(ammo.get(j).getX() <= aliens.get(i).getX() + aliens.get(i).getWidth() + Math.abs(ammo.get(j).getSpeed()) 
				&& (ammo.get(j).getY() >= aliens.get(i).getY() && ammo.get(j).getY() <= aliens.get(i).getY() + aliens.get(i).getHeight()) && !(ammo.get(j).getX() < aliens.get(i).getX()))
				{
					aliens.remove(i);
					ammo.remove(j);
					System.out.println("Hit alien, Removed Bullet and Alien");
				}
			}
		}
	}

	public String toString()
	{
		return "";
	}
}
