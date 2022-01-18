//(c) A+ Computer Science
//www.apluscompsci.com

//Name Dimitriy C
//Date 1/12/2022
//Class AP Computer Science
//Lab  Unit 0

public class AsciiBox
{
	public static void main(String[] args)
	{
		System.out.println("Dimitriy \t  1/12/2022 +\n\n" );
		for(int i = 0; i < 16; i++)
		{
			if(i % 4 == 1)
			{
				System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
			}
			else
			{
				System.out.println("-----------------------------------");
			}
		}

	}
}
