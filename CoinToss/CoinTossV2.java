/********************************************
* AUTHOR: <Jack Rollinson>
* COURSE: CS 111 Intro to CS I
* SECTION: <Mon. + Wed. 11:00AM>
* HOMEWORK #: <homework #5>
* PROJECT #: <project #2>
* LAST MODIFIED: <2/26/2016>
********************************************/


/*****************************************************************************
* <Coin Toss Version 2!>
*****************************************************************************
* PROGRAM DESCRIPTION:
* <Coin toss program that records user input and averages data, with out the
* use of anytype of branching!>
*****************************************************************************
* ALGORITHM:
* 
* INPUT: first coin toss via scanner class;
* INPUT: second coin toss via scanner class;
* INPUT: third coin toss via scanner class;
* INPUT: fourth coin toss via scanner class;
* INPUT: fifth coin toss via scanner class;
* INPUT: sixth coin toss via scanner class;
* INPUT: seventh coin toss via scanner class;
* INPUT: eighth coin toss via scanner class;
* 
* CONVERT: first-eighth H's/T's from chars to integers;
* 
* CALCULATE: numHeads =  (ASCII value of 'H') / (int value of all 'H's added up);
* CALCULATE: numTails =  (ASCII value of 'T') / (int value of all 'T's added up);
* CALCULATE: percentHeads = (numHeads / 8.0);
* CALCULATE: percentTails = (numTails / 8.0);
* 
* OUTPUT: ("Number of heads: " + numHeads);
* OUTPUT: ("Number of tails: " + numTails);
* OUTPUT: ("Percent heads: " + percentHeads);
* OUTPUT: ("Percent tails: " + percentTails);
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* Scanner class for user input.
*****************************************************************************/

// <IMPORTS GO HERE>
import java.util.Scanner;
public class CoinTossV2
{

	/***** CONSTANT SECTION *****/
	
	public static final String CLEANER = "%6.2f";
	public static final double TOSSNUM = 8.0;
	public static final int HVALUE = 72;
	public static final int TVALUE = 84;
	public static final int WVALUE = 32;
	
