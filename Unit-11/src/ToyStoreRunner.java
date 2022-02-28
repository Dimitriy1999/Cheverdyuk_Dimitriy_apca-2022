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
		list.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		System.out.println(list);
		System.out.println(list.getMostFrequentToy());
		list.sortToysByCount();
		System.out.println("Sorted Order By Count is: " + list);
	}
}