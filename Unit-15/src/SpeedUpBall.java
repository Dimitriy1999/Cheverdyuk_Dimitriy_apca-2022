//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{

   //instance variables
	private int ySpeed;
	private int xSpeed;
	
   public SpeedUpBall()
   {
	   super(5, 5, 15, 20);
	   setXSpeed(15);
	   setYSpeed(15);
   }

   public SpeedUpBall(int x, int y)
   {
	   super(x, y);
   }


   public SpeedUpBall(int x, int y, int xSpd, int ySpd)
   {
	   super(x, y);
	   setXSpeed(xSpd);
	   setYSpeed(ySpd);
   }

   public SpeedUpBall(int x, int y, int w, int h, int xSpd, int ySpd)
   {	
	   super(x, y, w, h);
	   setXSpeed(xSpd);
	   setYSpeed(ySpd);
   }


   public SpeedUpBall(int x, int y, int w, int h, Color col, int xSpd, int ySpd)
   {
	   super(x, y, w, h);
	   setColor(col);
	   setXSpeed(xSpd);
	   setYSpeed(ySpd);
   }

   public void setXSpeed( int xSpd )
   {
	   xSpeed = xSpd;
   }

   public void setYSpeed( int ySpd )
   {
	   ySpeed = ySpd;
   }
}

