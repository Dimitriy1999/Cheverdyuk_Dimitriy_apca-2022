//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int endResult = 0;
		int firstArrValue = 0;
		for(int i = 0; i < ray.size(); i++)
		{
			if(ray.get(i) > ray.get(firstArrValue))
			{
				endResult += ray.get(i);
			}
		}
		if(endResult == 0)
		{
			return -1;
		}
		return endResult;
	}
}