import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int distance = 0;
		int firstArrValue = 0;
    boolean findEven = false;
    int savedIndex = 0;
		for(int i = 0; i < ray.size(); i++)
		{
			if(ray.get(firstArrValue) % 2 == 0)
			{
				if(ray.get(i) % 2 == 1 && savedIndex == 0)
				{
					findEven = true;
          savedIndex = i; 
				}
			}
			if(ray.get(firstArrValue) % 2 == 1 || findEven)
			{
				if(ray.get(i) % 2 == 0)
				{
					distance = i - savedIndex;
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