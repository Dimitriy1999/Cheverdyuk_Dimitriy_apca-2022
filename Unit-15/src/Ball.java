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
		super((int)(Math.random() * 450) + 20, (int)(Math.random() * 450) + 20, 10, 10);
		
		xSpeed = 3;
		ySpeed = 3;
		
		if ((int)(Math.random() * 2) == 1) {
			xSpeed = -1 * xSpeed;
		}
		
		if ((int)(Math.random() * 2) == 1) {
			ySpeed = -1 * ySpeed;
		}  
		   setColor(Color.black);
	}

	//add the other Ball constructors
	public Ball(int x, int y)
	{
		super(x, y, 10, 10);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h)
	{
		super(x, y, w, h);
		xSpeed = 3;
		ySpeed = 1;
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


   public void moveAndDraw(Graphics window)
   {
   	  //draw a white ball at old ball location
	  draw(window, Color.white);
      setX(getX() + xSpeed);
      setY(getY() + ySpeed);
      draw(window, Color.black);
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

	public void setXSpeed(int xSpeedBall)
	{
		xSpeed = xSpeedBall;
	}
	
	public void setYSpeed(int ySpeedBall)
	{
		ySpeed = ySpeedBall;
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