//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		this(x,y, 5);
	}

	public Ammo(int x, int y, int s)
	{
		super(x, y);
		speed = s;
		
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		window.setColor(Color.orange);
		//window.fillRect(getX(), getY(), 15, 15);
		window.fillOval(getX(), getY(), 5, 5);
	}
	
	
	public void move( String direction )
	{
		switch(direction)
		{
		case "UP":
			super.setY(getY() - speed);
		}
	}

	public String toString()
	{
		return "Y: " + getY();
	}
}
