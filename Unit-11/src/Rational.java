//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	private int numerator;
	private int denominator;
	
	public Rational()
	{
		setNumerator(5);
		setDenominator(10);
	}

	public Rational(int num, int den)
	{
		setNumerator(num);
		setDenominator(den);
	}
	public void setNumerator(int num)
	{
		numerator = num;
	}
	
	public void setDenominator(int num)
	{
		denominator = num;
	}
	
	public void setRational(int num, int den)
	{
		numerator = num;
		denominator = den;
	}
	
	public void add(Rational  other)
	{
		 setNumerator((numerator * denominator ) + (numerator * denominator));
		 setDenominator(denominator * denominator);
		 reduce();
	}

	private void reduce()
	{
		
	}

	private int gcd(int numOne, int numTwo)
	{
		if(numTwo % 2 == 0)
		{
			return numOne;
		}
		return gcd(numTwo, numOne % numTwo);
	}

	public Object clone ()
	{
		return "";
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	public boolean equals( Object obj)
	{


		return false;
	}

	public int compareTo(Rational other)
	{


		return -1;
	}



	
	//write  toString() method
	
	
}