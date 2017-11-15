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
*STORE: the menu as a constant
*READ: ("Enter Choice (A, B, or C): ")
*CHECK: choice = ProgramName.readChar()
*IF (choice = A)
* 	subTotal += 10.00
* 	pizzaSize = small
*ELSE IF (choice = B)
* 	subTotal += 12.00
*	pizzaSize = medium
*ElSE IF (choice = C)
* 	subTotal += 14.00
*	pizzaSize = Large
*PROMPT: Enter Toppings
*DO 
*	PROMPT: ("Enter toppings (DONE to stop): ")
* 	READ: topping = user input.
* 	
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* Scanner Class for user input.
*****************************************************************************/

// <IMPORTS GO HERE>
import java.util.Scanner;
public class Homework7P2  
{

	/***** CONSTANT SECTION *****/
	public static final String NAME = "Jack Rollinson";
	public static final String COURSE = "CS 111 Intro to CS I";
	public static final String SECTION = "Mon Wed 11:00am-1:00pm";
	public static final String DONE = "DONE";
	public static final String MONEY_FORMANT = "%-10.2f";
	public static final String MENU = "\nWelcome to Half-Shell Pies, COWABUNGA dudes!\nWhat can we get you?\n  A: Small Pizza ($10)\n  B: Medium Pizza ($12)\n  C: Large Pizza ($14)\n";
	public static void main(String[] args)
	{
	/***** DECLARATION SECTION *****/
	Scanner keyboard;
	String topping, toppingName, toppingSpace, pizzaSize;
	char choice;
	double subTotal, total, tax, toppingPrice;
	/***** INITIALIZATION SECTION *****/
	keyboard = new Scanner(System.in);
	pizzaSize = "";
	toppingName = "";
	toppingSpace = ", ";
	subTotal = 0;
	total = 0;
	tax = 1.55;
	toppingPrice = 1.75;
	/***** INPUT SECTION *****/
	Homework7P2.myPrintHeader(7, 2, "3/13/2016");
	System.out.print(MENU);
	choice = Homework7P2.readChar("Enter choice (A, B, or C): ", keyboard, "ABC");
	if (choice == 'A')
	{
		subTotal += 10;
		pizzaSize = "Small";
	}
	else if (choice == 'B')
	{
		subTotal += 12;
		pizzaSize = "Medium";
	}
	else if (choice == 'C')
	{
		subTotal += 14;
		pizzaSize = "Large";
	}
	System.out.println(" ");
	/***** PROCESSING SECTION *****/
	System.out.println("What toppings would you like?");
	do
	{
		System.out.print("Enter a topping (DONE to stop): ");
		topping = keyboard.nextLine();
		if (topping.compareTo(DONE) > 0 || topping.compareTo(DONE) < 0)
		{
			subTotal += toppingPrice;
			toppingName += (topping + toppingSpace);
		}
		else if (topping.compareTo(DONE) == 0)
		{
			subTotal -= toppingPrice;
		}
	} while (topping.compareTo(DONE) != 0);
	total = subTotal + tax;
	/***** OUTPUT SECTION *****/
	System.out.println(" ");
	System.out.printf("ORDER: " + pizzaSize + " w/ " + toppingName + "%n");
	System.out.printf("SUBTOTAL: $" + MONEY_FORMANT + "%n", subTotal);
	System.out.printf("TAX: $" + MONEY_FORMANT + "%n", tax);
	System.out.printf("TOTAL: $" + MONEY_FORMANT + "%n", total);
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
