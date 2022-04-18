//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(10,10,10,10,10);
	}

	public Ship(int x, int y)
	{
	   this(x, y, 10, 10, 1);
	}

	public Ship(int x, int y, int s)
	{
	   this(x, y, s, 5, 5);
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			URL url = getClass().getResource("/images/ship.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.print("No Image\n");
		}
	}


	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void move(String direction)
	{
		switch(direction)
		{
		case "LEFT":
			super.setX(getX() - speed);
			break;
		case "RIGHT":
			super.setX(getX() + speed);
			break;
		case "UP":
			super.setY(getY() - speed);
			break;
		case "DOWN":
			super.setY(getY() + speed);
			break;
		}
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() +  " " + getSpeed();
	}
}
