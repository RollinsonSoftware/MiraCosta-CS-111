// TITLE:				Cs111 Utility Class
// PROGRAM DESCRIPTION:	Contains various useful methods for Cs111 Java course

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Homework7P1
{
	// CONSTANTS
	public static final String NAME = "Jack Rollinson";
	public static final String COURSE = "CS 111 Intro to CS I";
	public static final String SECTION = "Mon Wed 11:00am-1:00pm";
	public static final String MENU = "Welcome User!\nMain Menu:\nA: Tell me a Joke! \nB: Tell me average of int and double! \nX: Exit\n";
	public static final String JOKE = "Today a man knocked on my door and asked for a small donation towards the local swimming pool. I gave him a glass of water.\n";  
	public static void main(String[] args) 
	{
		//DECLARATIONS
		Scanner keyboard;
		int userInt;
		double userDouble, userAvg;
		char choice;
		//INITIALIZATIONS
		keyboard = new Scanner(System.in);

		//BODY
		Homework7P1.myPrintHeader(7, 1, "3/13/2016");
		do 
		{
			System.out.println(MENU);
			System.out.print("Enter your choice: ");
			choice = Homework7P1.readChar("", keyboard, "ABX");
			System.out.println(" ");
			if (choice == 'A')
			{
				System.out.println("Choice A: ");
				System.out.println(JOKE);
			}
			else if (choice == 'B')
			{
				System.out.println("Choice B: ");
				System.out.print("Enter an Interger (0-100): ");
				userInt = Homework7P1.readInt("", keyboard, 0, 100);
				
				System.out.print("Enter a Decimal Interger (0-50): ");
				userDouble = Homework7P1.readDouble("", keyboard, 0, 50);
				
				userAvg = ((userInt + userDouble) / 2.0);
				System.out.println("The average of the two numbers you gave me was: " + userAvg);
				System.out.println(" ");
			}
		} while (choice != 'X');
		keyboard.close();
	}

	// DESCRIPTION:		Print author information for start of program
	// PRE-CONDITIONS:	All parameters are given valid values
	// POST-CONDITIONS:	Outputs author info to console
	public static void myPrintHeader(int hwNum, int projectNum, String lastMod)
	{
		System.out.println("===============================");
		System.out.println("Author: " + NAME);
		System.out.println("Course: " + COURSE);
		System.out.println("Section: " + SECTION);
		System.out.println("Homework #: " + hwNum);
		System.out.println("Project  #: " + projectNum);
		System.out.println("Last Modified: " + lastMod);
		System.out.println("===============================");
		System.out.println(" ");
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
				System.out.print("ERROR: Please enter a valid character " + "(" + validChars + ") :");
			}
		}while(charNum < 0);
        return userInput;
    }
}
