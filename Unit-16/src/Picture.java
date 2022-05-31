import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int width, int height)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  public void mirrorArm()
  {
    int mirrorPoint = 193;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();

    // Left arm
    for (int row = 158; row < mirrorPoint; row++)
    {
      for (int col = 103; col < 170; col++)
      {
        topPixel = pixels[row][col];      
        bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
    
    mirrorPoint = 198;
    topPixel = null;
    bottomPixel = null;
    
    // Right arm
    for (int row = 171; row < mirrorPoint; row++)
    {
      for (int col = 239; col < 294; col++)
      {
        topPixel = pixels[row][col];      
        bottomPixel = pixels[mirrorPoint - row + mirrorPoint - 10][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
  }
  
  public void mirrorGull()
  {
	  int mirrorPoint = 240;
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    Pixel[][] pixels = this.getPixels2D();
	    
	    // loop through the rows
	    for (int row = 235; row < 320; row++)
	    {
	      for (int col = 238; col < 345; col++)
	      {
	        	leftPixel = pixels[row][col];      
	        	rightPixel = pixels[row]                       
	        			[mirrorPoint - col + mirrorPoint + 225];
	        	rightPixel.setColor(leftPixel.getColor());
	      }
	    }
  }
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  public void copyTwo(Picture picture, int startRow, int endRow, int startCol, int endCol, int x, int y)
  {
	  Pixel fromPixel = null;
	  Pixel toPixel = null;
	  Pixel[][] toPixels = this.getPixels2D();
	  Pixel[][] fromPixels = picture.getPixels2D();
	  
	  for(int fromRow = 0, toRow = startRow; fromRow < fromPixels.length && toRow < endRow; fromRow++, toRow++)
	  {
		
		  for(int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length && toCol < endCol; fromCol++, toCol++)
		  {
			  fromPixel = fromPixels[fromRow][fromCol];
			  toPixel = toPixels[toRow + y][toCol+ x];
			  toPixel.setColor(fromPixel.getColor());
		  }
		 
	  }
	    
  }

  public void MyCollage()
  {
	  Picture flower1 = new Picture("flower1.jpg");
	  Picture flower2 = new Picture("flower2.jpg");
	  flower1.mirrorHorizontal();
	  this.copyTwo(flower1, 1, 100, 1, 300, 500, 25);
	  flower2.mirrorVertical();
	  this.copyTwo(flower2, 1, 300, 5, 100, 5, 15);
	  Picture flowerNoBlue = new Picture(flower1);
	  flowerNoBlue.zeroBlue();
	  this.copyTwo(flowerNoBlue, 1, 400, 5, 100, 5, 200);
  }
  
  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection2(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length - 1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        double checkColorDistanceBelow = pixels[row][col].colorDistance(pixels[row + 1][col].getColor());
        if (leftPixel.colorDistance(rightColor) > edgeDist ||  checkColorDistanceBelow > edgeDist)
        {
        	leftPixel.setColor(Color.BLACK);
        }
        else
        {
        	leftPixel.setColor(Color.WHITE);
        }
      }
    }
  }
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  public void KeepOnlyBlue()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  pixelObj.setRed(0);
			  pixelObj.setGreen(0);
		  }
	  }
  }
  
  public void KeepOnlyRed()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  pixelObj.setBlue(0);
			  pixelObj.setGreen(0);
		  }
	  }
  }
  
  public void KeepOnlyGreen()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  pixelObj.setRed(0);
			  pixelObj.setBlue(0);
		  }
	  }
  }
  
  public void grayScale()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  int average = (pixelObj.getBlue() + pixelObj.getRed() + pixelObj.getGreen()) / 3;
			  pixelObj.setRed(average);
			  pixelObj.setGreen(average);
			  pixelObj.setBlue(average);
		  }
	  }
  }
  
  public void mirrorHorizontal()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int height = pixels.length;
	    for (int row = 0; row < height / 2; row++)
	    {
	      for (int col = 0; col < pixels[0].length; col++)
	      {
	        leftPixel = pixels[height - 1 - row][col];
	        rightPixel = pixels[row][col];
	        leftPixel.setColor(rightPixel.getColor());
	      }
	    }   
  }
  
  public void mirrorHorizontalBottomToTop()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int height = pixels.length;
	    for (int row = height - 1; row > height / 2; row--)
	    {
	      for (int col = 0; col < pixels[0].length; col++)
	      {
	        leftPixel = pixels[height - 1 - row][col];
	        rightPixel = pixels[row][col];
	        leftPixel.setColor(rightPixel.getColor());
	      }
	    }   
  }
  
  public void fixUnderWater()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  pixelObj.setRed(pixelObj.getRed() * 3);
		  }
	  }
  }
  
  public void negate()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  pixelObj.setRed(255 - pixelObj.getRed());
			  pixelObj.setGreen(255 - pixelObj.getGreen());
			  pixelObj.setBlue(255 - pixelObj.getBlue());
		  }
	  }  
  }
  
  
  public int GetImageLength(Pixel[][] pixels)
  {
	  int length = 0;
	   
	  if(pixels[0].length > pixels.length)
	  {
	    length = pixels.length;
	  }
	  else
	  {
	    length = pixels[0].length;
	  }
	return length;
	
  }
  
  public void mirrorBottomLeftToTopRight() 
  {
	  Pixel[][] pixels = this.getPixels2D();
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int length= GetImageLength(this.getPixels2D());
	    
	    for (int row = 0; row < length; row++)
	    {
	      for (int col = row; col < length; col++)
	      {
	        leftPixel = pixels[row][col];
	        rightPixel = pixels[col][row];
	        leftPixel.setColor(rightPixel.getColor());
	      }
	    }   
  }
  
  /*
   *  public void mirrorArm()
  {
    int mirrorPoint = 193;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();

    // Left arm
    for (int row = 158; row < mirrorPoint; row++)
    {
      for (int col = 103; col < 170; col++)
      {
        topPixel = pixels[row][col];      
        bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
  }
   */
  
  public void encode(Picture result)
  {
	  process(result, true);
  }
  public void decode(Picture result)
  {
	  process(result, false);
  }
  
  public void process(Picture result, boolean shouldEncrypt)
  {
	  Point point = new Point(0, 0);
	  Pixel[][] currPixels = this.getPixels2D();
	  Pixel[][] secPixels = result.getPixels2D();
 	  int iterationAmount = Math.max(getWidth() / 2, getHeight() / 2);
	  int centerX = this.getWidth() / 2;
	  int centerY = this.getHeight() / 2;
	  processImage(currPixels, secPixels, point, centerX, centerY, shouldEncrypt);
	  for(int i = 1; i <= iterationAmount; i++)
	  {
		  for(int j = -i; j <= i; j++)
		  {
			int x = centerX + j;
			int y = centerY - i;
			 processImage(currPixels, secPixels, point, x, y, shouldEncrypt);
		  }
		  for(int j = -i + 1; j <= i; j++)
		  {
			int x = centerX + i;
			int y = centerY + j;
			 processImage(currPixels, secPixels, point, x, y, shouldEncrypt);
		  }
		  for(int j = i - 1; j >= -i; j--)
		  {
			int x = centerX + j;
			int y = centerY + i;
			 processImage(currPixels, secPixels, point, x, y, shouldEncrypt);
		  }
		  for(int j = i - 1; j > -i; j--)
		  {
			int x = centerX - i;
			int y = centerY + j;
			 processImage(currPixels, secPixels, point, x, y, shouldEncrypt);
		  }
	  }
  }
  
  
  public void processImage(Pixel[][] pixel1, Pixel[][] pixel2, Point point, int x, int y, boolean shouldEncrypt)
  {
	  if(y < this.getHeight() && y >= 0 && x >= 0 && x < this.getWidth())
	  {
		  if(shouldEncrypt)
		  {
			  Color pixel = pixel1[point.y][point.x].getColor();
			  pixel2[y][x].setColor(pixel);
		  }
		  else
		  {
			  Color pixel = pixel1[y][x].getColor();
			  pixel2[point.y][point.x].setColor(pixel);
		  }
		  point.x += 1;
		  if (point.x >= this.getWidth())
		  {
			  point.x = 0;
			  point.y += 1;
		  }
	  }
	  
  }
  
  public void encodeImage(Picture image)
  {
	  Pixel[][] currPixels = this.getPixels2D();
	  Pixel[][] msgPixels = image.getPixels2D();
	  Pixel pixel = null;
	  Pixel msgPixel = null;
	  for(int r = 0; r < this.getHeight(); r++)
	  {
		  for(int c = 0; c < this.getWidth(); c++)
		  {
			  pixel = currPixels[r][c];
			  msgPixel = msgPixels[r][c];
			  int color = 0;
			  switch((r + c) % 3)
			  {
			  case 0:
				  color = pixel.getRed();
				  break;
			  case 1:
				  color = pixel.getGreen();
				  break;
			  case 2:
				  color = pixel.getBlue();
				  break;
			  }
			  if(msgPixel.getRed() < 40 && msgPixel.getGreen() < 40 && msgPixel.getBlue() < 40)
			  {
				color = color & ~1; 
			  }
			  else
			  {
				  color = color | 1;
			  }
			  switch((r + c) % 3)
			  {
			  case 0:
				 pixel.setRed(color);
				  break;
			  case 1:
				  pixel.setGreen(color);
				  break;
			  case 2:
				  pixel.setBlue(color);
				  break;
			  }
			  
		  }
	  }
  }
  
  public Picture decode() 
  {
	  Pixel[][] currPixels = this.getPixels2D();
	  Picture image = new Picture(this.getWidth(), this.getHeight());
	  Pixel pixel = null;
	  for(int r = 0; r < this.getHeight(); r++)
	  {
		  for(int c = 0; c < this.getWidth(); c++)
		  {
			  pixel = currPixels[r][c];
			  int color = 0;
			  switch((r + c) % 3)
			  {
			  case 0:
				  color = pixel.getRed();
				  break;
			  case 1:
				  color = pixel.getGreen();
				  break;
			  case 2:
				  color = pixel.getBlue();
				  break;
			  }
			  if((color & 1) == 0)
			  {
				  pixel.setColor(Color.black);
			  }
			  else
			  {
				  pixel.setColor(Color.white);
			  }
		  }
	  }
	  return image;
  }
 
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  
} // this } is the end of class Picture, put all new methods before this
