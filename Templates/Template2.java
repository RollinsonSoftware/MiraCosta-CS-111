// TITTLE:				Cs111 Utility Class
// PROGRAM DESCRIPTION:	Contains various useful methods for Cs111 Java course

import java.util.Scanner;

public class Template2
{
	// CONSTANTS
	public static final String NAME = "Jack Rollinson";
	public static final String COURSE = "CS 111 Intro to CS I";
	public static final String SECTION = "Mon Wed 11:00am-1:00pm";

	public static void main(String[] args) //don't forget to remove ALL of main() when done testing!
	{
		//DECLARATIONS
		Scanner keyboard;

		//INITIALIZATIONS
		keyboard = new Scanner(System.in);

		//TESTING CODE
		

		
	}

	// DESCRIPTION:		Print author information for start of program
	// PRE-CONDITIONS:	All parameters are given valid values
	// POST-CONDITIONS:	Outputs author info to console
	public static void myPrintHeader(int hwNum, int projectNum, String lastMod)
	{
		System.out.println("============================");
		System.out.println("Author: " + NAME);
		System.out.println("Course: " + COURSE);
		System.out.println("Section: " + SECTION);
		System.out.println("Homework #: " + hwNum);
		System.out.println("Project  #: " + projectNum);
		System.out.println("Last Modified: " + lastMod);
		System.out.println("============================");
	}
	// DESCRIPTION:		reads input from user, returns integer value (error-checked using bounds)
	// PRECONDITIONS:	key is instantiated, prompt is in form "Enter...: ", lower < upper
	// POSTCONDITIONS:	returns integer value between lower and upper (inclusive)
	public static int readInt(String prompt, Scanner key, int lower, int upper)
	{
		String temp;
		int result;
		boolean isNotValid;

		do
		{
			System.out.print(prompt);
			temp = key.nextLine();
			result = Integer.parseInt(temp);
			isNotValid = (result < lower) || (result > upper);
			
			if(isNotValid)
			{
				System.out.println("ERROR: please enter value between " + lower + " - " + upper);
			}
		} while(isNotValid);
		return result;
	}
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
