//Sina Dalir
//Jack Rollinson
// PROGRAM DESCRIPTION: main() method contains test code for
// implementing readDouble() method.  When you have filled in the
// readDouble() method below and think it will work, compile and
// run to test if it actually works.  Follow instructions carefully!

import java.util.Scanner;

public class DoubleTest
{
	public static void main(String[] args)
	{
        //DECLARATIONS
		Scanner keyboard;
		double doubleTest;

        //INITIALIZATIONS
		keyboard = new Scanner(System.in);

        //TESTING CODE
		System.out.println("Hi User! You're going to help us test this code!");
		System.out.println("Please follow the instructions, as the output will " +
							"help you find if their is an error!\n\n");
		
		//testing boundaries
		System.out.println("You are about to be asked for double input, please enter 0 for it.");
		doubleTest = DoubleTest.readDouble("Enter a double: ", keyboard, 0.0, 100.0);
		System.out.println("The value of doubleTest should be 0.0 and its " + doubleTest + "\n");
		
		System.out.println("You are about to be asked for double input, please enter 100 for it.");
		doubleTest = DoubleTest.readDouble("Enter a double: ", keyboard, 0.0, 100.0);
		System.out.println("The value of doubleTest should be 100.0 and its " + doubleTest + "\n");
		
		//testing "good" value
		System.out.println("You are about to be asked for double input, please enter 50.5 for it.");
		doubleTest = DoubleTest.readDouble("Enter a double: ", keyboard, 0.0, 100.0);
		System.out.println("The value of doubleTest should be 50.5 and its " + doubleTest + "\n");
		
		//error testing "bad" values
		System.out.println("Let's do some error checking.  Enter -0.1, 100.2, 94.999. " +
							"\nThe first two should give you errors and prompt to try again.");
		doubleTest = DoubleTest.readDouble("Enter a double: ", keyboard, 0.0, 100.0);
		System.out.println("The value of doubleTest should be 94.999 and its " + doubleTest + "\n");

        System.out.println("END OF TESTS!");
        System.out.println("If your code matches what the output says, your program should be working correctly!");
		
	}
	
	/******************************************************************************************
	* PSEUDOCODE:
	*	
	******************************************************************************************/
	// DESCRIPTION:		reads input from user, returns double value (error-checked using bounds)
	// PRECONDITIONS:	key is instantiated, prompt is in the form of "Enter...:", double lower < double uper
	// POSTCONDITIONS:	returns double value between lower and upper (inclusive)
	public static double readDouble(String prompt, Scanner key, double lower, double upper)
	{
		String temp;
		double result;
		boolean isNotValid;
		do 
		{ 
			System.out.print(prompt);
			temp = key.nextLine();
			result = Double.parseDouble(temp);
			isNotValid = (result < lower) || (result >  upper);
			if (isNotValid)
			{
				System.out.println("ERROR: please enter value between " + lower + " - " + upper);
			}
		}while(isNotValid);
		return result;
	}
	
	// DESCRIPTION:		reads input from user, returns char value (error-checked using validChars)
	// PRECONDITIONS:	key is instantiated, prompt is in the form of "Enter...".
	// POSTCONDITIONS:	check if the char entered by the user is in the list of valid chars.
    public static char readChar(String prompt, Scanner key, String validChars)
    {
		String temp;
		boolean isNotValid;
		char userInput;
		int charNum;
		do
		{
			System.out.print(prompt);
			temp = key.nextLine();
			userInput = temp.charAt(0);
			charNum = validChars.indexOf(userInput);
			if (charNum == -1)
			{
				System.out.println("ERROR: Please enter a valid character");
			}
		}while(charNum < 0);
        return userInput;
    }
	
}
