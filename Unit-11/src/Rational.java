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
		setNumerator(1);
		setDenominator(1);
	}

	public Rational(int num, int den)
	{
		this.setNumerator(num);
		this.setDenominator(den);
	}
	
	public void setRational(int num, int den)
	{
		numerator = num;
		denominator = den;
	}
	
	public void add(Rational other)
	{
		this.setNumerator( (this.numerator* other.denominator ) + ( other.numerator * this.denominator));
	    this.setDenominator( this.denominator * other.denominator );
	    reduce();
	}

	private void reduce()
	{
		int temp = gcd(numerator, denominator);
		this.setNumerator(this.numerator / temp);
	    this.setDenominator(this.denominator / temp);
	}

	private int gcd(int numOne, int numTwo)
	{
		/*
		int gcd = 1;
		for(int i = 1; i <= numOne && i <= numTwo; i++)
		{
			if(numOne % i == 0 && numTwo % i == 0)
			{
				gcd = i;
			}
		}
		return gcd;
		*/
		if(numTwo == 0)
		{
			return numOne;
		}
		return gcd(numTwo, numOne % numTwo);
	}

	public Object clone ()
	{
		return new Rational(this.numerator, this.denominator);
	}
	
	public void setNumerator(int num)
	{
		numerator = num;
	}
	
	public void setDenominator(int num)
	{
		denominator = num;
	}
	
	public boolean equals( Rational obj)
	{
		for(int i = numerator; i <= denominator; i++)
		{
			if(numerator * i == obj.numerator && denominator * i == obj.denominator)
			{
				return true;
			}
		}
		return false;
	}

	public int compareTo(Rational other)
	{

		Rational number1 = new Rational(numerator, denominator);
		Rational number2 = new Rational(other.numerator, other.denominator);
		number1.reduce();
		number2.reduce();
		if(number1.denominator < number2.denominator)
		{
			return -1;
		}
		if(number1.numerator > number2.numerator)
		{
			return 1;
		}
		
		return -1;
	}



	public String toString()
	{
		return this.numerator + "/" + this.denominator;
	}
	//write  toString() method
	
	
}