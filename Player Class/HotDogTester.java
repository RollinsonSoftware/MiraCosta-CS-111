/********************************************
* AUTHOR: <Jack Rollinson>
* COURSE: CS 111 Intro to CS I
* SECTION: <Mon. + Wed. 11:00AM>
* HOMEWORK #: <Homework #10>
* PROJECT #: <Project #1>
* LAST MODIFIED: <4/17/2016>
********************************************/

/*****************************************************************************
* <Hot Dog Stand Manager>
*****************************************************************************
* PROGRAM DESCRIPTION:
* <Tester for the HotDogStand class.>
*****************************************************************************
* ALGORITHM:
*PROMT welcome to the Hot Dog Stand Manager!
*STORE: the menu as a constant
*READ: ("Enter Choice (A, B, or C): ")
*CHECK: choice = ProgramName.readChar()
*IF (choice = A)
* 	subTotal += 1.00
* 	HotDog = Normal
*ELSE IF (choice = B)
* 	subTotal += 2.00
*	HotDog = Corndog
*ElSE IF (choice = C)
* 	subTotal += 3.00
*	HotDog = Chilli Dog
*PROMPT: Enter Toppings
*DO 
*	PROMPT: ("Enter toppings (DONE to stop): ")
* 	READ: topping = user input.
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* Scanner Class for user input.
*****************************************************************************/
import java.util.Scanner;
public class HotDogTester
{
	public static final String DONE = "DONE";
	public static final String MONEY_FORMANT = "%-10.2f";
	public static final String MENU = "\nWelcome to Hotdog Stand Manager 2.0!\nWhat can we get you?\n  A: Regular Hotdog ($1)\n  B: Corndog ($2)\n  C: Chili-Dog ($3)\n";
	
