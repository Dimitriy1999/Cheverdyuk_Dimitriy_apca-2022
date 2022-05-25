/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testCollage2()
  {
	  Picture canvas = new Picture("640x480.jpg");
	  canvas.MyCollage();
	  canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    //swan.edgeDetection2(30);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection2(30);
    swan.explore();
  }
  
  //not sure what it's really supposed to look like so i hope it's correct
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture picture = new Picture("caterpillar.jpg");
	  Pixel[][] pixels = picture.getPixels2D();
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
	  picture.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	  Picture picture = new Picture("redMotorcycle.jpg");
	  picture.mirrorHorizontal();
	  picture.explore();  
  }
  
  public static void testMirrorHorizontalBottomToTop()
  {
	  Picture picture = new Picture("redMotorcycle.jpg");
	  picture.mirrorHorizontalBottomToTop();
	  picture.explore();  
  }
  
  public static void testNegate()
  {
	  Picture picture = new Picture("flower1.jpg");
	  picture.explore();
	  picture.negate();
	  picture.explore();
  }
  
  public static void testGrayScale()
  {
	  Picture picture = new Picture("flower2.jpg");
	  picture.grayScale();
	  picture.explore();
  }
  
  public static void testFixUnderwater()
  {
	  Picture picture = new Picture("water.jpg");
	  picture.fixUnderWater();
	  picture.explore();
  }
  
  public static void testMirrorBottomLeftToTopRight()
  {
	  Picture picture = new Picture("beach.jpg");
	  picture.mirrorBottomLeftToTopRight();
	  picture.explore();  
  }
  
  public static void TestKeepOnlyBlue()
  {
	  Picture swan = new Picture("swan.jpg");
	  swan.KeepOnlyBlue();
	  swan.explore();
  }
  
  public static void TestMirrorArm()
  {
	  Picture snowman = new Picture("snowman.jpg");
	  snowman.mirrorArm();
	  snowman.explore();
  }
  
  public static void TestMirrorGull()
  {
	  Picture gull = new Picture("seagull.jpg");
	  gull.mirrorGull();
	  gull.explore();
  }
  
  public static void TestCopyTwo()
  {
	  Picture arch = new Picture("arch.jpg");
	  Picture beach = new Picture("beach.jpg");
	  beach.copyTwo(arch, 100, 479, 1, 700, 0, 0);
	  beach.explore();
  }
  
  public static void testKeepOnlyRed()
  {
	  Picture picture = new Picture("beach.jpg");
	  picture.KeepOnlyRed();
	  picture.explore();
  }
  
  public static void testKeepOnlyGreen()
  {
	  Picture picture = new Picture("beach.jpg");
	  picture.KeepOnlyGreen();
	  picture.explore();
  }
  
  public static void encodeAndDecode()
  {
	  /*
	   * 
	  Picture picture = new Picture("beach.jpg");
	  Picture picture2 = new Picture("msg.jpg");
	  Picture picture3 = new Picture(picture2.getWidth(), picture2.getHeight());
	  picture.encode(picture2);
	  picture2.explore();
	  picture2.decode(picture3);
	  picture3.explore();
	   */
	  Picture picture = new Picture("beach.jpg");
	  Picture msg = new Picture("apple_icon.jpg");
	  picture.encodeImage(msg);
	  picture.explore();
	  picture.decode();
	  picture.explore();
  }
  
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	  encodeAndDecode();
	  //all code below, has been tested and it works
	  /*
	    testNegate();
	    testMirrorTemple();
	    testEdgeDetection();
        testZeroBlue(); 
	    TestKeepOnlyBlue();
	    testGrayScale();
	    testFixUnderwater();
	  	testMirrorVerticalRightToLeft(); 
	 	testMirrorHorizontal();
	  	testMirrorHorizontalBottomToTop();
	  	testMirrorBottomLeftToTopRight();
	  	TestMirrorArm();
		TestMirrorGull();
	 	TestCopyTwo();
	 	testCollage2();
	  	testEdgeDetection();
	  	testKeepOnlyRed();
		testKeepOnlyGreen();
	  	testEdgeDetection2();
	   */
  }
}