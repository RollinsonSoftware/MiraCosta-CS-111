/********************************************
* AUTHOR: <Jack Rollinson>
* COURSE: CS 111 Intro to CS I
* SECTION: <Mon. Wed. 11:00>
* HOMEWORK #: <homework #3>
* PROJECT #: <project #1>
* LAST MODIFIED: <2/16/2016>
********************************************/


/*****************************************************************************
* <TITLE OF PROGRAM> Mortgage Payment Program!
*****************************************************************************
* PROGRAM DESCRIPTION:
* <1-2 sentences describing overall program> A program that reads in the amount of a monthly mortgage payment and the outstanding balance.
* Then outputs the amount of the payment that goes to interest and the amount that goes to the principal amount.
*****************************************************************************
* ALGORITHM:
* CONSTANT: interest rate = 0.0749;
* monthly mortgage payment;
* outstanding balance;
* Prompt: The monthly mortgage payment is: = monthly mortgage payment;
* Prompt: The outstanding balance is: = outstanding balance;
* monthly payment going to interest;
* Calculate: (outstanding balance * interest rate) / 12 = monthly payment going to interest;
* Print: monthly payment going to interest;
* principle amount;
* principle amount = monthly mortgage payment - monthly payment going to interest;
* Print: principle amount;
* new balance;
* new balance =  outstanding balance - principel amount;
* Print: new balance
*****************************************************************************/

// <IMPORTS GO HERE>
public class  Mortgage
{

	/***** CONSTANT SECTION *****/
	public static final double INTEREST_RATE = 0.0749;
	
	public static final String WHITESPACE = " ";
	public static final String CASE_1 = "Case 1";
	public static final String CASE_2 = "Case 2";
	public static final String CASE_3 = "Case 3";
	public static final String MONTHLY_PAYMENT = "Monthly Payment";
	public static final String OUTSTADNING_BALANCE = "Outstanding Balance";
	public static final String MONTHLY_INTEREST_PAYMENT = "Monthly Interest Payment";
	public static final String PRINCIPLE_AMOUNT = "Principle Amount";
	public static final String NEW_BALANCE = "New Balance";
	
	public static final String WORDSPEC = "%-30s";
	public static final String NUMBERSPEC_INT = "%,30d";
	public static final String NUMBERSPEC_DOUBLE = "%,30.2f"; 
	
	public static void main(String[] args)
	{
	/***** DECLARATION SECTION *****/
	int monthlyPay1;
	int monthlyPay2;
	int monthlyPay3;
	int outBalance1;
	int outBalance2;
	int outBalance3;
	double monthlyIntPay1;
	double monthlyIntPay2;
	double monthlyIntPay3;
	double prinAmount1;
	double prinAmount2;
	double prinAmount3;
	double newBal1;
	double newBal2;
	double newBal3;
	/***** INITIALIZATION SECTION *****/
	monthlyPay1 = 3000;
	outBalance1 = 300000;
	monthlyPay2 = 1000;
	outBalance2 = 250000;
	monthlyPay3 = 2000;
	outBalance3 = 250000;
	/***** PROCESSING SECTION *****/
	monthlyIntPay1 = (outBalance1 * INTEREST_RATE) / 12;
	monthlyIntPay2 = (outBalance2 * INTEREST_RATE) / 12;
	monthlyIntPay3 = (outBalance3 * INTEREST_RATE) / 12;
	prinAmount1 = monthlyPay1 - monthlyIntPay1;
	prinAmount2 = monthlyPay2 - monthlyIntPay2;
	prinAmount3 = monthlyPay3 - monthlyIntPay3;
	newBal1 = outBalance1 - prinAmount1;
	newBal2 = outBalance2 - prinAmount2;
	newBal3 = outBalance3 - prinAmount3;
	/***** OUTPUT SECTION *****/
	System.out.printf("| " + WORDSPEC + " | " + WORDSPEC + " | " + WORDSPEC + " | " + WORDSPEC + " |%n", WHITESPACE, CASE_1, CASE_2, CASE_3);
	System.out.printf("| " + WORDSPEC + " | " + NUMBERSPEC_INT + " | " + NUMBERSPEC_INT + " | " + NUMBERSPEC_INT + " |%n", MONTHLY_PAYMENT, monthlyPay1, monthlyPay2, monthlyPay3);
	System.out.printf("| " + WORDSPEC + " | " + NUMBERSPEC_INT + " | " + NUMBERSPEC_INT + " | " + NUMBERSPEC_INT + " |%n", OUTSTADNING_BALANCE, outBalance1, outBalance2, outBalance3);
	System.out.printf("| " + WORDSPEC + " | " + NUMBERSPEC_DOUBLE + " | " + NUMBERSPEC_DOUBLE + " | " + NUMBERSPEC_DOUBLE + " |%n", MONTHLY_INTEREST_PAYMENT, monthlyIntPay1, monthlyIntPay2, monthlyIntPay3);
	System.out.printf("| " + WORDSPEC + " | " + NUMBERSPEC_DOUBLE + " | " + NUMBERSPEC_DOUBLE + " | " + NUMBERSPEC_DOUBLE + " |%n", PRINCIPLE_AMOUNT, prinAmount1, prinAmount2, prinAmount3);
	System.out.printf("| " + WORDSPEC + " | " + NUMBERSPEC_DOUBLE + " | " + NUMBERSPEC_DOUBLE + " | " + NUMBERSPEC_DOUBLE + " |%n", NEW_BALANCE, newBal1, newBal2, newBal3);
	}
}