	public static void main(String[] args)
	{
	/***** DECLARATION SECTION *****/
	
	Scanner keyboard;
	
	String firstH, secondH, thirdH, fourthH, fifthH, sixthH, seventhH, eighthH;
	String firstT, secondT, thirdT, fourthT, fifthT, sixthT, seventhT, eighthT;
	
	char charConH1, charConH2, charConH3, charConH4, charConH5, charConH6, charConH7, charConH8;
	char charConT1, charConT2, charConT3, charConT4, charConT5, charConT6, charConT7, charConT8;
	
	int intConH1, intConH2, intConH3, intConH4, intConH5, intConH6, intConH7, intConH8;
	int intConT1, intConT2, intConT3, intConT4, intConT5, intConT6, intConT7, intConT8;
	int numHeads1, numHeads2, numHeads3, numHeads4, numHeads5, numHeads6, numHeads7, numHeads8;
	int numHeads1V2, numHeads2V2, numHeads3V2, numHeads4V2, numHeads5V2, numHeads6V2, numHeads7V2, numHeads8V2;
	int numTails1, numTails2, numTails3, numTails4, numTails5, numTails6, numTails7, numTails8;
	int numTails1V2, numTails2V2, numTails3V2, numTails4V2, numTails5V2, numTails6V2, numTails7V2, numTails8V2;
	int numberOfHeads, numberOfTails;
	
	double percentHeads,  percentTails;
	
	/***** INITIALIZATION SECTION *****/
	
	keyboard = new Scanner(System.in);
	
	/***** INPUT SECTION *****/
	//FIRST TOSS
	System.out.println("Was the first toss heads?");
	System.out.print("If so enter 'H', if it was tails just press 'ENTER': ");
	firstH = keyboard.nextLine();
	System.out.print("If it was tails enter 'T', if you already entered 'H' just press 'ENTER': " );
	firstT = keyboard.nextLine();
	//SECOND TOSS
	System.out.println("Was the second toss heads?");
	System.out.print("If so enter 'H', if it was tails just press 'ENTER': ");
	secondH = keyboard.nextLine();
	System.out.print("If it was tails enter 'T', if you already entered 'H' just press 'ENTER': ");
	secondT = keyboard.nextLine();
	//THIRD TOSS
	System.out.println("Was the third toss heads?");
	System.out.print("If so enter 'H', if it was tails just press 'ENTER': ");
	thirdH = keyboard.nextLine();
	System.out.print("If it was tails enter 'T', if you already entered 'H' just press 'ENTER': ");
	thirdT = keyboard.nextLine();
	//FOURTH TOSS
	System.out.println("Was the fourth toss heads?");
	System.out.print("If so enter 'H', if it was tails just press 'ENTER': ");
	fourthH = keyboard.nextLine();
	System.out.print("If it was tails enter 'T', if you already entered 'H' just press 'ENTER': ");
	fourthT = keyboard.nextLine();
	//FIFTH TOSS
	System.out.println("Was the fifth toss heads?");
	System.out.print("If so enter 'H', if it was tails just press 'ENTER': ");
	fifthH = keyboard.nextLine();
	System.out.print("If it was tails enter 'T', if you already entered 'H' just press 'ENTER': ");
	fifthT = keyboard.nextLine();
	//SIXTH TOSS
	System.out.println("Was the sixth toss heads?");
	System.out.print("If so enter 'H', if it was tails just press 'ENTER': ");
	sixthH = keyboard.nextLine();
	System.out.print("If it was tails enter 'T', if you already entered 'H' just press 'ENTER': ");
	sixthT = keyboard.nextLine();
	//SEVENTH TOSS
	System.out.println("Was the seventh toss heads?");
	System.out.print("If so enter 'H', if it was tails just press 'ENTER': ");
	seventhH = keyboard.nextLine();
	System.out.print("If it was tails enter 'T', if you already entered 'H' just press 'ENTER': ");
	seventhT = keyboard.nextLine();
	//EIGHTH TOSS
	System.out.println("Was the eighth toss heads?");
	System.out.print("If so enter 'H', if it was tails just press 'ENTER': ");
	eighthH = keyboard.nextLine();
	System.out.print("If it was tails enter 'T', if you already entered 'H' just press 'ENTER': ");
	eighthT = keyboard.nextLine();
	
	
	
	keyboard.close();
	
	/***** PROCESSING SECTION *****/
	//HEADS STRING TO CHAR CONVERSION
	charConH1 = firstH.charAt(0);
	charConH2 = secondH.charAt(0);
	charConH3 = thirdH.charAt(0);
	charConH4 = fourthH.charAt(0);
	charConH5 = fifthH.charAt(0);
	charConH6 = sixthH.charAt(0);
	charConH7 = seventhH.charAt(0);
	charConH8 = eighthH.charAt(0);
	//TAILS STRING TO CHAR CONVERSION
	charConT1 = firstT.charAt(0);
	charConT2 = secondT.charAt(0);
	charConT3 = thirdT.charAt(0);
	charConT4 = fourthT.charAt(0);
	charConT5 = fifthT.charAt(0);
	charConT6 = sixthT.charAt(0);
	charConT7 = seventhT.charAt(0);
	charConT8 = eighthT.charAt(0);
	//HEADS CHAR TO INT CONVERSION
	intConH1 = (int)charConH1;
	intConH2 = (int)charConH2;
	intConH3 = (int)charConH3;
	intConH4 = (int)charConH4;
	intConH5 = (int)charConH5;
	intConH6 = (int)charConH6;
	intConH7 = (int)charConH7;
	intConH8 = (int)charConH8;
	//TAILS CHAR TO INT CONVERSION
	intConT1 = (int)charConT1;
	intConT2 = (int)charConT2;
	intConT3 = (int)charConT3;
	intConT4 = (int)charConT4;
	intConT5 = (int)charConT5;
	intConT6 = (int)charConT6;
	intConT7 = (int)charConT7;
	intConT8 = (int)charConT8;
	//CUT WHITE SPACE FROM HEADS
	numHeads1 = intConH1 - WVALUE;
	numHeads1V2 = numHeads1 / 40;
	numHeads2 = intConH2 - WVALUE;
	numHeads2V2 = numHeads2 / 40;
	numHeads3 = intConH3 - WVALUE;
	numHeads3V2 = numHeads3 / 40;
	numHeads4 = intConH4 - WVALUE;
	numHeads4V2 = numHeads4 / 40;
	numHeads5 = intConH5 - WVALUE;
	numHeads5V2 = numHeads5 / 40;
	numHeads6 = intConH6 - WVALUE;
	numHeads6V2 = numHeads6 / 40;
	numHeads7 = intConH7 - WVALUE;
	numHeads7V2 = numHeads7 / 40;
	numHeads8 = intConH8 - WVALUE;
	numHeads8V2 = numHeads8 / 40;
	//CUT WHITE SPACE FROM TAILS
	numTails1 = intConT1 - WVALUE;
	numTails1V2 = numTails1 / 52;
	numTails2 = intConT2 - WVALUE;
	numTails2V2 = numTails2 / 52;
	numTails3 = intConT3 - WVALUE;
	numTails3V2 = numTails3 / 52;
	numTails4 = intConT4 - WVALUE;
	numTails4V2 = numTails4 / 52;
	numTails5 = intConT5 - WVALUE;
	numTails5V2 = numTails5 / 52;
	numTails6 = intConT6 - WVALUE;
	numTails6V2 = numTails6 / 52;
	numTails7 = intConT7 - WVALUE;
	numTails7V2 = numTails7 / 52;
	numTails8 = intConT8 - WVALUE;
	numTails8V2 = numTails8 / 52;
	
	numberOfHeads = numHeads1V2 + numHeads2V2 + numHeads3V2 + numHeads4V2 + numHeads5V2 + numHeads6V2 + numHeads7V2 + numHeads8V2;
	numberOfTails = numTails1V2 + numTails2V2 + numTails3V2 + numTails4V2 + numTails5V2 + numTails6V2 + numTails7V2 + numTails8V2;
	
	percentHeads = (numberOfHeads / TOSSNUM) * 100;
	percentTails = (numberOfTails / TOSSNUM) * 100;
	
	/***** OUTPUT SECTION *****/
	System.out.println("Number of heads: " + numberOfHeads);
	System.out.println("Number of tails: " + numberOfTails);
	System.out.printf("Percent heads: " + CLEANER + "%%%n", percentHeads);
	System.out.printf("Percent tails: " + CLEANER + "%%%n", percentTails);

	}
}
