//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore list = new ToyStore();
		System.out.println(list.getThatToy("test"));
		System.out.println("Most Freqeunt Toy: " + list.getMostFrequentToy());
	}
}