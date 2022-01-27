//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int finalResult = 0;
		int lastArrValue = ray[ray.length - 1];
		for(int i = 0; i < ray.length - 1; i++)
		{
			if(ray[i] > lastArrValue)
			{
				finalResult += ray[i];
			}
		}
		if(finalResult == 0)
		{
			return -1;
		}
		return finalResult;
	}
}