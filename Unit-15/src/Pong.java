//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int leftPaddleScore;
	private int rightPaddleScore;

	public Pong()
	{
		leftPaddleScore = 0;
		rightPaddleScore = 0;
		//set up all variables related to the game
		ball = new Ball();
		int x = 10;
		int y = RandomYPaddle();
		leftPaddle = new Paddle(x, y, 10);
		//Forces Y to have different values
		y = RandomYPaddle();
		rightPaddle = new Paddle(x + 750, y, 10);

		keys = new boolean[5];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public int RandomYPaddle()
   {
	 int randomY = (int)(Math.random() * 450);
	 if(randomY < 30)
	 {
		 randomY = 35;
	 }
	 return randomY;
   }
	
   public void update(Graphics window)
   {
	   paint(window);
   }

   public void paint(Graphics window)
   {
	   
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		{
			back = (BufferedImage)(createImage(getWidth(),getHeight()));			
		}

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		
		ball.moveAndDraw(graphToBack);			
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		
		//see if ball hits left wall or right wall
		/*
		if(!(ball.getX()>= 0 && ball.getX()<=780))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
		}
		*/
		if(!(ball.getX() >= -15))
		{
			rightPaddleScore++;
			//800 and 600 is the size of the window
			ball.setPos(800 / 2, 600 / 2);
			if ((int)(Math.random() * 2) == 1) {
				ball.setXSpeed(-1 * ball.getXSpeed());
			}
			
			if ((int)(Math.random() * 2) == 1) {
				ball.setYSpeed(-1 * ball.getYSpeed());
			}  
		}
		
		if(!(ball.getX() <= 805))
		{
			leftPaddleScore++;
			//800 and 600 is the size of the window
			ball.setPos(800 / 2, 600 / 2);
			if ((int)(Math.random() * 2) == 1) 
			{
				ball.setXSpeed(-1 * ball.getXSpeed());
			}
			
			if ((int)(Math.random() * 2) == 1)
			{
				ball.setYSpeed(-1 * ball.getYSpeed());
			}  
		}
		
		//see if the ball hits the top or bottom wall 
		if(!(ball.getY() >= 10 && ball.getY() <= 450))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}



		//see if the ball hits the left paddle
		if(ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() + Math.abs(ball.getXSpeed()) 
		&& (ball.getY() >= leftPaddle.getY() && ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight()
		|| ball.getY() + ball.getHeight() >= leftPaddle.getY() && ball.getY() + ball.getHeight() < leftPaddle.getY() + leftPaddle.getHeight()))
		{
			if(ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getXSpeed()))
			{
				ball.setYSpeed(-ball.getYSpeed());
			}
			else
			{
				ball.setXSpeed(-ball.getXSpeed());
			}
		}
		
		
		//see if the ball hits the right paddle

		if(ball.getX() >= rightPaddle.getX() - rightPaddle.getWidth() - Math.abs(ball.getXSpeed()) 
		&& (ball.getY() >= rightPaddle.getY() && ball.getY() <= rightPaddle.getY() + rightPaddle.getHeight()
		|| ball.getY() + ball.getHeight() >= rightPaddle.getY() && ball.getY() + ball.getHeight() < rightPaddle.getY() + rightPaddle.getHeight()))
		{
			if(ball.getX() >= rightPaddle.getX() + rightPaddle.getWidth() - Math.abs(ball.getXSpeed()))
			{
				ball.setYSpeed(-ball.getYSpeed());
			}
			else
			{
				ball.setXSpeed(-ball.getXSpeed());
			}
		}		
		//see if the paddles need to be moved
		if(keys[0] == true && leftPaddle.getY() < 425)
		{
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		//move left paddle down and draw it on the window
		if(keys[1] == true && leftPaddle.getY() > 10)
		{
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		if(keys[2] == true && rightPaddle.getY() < 425)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] == true && rightPaddle.getY() > 10)
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
		int x = 50;
		int y = 500;
		twoDGraph.drawString("Left Paddle Score: " + leftPaddleScore, x, y);
		twoDGraph.drawString("Right Paddle Score: " + rightPaddleScore, x + 450, y);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : 
				keys[0]=true; 
				break;
			case 'Z' :
				keys[1]=true;
				break;					
			case 'I' : 
				keys[2]=true; 
				break;
			case 'M' : 
				keys[3]=true; 
				break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : 
				keys[0]=false; 
				break;
			case 'Z' : 
				keys[1]=false; 
				break;
			case 'I' : 
				keys[2]=false; 
				break;
			case 'M' : 
				keys[3]=false; 
				break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}