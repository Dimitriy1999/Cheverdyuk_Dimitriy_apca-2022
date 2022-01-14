public class NumberVerify
{
    public static boolean isEven(int num) 
    {
    	//using modulo to check if a number is divisible by 2 and
    	//has no remainder 
        if (num % 2 == 0) 
        {
            return true;
        }
        return false;
    }
}
