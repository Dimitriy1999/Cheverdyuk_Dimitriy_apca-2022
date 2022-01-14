//© A+ Computer Science
//www.apluscompsci.com

//Name Dimitriy C
//Date 1/12/2022
//Class AP Computer Science
//Lab  Unit 1

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
  {
    for(int i = 0; i <= 20; i++)
    {
      out.print("*");
      if(i == 20)
      {
    	 out.println("");  
      }
    }
  }
 
  public void printTwentyDashes()
  {
   for(int i = 0; i <= 20; i++)
    {
      out.print("-");
      if(i == 20)
      {
    	 out.println("");  
      }
    } 
  }
 
  public void printTwoBlankLines()
  {
    out.println("\n \n");
  }
 
  public void printASmallBox()
  {  
    out.println("******");
    out.println("     *");
    out.println("     *");
    out.println("     *");
    out.println("     *");
    out.println("     *");
    out.println("******");
  } 
  public void printABigBox()
   { 	

     out.println("******************");
     out.println("*                *");
     out.println("*                *");
     out.println("*                *");
     out.println("*                *");
     out.println("*                *");
     out.println("*                *");
     out.println("*                *");
     out.println("*                *");
     out.println("*                *");
     out.println("*                *");
     out.println("*                *");
     out.println("******************");
   }  
}
