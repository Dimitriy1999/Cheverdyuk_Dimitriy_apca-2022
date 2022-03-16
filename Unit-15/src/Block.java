//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		setX(0);
		setY(0);
		setWidth(10);
		setHeight(50);
		setColor(color);

	}
	
	public Block(int x, int y)
	{
		setX(x);
		setY(y);
	}
	
	public Block(int x, int y, int w)
	{
		setX(x);
		setY(y);
		setWidth(w);
	}
	
	public Block(int x, int y, int w, int h)
	{
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
	}
	
	public Block(int x, int y, int w, int h, int s)
	{
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
	}

	//add other Block constructors - x , y , width, height, color
	
	public Block(int x, int y, int w, int h, Color color)
	{
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
		setColor(color);
	}
	
	
	public void setPos(int x, int y)
	{
		setX(x);
		setY(y);
	}

	public int getWidth()
	{
		return width;
	}
	
	public void setWidth(int w)
	{
		width = w;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void setHeight(int h)
	{
		height = h;
	}
	
	
	public int getX()
	{
		return xPos;
	}

	public void setX(int x)
	{
		xPos = x;
	}
	
	public int getY()
	{
		return yPos;
	}

	public void setY(int y)
	{
		yPos = y;
	}
   //add the other set methods
	public Color getColor()
	{
		return color;
	}	
   
	public void setColor(Color col)
   {
		color = col;
   }
	
   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Block block)
	{
		if(getX() == block.getX() && getY() == block.getY() && getWidth() == block.getWidth() && getHeight() == block.getHeight())
		{
			return true;
		}
		return false;
	}   

    
	public String toString()
	{
		return "xPos: " + getX() + " " + "yPos: " + getY() + " " + "Width: " + getWidth()+ " " + "Height: " + getHeight()+ " " + "Color: " + getColor();
	}
}