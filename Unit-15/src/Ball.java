//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x, int y)
	{
		super(x, y);
	}
	
	public Ball(int x, int y, int w, int h)
	{
		super(x, y, w, h);
	}
	
	public Ball(int x, int y, int w, int h, int xSpd, int ySpd)
	{
		super(x, y, w, h);
		setXSpeed(xSpd);
		setYSpeed(ySpd);
	}
	public Ball(int x, int y, int w, int h, Color col, int xSpd, int ySpd) 
	{
		super(x, y, w, h);
		setXSpeed(xSpd);
		setYSpeed(ySpd);
		setColor(col);
	}

	public void setXSpeed(int xSpeedBall)
	{
		xSpeed = xSpeedBall;
	}
	
	public void setYSpeed(int ySpeedBall)
	{
		ySpeed = ySpeedBall;
	}

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	 draw(window);

      setX(getX() + xSpeed);
      setY(getY() + ySpeed);

      draw(window);
		//draw the ball at its new location
   }
   
	public boolean equals(Ball block)
	{
		if(getX() == block.getX() && getY() == block.getY() && getXSpeed() == block.getXSpeed() && getYSpeed() == block.getYSpeed())
		{
			return true;
		}
		return false;
	}   

   //add the get methods
	public int getXSpeed()
	{
		return xSpeed;
	}
	
	public int getYSpeed()
	{
		return ySpeed;
	}
   
	public String toString()
	{
		return "xPos: " + getX() + " yPos: " + getY() + " xSpeed: " + getXSpeed() + " ySpeed: " + getYSpeed();
	}
}