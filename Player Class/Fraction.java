public class Fraction
{
	//CONSTRUCTORS
	
	public static final int DEFAULT_NUMERATOR = 1;
	public static final int DEFAULT_DENOMINATOR = 1;
	//INSTANCE VARIABLES 
	
	private int numerator;
	private int denominator;
	
	//DISCRIPTION: Default constructor that creates a new object with the default numerator.
	//PRECONDITION: Takes in no arguments, assumes that the constants have been assigned values.
	//POSTCONDITION: Creates a new object with the numerator and the denominator as 1.
	public Fraction()
	{
		this.numerator = DEFAULT_NUMERATOR;
		this.denominator = DEFAULT_DENOMINATOR;
	}
	//DISCRIPTION: Full constructor, creates new object with a specfic numerator and denominator.
	//PRECONDITION: Assumes that instance variables have been intialized.
	//POSTCONDITION: Creates new object with user entered numerator and denominator.
	public Fraction(int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}
	//DISCRIPTION: Copy constructor, creates new object with copied instance variables.
	//PRECONDITION: Assumes that orginal constructor has valid input.
	//POSTCONDITION: Creates a new object with the same instance varibales as the oringal object.
	public Fraction(Fraction original)
	{
		if (original == null)
		{
			System.out.println("ERROR NULL COPY");
			System.exit(0);
		}
		else 
		{
			this.numerator = original.numerator;
			this.denominator = original.denominator;
		}
	}
	
	//OTHER

	//DISCRIPTION: Converts all instance variables to a String. 
	//PRECONDITION: Doesn't take any arguements in the parameters.
	//POSTCONDITION: Returns a string containing all the instance variables.
	public String toString()
	{
		return "" + numerator + "/" + denominator + " ";
	}
	//DISCRIPTION: Checks for equality between 2 fractions.
	//PRECONDITION: Takes in a fraction object as an arguement, assumes that all data is valid.
	//POSTCONDITION: Returns a boolean.
	public boolean equals(Fraction other)
	{
		int gcf1, gcf2;
		gcf1 = findGCF(this.numerator, this.denominator);
		this.numerator /= gcf1;
		this.denominator /= gcf1;
		
		gcf2 = findGCF(other.numerator, other.denominator);
		other.numerator /= gcf2;
		other.denominator /= gcf2;
		
		if ((this.numerator == other.numerator) && (this.denominator == other.denominator))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	//DISCRIPTION: Reduces fraction it is called with to the simplest form.
	//PRECONDITION: Assumes that all instance varibles have valid data, takes in no arguments.
	//POSTCONDITION: The object that calls this methods will be divided by the GCF.
	public void reduce()
	{
		int gcf;
		gcf = findGCF(numerator, denominator);
		this.numerator = numerator / gcf;
		this.denominator = denominator /gcf;
	}
	//DISCRIPTION: Adds two fractions together.
	//PRECONDITION: Takes in two fraction objects as arguments, assumes that all data is valid.
	//POSTCONDITION: Returns a new object with the sum of the two fractions in simplest form.
	public static Fraction add(Fraction fraction1, Fraction fraction2)
	{
		Fraction sum;
		int numeratorSum;
		int base;
		
		numeratorSum = ((fraction1.numerator * fraction2.denominator) + (fraction2.numerator * fraction1.denominator));
		base = (fraction1.denominator * fraction2.denominator);
		
		sum = new Fraction(numeratorSum, base);
		sum.reduce();
		
		return sum;
	}
	//DISCRIPTION: Finds the difference of two fractions.
	//PRECONDITION: Takes in two fraction objects as arguments, assumes that all data is valid.
	//POSTCONDITION: Returns the difference of the two fractions in a new object.
	public static Fraction subtract(Fraction fraction1, Fraction fraction2)
	{
		Fraction difference;
		int numeratorDifference, base;
		
		numeratorDifference = ((fraction1.numerator * fraction2.denominator) - (fraction2.numerator * fraction1.denominator));
		base = (fraction1.denominator * fraction2.denominator);
		
		difference = new Fraction(numeratorDifference, base);
		//difference.reduce();
		
		return difference;
	}
	//DISCRIPTION: Multiplies two fraction objects together
	//PRECONDITION: Takes in two fraction objects as arguments, assumes that all data is valid.
	//POSTCONDITION: Returns the product of the two fractions in simpilest form, stored in a new object.
	public static Fraction multiply(Fraction fraction1, Fraction fraction2)
	{
		Fraction product;
		int numeratorProduct, denominatorProduct;
		
		numeratorProduct = (fraction1.numerator * fraction2.numerator);
		denominatorProduct = (fraction1.denominator * fraction2.denominator);
		
		product = new Fraction(numeratorProduct, denominatorProduct);
		//product.reduce();
		
		return product;
	}
	
	//SETTERS
	
	//DISCRIPTION: Sets the numerator of a fraction object.
	//PRECONDITION: Assumes input is valid, takes in a single int as an argument.
	//POSTCONDITION: New value is set for numerator.
	public void setNumerator(int numerator)
	{
		this.numerator = numerator;
	}
	//DISCRIPTION: Sets the denominator of a fraction object.
	//PRECONDITION:  Assumes input is valid, takes in a single int as an argument.
	//POSTCONDITION: New value is set for denominator.
	public void setDenominator(int denominator)
	{
		this.denominator = denominator;
	}
	//DISCRIPTION: Sets both the numerator and the denominator of a fraction object.
	//PRECONDITION: Assumes all input is valid, takes in two ints as an argument.
	//POSTCONDITION: New values are set for both the numerator and the denominator.
	public void setAll(int numerator, int denominator)
	{
		setNumerator(numerator);
		setDenominator(denominator);
	}
	
	//GETTERS
	
	//DISCRIPTION: Gets the current value of the objects numerator.
	//PRECONDITION: Takes in no arguments.
	//POSTCONDITION: Returns an integer for the numerator.
	public int getNumerator()
	{
		return this.numerator;
	}
	//DISCRIPTION: Gets the current value of the objects denominator.
	//PRECONDITION: Takes in no arguments.
	//POSTCONDITION: Returns an integer for the denominator.
	public int getDenominator()
	{
		return this.denominator;
	}
	
	//HELPERS (very helpful :) )
	
	//DISCRIPTION: Finds the greatest common factor of the numerator and the denominator.
	//PRECONDITION: Takes in the numerator and the denominator as ints, assumes that all imput is valid.
	//POSTCONDITION: Returns the greatest common factor as an int.
	private static int findGCF(int numerator, int denominator)
	{
		int temp;
		while (denominator != 0)
		{
			temp = numerator % denominator;
			numerator = denominator;
			denominator = temp;
		}
		return numerator;
	}	
}
