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
import java.util.ArrayList;
import javax.swing.Timer;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
    private AlienHorde horde;
	private Bullets shots;
	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
						//X   Y   W   H   S
		ship = new Ship(600, 450, 50, 50, 2);
		shots = new Bullets();
		horde = new AlienHorde(30);
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

			graphToBack.setColor(Color.BLUE);
			graphToBack.drawString("StarFighter ", 25, 50 );
			graphToBack.setColor(Color.BLACK);
			graphToBack.fillRect(0,0,800,600);		
			
			if(keys[0] == true)
			{
				ship.move("LEFT");
			}
			if(keys[1] == true)
			{
				ship.move("RIGHT");
			}
			if(keys[2] == true)
			{
				ship.move("UP");
			}
			if(keys[3] == true)
			{
				ship.move("DOWN");
			}
			if(keys[4] == true)
			{
				shots.add(new Ammo(ship.getX() + ship.getWidth() / 2 - 4, ship.getY(), 3));
				keys[4] = false;
			}
				CollisionCheck();
				shots.drawEmAll(graphToBack);
				shots.moveEmAll();
				horde.drawEmAll(graphToBack);
				graphToBack.setColor(Color.WHITE);
				graphToBack.drawString("Score: " + horde.ReturnScore(), 700, 50 );
				if(AlienCollisionWithShip())
				{
					graphToBack.drawString("GAME OVER! YOU LOST, FINAL SCORE COUNT: " + horde.ReturnScore(), 250, 300 );
					ship.setSpeed(0);
					for(int i = 0; i < horde.getList().size(); i++)
					{
						Alien alien = horde.getList().get(i);
						alien.setSpeed(0);
					}
				}
				if(CheckWin())
				{
					graphToBack.drawString("YOU WIN! FINAL SCORE COUNT " + horde.ReturnScore(), 300, 300 );
				}
				horde.moveEmAll();		
				twoDGraph.drawImage(back, null, 0, 0);
				ship.draw(twoDGraph);
				
	}

	
	public boolean CheckWin()
	{
		if(horde.getList().size() == 0)
		{
			return true;
		}
		return false;
	}
	
	public void CollisionCheck()
	{
		horde.removeDeadOnes(shots.getList());
	}

	public boolean AlienCollisionWithShip()
	{
		for(int i = 0; i < horde.getList().size(); i++)
		{
			Alien alien = horde.getList().get(i);
			if(ship.getX() <= alien.getX() + alien.getWidth() 
			&& (ship.getY() + ship.getHeight() >= alien.getY() && ship.getY() <= alien.getY() + alien.getHeight())
			&& !(ship.getX() <= alien.getX()) || alien.getY() > 525)
			{
				return true;
			}
		}
		return false;
	}
	
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

