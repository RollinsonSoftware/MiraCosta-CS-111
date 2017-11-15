/********************************************
* AUTHOR: <Jack Rollinson, Michale Q.>
* COURSE: CS 111 Intro to CS I
* SECTION: <Mon. + Wed. 11:00AM>
* HOMEWORK #: <Group Project 1>
* PROJECT #: <Group Project 1>
* LAST MODIFIED: <2/17/2016>
********************************************/


/*****************************************************************************
* < >
*****************************************************************************
* PROGRAM DESCRIPTION:
* <	>
*****************************************************************************
* ALGORITHM:
* 
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* 
*****************************************************************************/

// <IMPORTS GO HERE>
import java.util.Scanner;
public class GroupProject1  
{

	/***** CONSTANT SECTION *****/
	public static final String HEADER = "%-10s";
	public static final String LETTER = "%10s";
	public static final String ASCII = "%10d";

	public static void main(String[] args)
	{
	/***** DECLARATION SECTION *****/
	Scanner keyboard;
	String name, userImp;
	int num1, asc1, asc2, asc3, asc4, asc5;
	char first, second, third, fourth, fifth, asc6;
	/***** INITIALIZATION SECTION *****/
	keyboard = new Scanner(System.in);
	
	
	/***** INPUT SECTION *****/
	System.out.print("Welcome! What is your name? ");
	name = keyboard.nextLine();
	System.out.println("Hi " + name + ", let's play a game...");
	System.out.print("Enter a five letter word for me: ");
	userImp = keyboard.nextLine();
	System.out.print("Enter a number (33-126): ");
	num1 = keyboard.nextInt();
	
	
	/***** PROCESSING SECTION *****/
	first = userImp.charAt(0);
	second = userImp.charAt(1);
	third = userImp.charAt(2);
	fourth = userImp.charAt(3);
	fifth = userImp.charAt(4);
	
	asc1 = (int)first;
	asc2 = (int)second;
	asc3 = (int)third;
	asc4 = (int)fourth;
	asc5 = (int)fifth;
	asc6 = (char)num1;
	
	/***** OUTPUT SECTION *****/
	System.out.printf("---------------------------%n");
	System.out.printf("| " + HEADER + " | " + HEADER + " |%n", "LETTERS", "ASCII CODE");
	System.out.printf("---------------------------%n");
	System.out.printf("| " + LETTER + " | " + ASCII + " |%n", first, asc1);
	System.out.printf("| " + LETTER + " | " + ASCII + " |%n", second, asc2);
	System.out.printf("| " + LETTER + " | " + ASCII + " |%n", third, asc3);
	System.out.printf("| " + LETTER + " | " + ASCII + " |%n", fourth, asc4);
	System.out.printf("| " + LETTER + " | " + ASCII + " |%n", fifth, asc5);
	System.out.printf("---------------------------%n");
	System.out.println("The number you entered was " + num1 + ", in ASCII code that would be: " + asc6);
	}
}
