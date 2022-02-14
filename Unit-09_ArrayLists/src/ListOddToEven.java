//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int distance = 0;
		int firstArrValue = 0;
		for(int i = 0; i < ray.size(); i++)
		{
			if(ray.get(firstArrValue) % 2 == 0)
			{
				if(ray.get(i) % 2 == 1)
				{
					distance = i;
				}
			}
			if(ray.get(firstArrValue) % 2 == 1)
			{
				if(ray.get(i) % 2 == 0)
				{
					distance = i;
				}
			}
		}
		if(distance == 0)
		{
			return -1;
		}
		return distance;
	}
}