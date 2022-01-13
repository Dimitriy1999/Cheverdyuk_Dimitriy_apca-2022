import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
  private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
    		distance = dist;
    		hours = hrs;
    		minutes = mins;
	}

	public void setNums(int dist, int hrs, int mins)
	{
     		dist = distance;
     		hrs = hours;
     		mins = minutes;
	}

	public void calcMPH()
	{
			//Not my Algorithim
    		mph = Math.round((distance)/(hours + (minutes/60.0)));
	}

	public void print()
	{
    		System.out.println(distance + " miles in " + hours + " hours " + minutes + " minutes = " + mph + " MPH.");
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}