	public static void main(String[] args)
	{
		HotDogStand Stand1;
		HotDogStand Stand2;
		HotDogStand Stand3;
		Scanner keyboard;
		String topping1, toppingName1, toppingSpace, hotDogType;
		String topping2, toppingName2;
		String topping3, toppingName3;
		char choice;
		double subTotal1, total1, tax, toppingPrice;
		double subTotal2, total2;
		double subTotal3, total3;
		
		Stand1 = new HotDogStand(1234, "Jack Rollinson");
		Stand2 = new HotDogStand();
		Stand3 = new HotDogStand(Stand2);
		keyboard = new Scanner(System.in);
		hotDogType = "";
		toppingName1 = "";
		toppingName2 = "";
		toppingName3 = "";
		toppingSpace = ", ";
		subTotal1 = 0;
		subTotal2 = 0;
		subTotal3 = 0;
		total1 = 0;
		total2 = 0;
		total3 = 0;
		tax = 1.55;
		toppingPrice = 1.00;
		
		Stand2.setStandID(4566);
		Stand3.setAll(4577, "Ricky Bobby");
		
		System.out.println(" ");
		System.out.println("Current Stands Open: ");
		System.out.println(Stand1);
		System.out.println(Stand2);
		System.out.println(Stand3);
		System.out.println(" ");
		System.out.println("Lets make sure that all the stands are unique, is Stand 1 and 3 Equal?");
		if (Stand1.equals(Stand3) == false)
		{
			System.out.println(" ...... These stands are one of a kind!");
			System.out.println(" ");
		}
		else if (Stand1.equals(Stand3) == true)
		{
			System.out.println(" ...... These stands are NOT unique!");
			System.out.println(" ");
		}
		//FIRST STAND
		System.out.print(MENU);
		choice = Cs111.readChar("Enter choice (A, B, or C): ", keyboard, "ABC");
		if (choice == 'A')
		{
			subTotal1 += 1;
			hotDogType = "Regular Hotdog";
			Stand1.justSold();
		}
		else if (choice == 'B')
		{
			subTotal1 += 2;
			hotDogType = "Corndog";
			Stand1.justSold();
		}
		else if (choice == 'C')
		{
			subTotal1 += 3;
			hotDogType = "Chili-Dog";
			Stand1.justSold();
		}
		System.out.println("What toppings would you like? (1$ each!)");
		do
		{
			System.out.print("Enter a topping (DONE to stop and move on to the next stand): ");
			topping1 = keyboard.nextLine();
			if (topping1.compareTo(DONE) > 0 || topping1.compareTo(DONE) < 0)
			{
				subTotal1 += toppingPrice;
				toppingName1 += (topping1 + toppingSpace);
			}
			else if (topping1.compareTo(DONE) == 0)
			{
				subTotal1 -= toppingPrice;
			}
		} while (topping1.compareTo(DONE) != 0);
		total1 = subTotal1 + tax;
		System.out.println(" ");
		System.out.printf("ORDER: " + hotDogType + " w/ " + toppingName1 + "%n");
		System.out.printf("SUBTOTAL: $" + MONEY_FORMANT + "%n", subTotal1);
		System.out.printf("TAX: $" + MONEY_FORMANT + "%n", tax);
		System.out.printf("TOTAL: $" + MONEY_FORMANT + "%n", total1);
		System.out.println(" ");
		// SECOND STAND
		System.out.print(MENU);
		choice = Cs111.readChar("Enter choice (A, B, or C): ", keyboard, "ABC");
		if (choice == 'A')
		{
			subTotal2 += 1;
			hotDogType = "Regular Hotdog";
			Stand2.justSold();
		}
		else if (choice == 'B')
		{
			subTotal2 += 2;
			hotDogType = "Corndog";
			Stand2.justSold();
		}
		else if (choice == 'C')
		{
			subTotal2 += 3;
			hotDogType = "Chili-Dog";
			Stand2.justSold();
		}
		System.out.println("What toppings would you like? (1$ each!)");
		do
		{
			System.out.print("Enter a topping (DONE to stop and move on to the next stand): ");
			topping2 = keyboard.nextLine();
			if (topping2.compareTo(DONE) > 0 || topping2.compareTo(DONE) < 0)
			{
				subTotal2 += toppingPrice;
				toppingName2 += (topping2 + toppingSpace);
			}
			else if (topping2.compareTo(DONE) == 0)
			{
				subTotal2 -= toppingPrice;
			}
		} while (topping2.compareTo(DONE) != 0);
		total2 = subTotal2 + tax;
		System.out.println(" ");
		System.out.printf("ORDER: " + hotDogType + " w/ " + toppingName2 + "%n");
		System.out.printf("SUBTOTAL: $" + MONEY_FORMANT + "%n", subTotal2);
		System.out.printf("TAX: $" + MONEY_FORMANT + "%n", tax);
		System.out.printf("TOTAL: $" + MONEY_FORMANT + "%n", total2);
		System.out.println(" ");
		// THIRD STAND
		System.out.print(MENU);
		choice = Cs111.readChar("Enter choice (A, B, or C): ", keyboard, "ABC");
		if (choice == 'A')
		{
			subTotal3 += 1;
			hotDogType = "Regular Hotdog";
			Stand3.justSold();
		}
		else if (choice == 'B')
		{
			subTotal3 += 2;
			hotDogType = "Corndog";
			Stand3.justSold();
		}
		else if (choice == 'C')
		{
			subTotal3 += 3;
			hotDogType = "Chili-Dog";
			Stand3.justSold();
		}
		System.out.println("What toppings would you like? (1$ each!)");
		do
		{
			System.out.print("Enter a topping (DONE to stop and move on to the next stand): ");
			topping3 = keyboard.nextLine();
			if (topping3.compareTo(DONE) > 0 || topping3.compareTo(DONE) < 0)
			{
				subTotal3 += toppingPrice;
				toppingName3 += (topping3 + toppingSpace);
			}
			else if (topping3.compareTo(DONE) == 0)
			{
				subTotal3 -= toppingPrice;
			}
		} while (topping3.compareTo(DONE) != 0);
		total3 = subTotal3 + tax;
		System.out.println(" ");
		System.out.printf("ORDER: " + hotDogType + " w/ " + toppingName3 + "%n");
		System.out.printf("SUBTOTAL: $" + MONEY_FORMANT + "%n", subTotal3);
		System.out.printf("TAX: $" + MONEY_FORMANT + "%n", tax);
		System.out.printf("TOTAL: $" + MONEY_FORMANT + "%n", total3);
		System.out.println(" ");
		//TOTALS
		System.out.println(Stand1);
		System.out.println(Stand2);
		System.out.println(Stand3);
		System.out.println("Total Sales from all stands: " + HotDogStand.getGrandTotalSold());
	}
}
