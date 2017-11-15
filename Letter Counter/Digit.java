public class Digit
{
	//DESCRIPTION: Converts a char (1-9) to its actual number value.
	//PRECONDITION: Takes in a char, assumes that all input is valid.
	//POSTCONDITION: Returns the true value of the char that was input.
	public static int trueValue(char digit)
	{
		int trueDigit;
		trueDigit = (int)digit - 48;
		return trueDigit;
	}
	//DESCRIPTION: Finds the sum of all the indicies in an array.
	//PRECONDITION: Takes in an array as an argument, assumes indicies have been filled.
	//POSTCONDITION: Returns the sum of all the indicies as a single int.
	public static int sum(int[] accountNumber) //step 3
	{
		int sumOfDigits = 0;
		for (int i = 0; i < accountNumber.length; i++)
		{
			sumOfDigits += accountNumber[i];
		}
		return sumOfDigits;
	}
	//DESCRIPTION: Calculates the check didgit of an account number.
	//PRECONDITION: Takes in an int as an argument, assumes that the sum method was already called.
	//POSTCONDITION: Returns an int containing the value of the check digit for the account number.
	public static int checkDigit(int sum) //step 4
	{
		int checkDigit;
		checkDigit = (sum * 9) % 10;
		return checkDigit;
	}
}
