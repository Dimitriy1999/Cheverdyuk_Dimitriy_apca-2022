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
		for(int i = 0; i < arr.length - 1 ; i++)
		{
			if(arr[i] < arr[i + 1])
			{
				temp = arr[i];
			}
		}
		return temp;
	}

	public String toString()
	{
	   return "";
	}
}