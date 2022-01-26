//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double [] arr = {one, two, three, four};
		double temp = 0;
    int checkArr = 0;
		for(int i = 0; i < arr.length - 1 ; i++)
		{
      //We are basically checking to see if the first digit in the array is less than the one after it, if it is that means there is a bigger number else we it means the original number we have is the biggest in the array
			if(arr[checkArr] < arr[i + 1])
			{
        checkArr = i + 1;
				temp = arr[i + 1];
			}
		}
    if(checkArr == 0)
    {
      return one;
    }
		return temp;
	}

	public String toString()
	{
    double endResult = getBiggest();
	   return "biggest = " + endResult;
	}
}