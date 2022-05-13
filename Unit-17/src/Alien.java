//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;
	private int alienState;
	private int updateYPos;

	public Alien()
	{
		this(0,0,30,30,1);
	}

	public Alien(int x, int y)
	{
		this(x, y, 30, 30, 1);
	}

	public Alien(int x, int y, int s)
	{
		this(x, y, 30, 30, s);
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		try
		{
			image = ImageIO.read(new File("C:\\Users\\cheverdyukd8338\\Desktop\\APCS-A-2022\\GitHub\\Cheverdyuk_Dimitriy_apca-2022\\Unit-17\\images\\alien.jpg"));
		}
		catch(Exception e)
		{
			System.out.println("No image Found");
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
	
	public int GetState()
	{
		return alienState;
	}
	
	public void SetState(int state)
	{
		alienState = state;
	}
	
	public int GetUpdatedYPos()
	{
		return updateYPos;
	}
	
	public void SetUpdatedYPos(int pos)
	{
		updateYPos += pos;
	}


   public void move(String direction)
	{
	   switch(direction)
	   {
	   case "DOWN":
		   super.setY(getY() + speed);
		   break;
	   case "RIGHT":
		   super.setX(getX() + speed);
		   break;
	   case "LEFT":
		   super.setX(getX() - speed);
		   break;
	   }
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return "";
	}
}
