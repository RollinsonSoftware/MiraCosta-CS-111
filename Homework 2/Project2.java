/********************************************
* AUTHOR: <Jack Rollinson>
* COURSE: CS 111 Intro to CS I
* SECTION: <Mon. + Wed. 11:00AM>
* HOMEWORK #: <homework #3>
* PROJECT #: <project #2>
* LAST MODIFIED: <2/16/2016>
********************************************/


/*****************************************************************************
* <Word Scrambler!>
*****************************************************************************
* PROGRAM DESCRIPTION:
* <	reads in a line of text as input and	then output that
line but with the first word moved to the end of the line>
*****************************************************************************
* ALGORITHM:
* Prompt: Enter in a line of text with no puncuation;
* Get: the index of the start of the second word;
* Get: the first char of the second word;
* Convert: First char of the sentence to a Capital;
* Add: the rest of the sentence;
* Add: a space to the string that was cut;
* Get: the first word of the sentence;
* Output: corrected phrase.
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* Scanner= used for console input.
*****************************************************************************/

// <IMPORTS GO HERE>
import java.util.Scanner;
public class Project2  
{

	/***** CONSTANT SECTION *****/

	public static void main(String[] args)
	{
	/***** DECLARATION SECTION *****/
	Scanner keyboard;
	String sentence;
	String firstHalf;
	String secondHalf;
	/***** INITIALIZATION SECTION *****/
	keyboard = new Scanner(System.in);
	
	/***** INPUT SECTION *****/
	System.out.println("Enter a line of text, with no punctuation:");
	sentence = keyboard.nextLine();
	
	/***** PROCESSING SECTION *****/
	firstHalf = sentence.substring(5);
	
	/***** OUTPUT SECTION *****/
	System.out.println("You have typed: " + sentence);
	System.out.println("I have rephrased that line to say: " + firstHalf + " java?");

	}
}
