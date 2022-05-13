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
	private static int score;
	private boolean shouldGo;
	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
		score = 0;
		shouldGo = true;
		int alienXOffset = 0;
		int alienYOffset = 0;
		for(int i = 0; i < size; i++)
		{
			if(i > 0 && i % 15 == 0)
			{
				alienYOffset += 30;
				alienXOffset = 0;
			}
			aliens.add(new Alien(alienXOffset, alienYOffset, 1));
			alienXOffset += 45;
		}
	}


	public void drawEmAll( Graphics window )
	{
		for(int i = 0; i < aliens.size(); i++)
		{
			aliens.get(i).draw(window);
		}
	}

	public void SetOriginalState()
	{
		if(shouldGo)
		{
			for(int i = 0 ; i < aliens.size(); i++)
			{
				Alien alien = aliens.get(i);
				alien.SetState(1);
				alien.SetUpdatedYPos(30);
			}
			shouldGo = false;
		}
	}
	
	public void moveEmAll()
	{
		int screenWidth = 750;
		int updateYPosAmount = 45;
		SetOriginalState();
		
		for(int i = 0; i < aliens.size(); i++)
		{
			Alien alien = aliens.get(i);
			
			if(alien.GetState() == 1)
			{
				if(alien.getX() < screenWidth)
				{
					alien.move("RIGHT");
				}
				else
				{
					alien.SetState(2);
				}
			}
			else if(alien.GetState() == 2)
			{
				if(alien.getY() < alien.GetUpdatedYPos())
				{
					alien.move("DOWN");
				}
				else
				{
					alien.SetState(3);
					alien.SetUpdatedYPos(updateYPosAmount);
				}
			}
			else if(alien.GetState() == 3)
			{
				if(alien.getX() > 0)
				{
					alien.move("LEFT");
				}
				else
				{
					alien.SetState(4);
				}
			}
			else if(alien.GetState() == 4)
			{
				if(alien.getY() < alien.GetUpdatedYPos())
				{
					alien.move("DOWN");
				}
				else
				{
					alien.SetState(1);
					alien.SetUpdatedYPos(updateYPosAmount);
				}
			}
		}
	}

	public void removeDeadOnes(List<Ammo> ammo)
	{
		for(int i = 0; i < aliens.size(); i++)
		{
			Alien alien = aliens.get(i);
			for(int j = 0; j < ammo.size(); j++)
			{
				if(ammo.get(j).getX() <= alien.getX() + alien.getWidth() + Math.abs(ammo.get(j).getSpeed()) 
				&& (ammo.get(j).getY() >= alien.getY() && ammo.get(j).getY() <= alien.getY() + alien.getHeight())
				&& !(ammo.get(j).getX() < alien.getX()))
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
