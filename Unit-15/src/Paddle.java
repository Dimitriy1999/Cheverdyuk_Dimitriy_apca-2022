//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	  super(10,10);
	  setSpeed(5);	
   }
   
   public Paddle(int x, int y)
   {
	  super(x, y);
	  setSpeed(5);
   }
   
   public Paddle(int x, int y, int w)
   {
	  super(x, y, w, 50);
	  setSpeed(5);
   }
   
   
   public Paddle(int x, int y, int w, int h, int s)
   {
	  super(x, y, w, h, s);
	  setSpeed(5);
   }
   
   public Paddle(int x, int y, int w, int h, Color c, int s)
   {
	  super(x, y, w, h);
	  setColor(c);
      setSpeed(s);
   }
   
   public void setSpeed(int s)
   {
	   speed = s;
   }

   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, Color.white);
	   setY(getY() + getSpeed());
	   draw(window, Color.black);
   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, Color.white);
	   setY(getY() - getSpeed());
	   draw(window, Color.black);
   }

   public int getSpeed()
   {
	   return speed;
   }
}