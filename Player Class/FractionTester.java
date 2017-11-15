/********************************************
* AUTHOR: <Jack Rollinson>
* COURSE: CS 111 Intro to CS I
* SECTION: <Mon. + Wed. 11:00AM>
* HOMEWORK #: <homework #7>
* PROJECT #: <project #2>
* LAST MODIFIED: <3/13/2016>
********************************************/


/*****************************************************************************
* <Pizza Menu!>
*****************************************************************************
* PROGRAM DESCRIPTION:
* <Takes a customers order for the size of the pizza and all the toppings they want on it!>
*****************************************************************************
* ALGORITHM:
* show fractions
* check for equality
* add fractions
* subtract fractions 
* multiply fractions
* output answers
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* Scanner Class for user input.
*****************************************************************************/
public class FractionTester
{
	public static void main(String[] args)
	{
		Fraction firstFraction;
		Fraction secondFraction;
		Fraction thirdFraction;
		
		firstFraction = new Fraction(20, 60);
		secondFraction = new Fraction(firstFraction);
		thirdFraction = new Fraction();
		
		secondFraction.setAll(1, 3);
		thirdFraction.setAll(9, 63);
		
		System.out.println("Welcome to the fraction wizard!");
		System.out.println(" ");
		System.out.println("Here we have 3 fractions! ....");
		System.out.println(" ");
		System.out.println("Fraction A: " + firstFraction + "; Fraction B: " + secondFraction + "; Fraction C: " + thirdFraction);
		System.out.println(" ");
		System.out.println("Let's check for equality between fractions A and B!");
		System.out.println(" ");
		if (firstFraction.equals(secondFraction) == true)
		{
			System.out.println(" ...... These fractions are equal!");
			System.out.println(" ");
		}
		else if (firstFraction.equals(secondFraction) == false)
		{
			System.out.println(" ...... These fractions are NOT equal!");
			System.out.println(" ");
		}
		System.out.println("Now let's check for equality between fractions B and C!");
		System.out.println(" ");
		if (secondFraction.equals(thirdFraction) == true)
		{
			System.out.println(" ...... These fractions are equal!");
			System.out.println(" ");
		}
		else if (secondFraction.equals(thirdFraction) == false)
		{
			System.out.println(" ...... These fractions are NOT equal!");
			System.out.println(" ");
		}
		System.out.println("Now lets add fractions A and B: ");
		System.out.println(" ");
		System.out.println("The sum of the 2 fractions in reduced form is: " + Fraction.add(firstFraction, secondFraction));
		System.out.println(" ");
		System.out.println("How about subtracting B from C?");
		System.out.println(" ");
		System.out.println("The diffrence of the 2 fractions is: " + Fraction.subtract(thirdFraction, secondFraction));
		System.out.println(" ");
		System.out.println("Find the product of A and C: ");
		System.out.println(" ");
		System.out.println("The product of the 2 fractions is: " + Fraction.multiply(firstFraction, thirdFraction));
		System.out.println(" ");
		
	}
}
