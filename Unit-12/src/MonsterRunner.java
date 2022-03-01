//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter 1st monster's name : ");
		String name = keyboard.next();
		 
		System.out.println("Enter 1st monster's age : ");
		int age = keyboard.nextInt();
		System.out.println("Enter 2nd monster's name : ");
		String name2 = keyboard.next();
		 keyboard.nextLine();
		System.out.println("Enter 2nd monster's age : ");
		int age2 = keyboard.nextInt();
		
		Skeleton monster1 = new Skeleton(name, age);
		Skeleton monster2 = new Skeleton(name2, age2);
		
		System.out.println("Monster - 1 " + name + " " + age);
		System.out.println("Monster - 2 " + name2 + " " + age2);
		
		if(monster1.isBigger(monster2))
		{
			System.out.println("Monster one is bigger than Monster Two");
		}
		if(monster2.isBigger(monster1))
		{
			System.out.println("Monster one is smaller than Monster Two");
		}
		if(monster1.namesTheSame(monster2))
		{
			System.out.println("Monster one has the same name as Monster two.");
		}
		else
		{
			System.out.println("Monster one does not have the same name as Monster two.");
		}
		
	}
}