/********************************************
* AUTHOR: <Jack Rollinson>
* COURSE: CS 111 Intro to CS I
* SECTION: <Mon. + Wed. 11:00AM>
* HOMEWORK #: <homework #3>
* PROJECT #: <project #3>
* LAST MODIFIED: <2/16/2016>
********************************************/


/*****************************************************************************
* <Vending Machine Program.>
*****************************************************************************
* PROGRAM DESCRIPTION:
* <Program that determines the change to be dispensed from a vending machine in 5
* cent incraments, but the machine only accepts a single dollar bill.>
*****************************************************************************
* ALGORITHM:
* Prompt: "Enter the price of the item";
* Prompt:"(from 25 cents to a dollar, in 5-cent increments)";
* Input: user inputs cost of the item;
* Print: "You bought an item for 45 cents and gave me a dollar, so your change is:";
* Output: X Quarters, Y Dimes, and Z Nickels;
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* Scanner Class for user input.
*****************************************************************************/

// <IMPORTS GO HERE>
import java.util.Scanner;
public class ChangeCalc  
{

	/***** CONSTANT SECTION *****/
	public static final int CENT = 1;
	public static final int NICKEL = 5;
	public static final int DIME = 10;
	public static final int QUARTER = 25;
	public static final int DOLLAR = 100;
	public static void main(String[] args)
	{
	/***** DECLARATION SECTION *****/
	Scanner keyboard;
	int price, amount, quarters, dimes, nickels;
		
	/***** INITIALIZATION SECTION *****/
	keyboard = new Scanner(System.in);
	
	
	/***** INPUT SECTION *****/
	System.out.println("Enter the price of the item:");
	System.out.println("(from 25 cents to a dollar, in 5-cent increments)");
	price = keyboard.nextInt();
	System.out.println("You bought an item for " + price + " cents and gave me a dollar, so your change is:");
	
	/***** PROCESSING SECTION *****/
	amount = price;
	quarters = ((DOLLAR - amount) / QUARTER);
	amount = (DOLLAR - amount) % QUARTER;
	dimes = amount / DIME;
	amount = amount % DIME;
	nickels = amount / NICKEL;
	amount = amount % NICKEL;
	
	/***** OUTPUT SECTION *****/
	System.out.println(quarters + "quarters.");
	System.out.println(dimes + "dimes.");
	System.out.println(nickels + "nickels.");
	

	}
}
