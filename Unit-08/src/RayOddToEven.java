//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	private int [] ray;
	public RayOddToEven()
	{
		setRay(new int [] {0,0,0,0,0});
	}
	
	public void setRay(int[] setValue)
	{
		ray = setValue;
	}
	//modified it to return int instead of bool as it does not make sense for it to be a bool
	public static int go(int[] ray)
	{
		int originalValue = 0;
		int count = 0;
		for(int i = 0; i < ray.length - 1; i++)
		{
			if((ray[originalValue] % 2 == 0 && ray[originalValue + 1] % 2 == 1) 
			|| (ray[originalValue] % 2 == 1 && ray[originalValue + 1] % 2 == 0))
			{
				return 1;
			}
			if(ray[originalValue] % 2 == 0)
			{
				if(ray[i + 1] % 2 == 1)
				{
					count = i;
					return count;
				}
			}
			else if(ray[originalValue] % 2 == 1)
				
			{
				if(ray[i + 1] % 2 == 0)
				{
					count = i;
					return count + 1;
				}
			}
		}
		return -1;
	}
}