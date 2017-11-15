/********************************************
* AUTHOR: <Jack Rollinson>
* COURSE: CS 111 Intro to CS I
* SECTION: <Mon. + Wed. 11:00AM>
* HOMEWORK #: <homework #6>
* PROJECT #: <project #6>
* LAST MODIFIED: <3/2/2016>
********************************************/


/*****************************************************************************
* <Sentence Reader!>
*****************************************************************************
* PROGRAM DESCRIPTION:
* <Takes a one line sentence as input and then based on the number of characters
* and the ending punctuation will output a special message for the user.>
*****************************************************************************
* ALGORITHM:
* INPUT: stringSentence = JOptionPane input;
* CALCULATE: stringLength = stringSentence.length();
* CALCULATE: lastChar = charAt(length()-1);
* IF (qMark.indexOf(?) > 0)
* {
* 	IF (stringLength % 2 == 0)
* 	{
* 		System.out.println("Yes");
* 	}
* 	ELSE
* 	{
* 		System.out.println("No");
* 	}
* }
* ELSE IF (eMark.indexOf(!) > 0)
* {
* 	System.out.println("Wow");
* }
* ElSE
* {
* 	System.out.println("You always say" + "\"" + stringSentence + "\"");
* }
* 
* 
* 
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* 
*****************************************************************************/

// <IMPORTS GO HERE>
import javax.swing.JOptionPane;
public class Homework6P1 
{

	/***** CONSTANT SECTION *****/

	public static void main(String[] args)
	{
	/***** DECLARATION SECTION *****/
	String sentenceString;
	int stringLength, temp, isQuestionMark, isExclamationPoint, evenOrOdd;
	boolean lastChar;
	
	
	/***** INITIALIZATION SECTION *****/
	char qMark = '?';
	char eMark = '!';
	/***** INPUT SECTION *****/
	sentenceString = JOptionPane.showInputDialog("Please enter either a statement or a question.");
	isQuestionMark = sentenceString.lastIndexOf(qMark);
	isExclamationPoint = sentenceString.lastIndexOf(eMark);
	evenOrOdd = isQuestionMark % 2;
	/***** PROCESSING SECTION *****/
	if (isQuestionMark >= 0)
	{
		if (evenOrOdd >= 1)
		{
			System.out.println("Yes");
		}
		else if (evenOrOdd <= 0)
		{
			System.out.println("No");
		}
	}
	else if (isExclamationPoint >= 0)
	{
		System.out.println("Wow");
	}
	else
	{
		System.out.println("You always say: " + "\"" + sentenceString + "\"");
	}
	/***** OUTPUT SECTION *****/
	

	}
}
