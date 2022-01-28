//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown
{
	private int [] arr;
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public RayDown()
	{
		setArray(arr);
	}
	
	public void setArray(int [] array)
	{
		arr = array;
	}
	public static boolean go(int[] numArray)
	{
    for(int i = 0; i < numArray.length - 1; i++)
    {
      if(numArray[i] == numArray[i + 1])
      {
        return false;
      }
      if(numArray[i] < numArray[i + 1])
      {
        return false;
      }
    }
		return true;
	}
}