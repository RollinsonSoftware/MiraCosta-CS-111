/********************************************
* AUTHOR: <Jack Rollinson>
* COURSE: CS 111 Intro to CS I
* SECTION: <Mon. + Wed. 11:00AM>
* HOMEWORK #: <Group Project 2>
* PROJECT #: <Group Project 2>
* LAST MODIFIED: <2/19/2016>
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
* Scanner class for user input.
* JOptionPane for pop-up boxes.
*****************************************************************************/

// <IMPORTS GO HERE>
import java.util.Scanner;
import javax.swing.JOptionPane;
public class GroupProject2  
{

	/***** CONSTANT SECTION *****/
	public static final String HEADER = "%-10s";
	public static final String LETTER = "%10s";
	public static final String ASCII = "%10d";

	public static void main(String[] args)
	{
	/***** DECLARATION SECTION *****/
	Scanner keyboard;
	String name, userImp /*, num1*/;
	int num1 /*, num2*/, asc1, asc2, asc3, asc4, asc5;
	char first, second, third, fourth, fifth, asc6;
	/***** INITIALIZATION SECTION *****/
	keyboard = new Scanner(System.in);
	
	
	/***** INPUT SECTION *****/
	System.out.print("Welcome! What is your name?");
	name = JOptionPane.showInputDialog("Welcome! What is your name?");
	System.out.println(" " + name);
	System.out.println("Hi " + name + ", let's play a game...");
	System.out.print("Enter a five letter word for me:");
	userImp = JOptionPane.showInputDialog("Enter a five letter word for me:");
	System.out.println(" " + userImp);
	System.out.print("Enter a number (33-126): ");//num1 = JOptionPane.showInputDialog("Enter a number (33-126)");
	num1 = keyboard.nextInt();//num2 = Interger.parseInt(num1);
		
	keyboard.close();
	
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
	asc6 = (char)num1/*num2*/;
	
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
	System.out.println("The number you entered was " + num1/*num2*/ + ", in ASCII code that would be: " + asc6);
	}
}
