//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	//modified it to return int instead of bool as it does not make sense for it to be a bool
	public static int go(int[] ray)
	{
		int originalValue = 0;
		for(int i = 0; i < ray.length; i++)
		{
			if(ray[originalValue] % 2 == 0)
			{
				if(ray[i] % 2 == 1)
				{
					return i - originalValue;
				}
			}
		}
		return -1;
	}
}