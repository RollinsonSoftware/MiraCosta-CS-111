/********************************************
* AUTHOR: <Jack Rollinson>
* COURSE: CS 111 Intro to CS I
* SECTION: <Mon. + Wed. 11:00AM>
* HOMEWORK #: <homework #5>
* PROJECT #: <project #1>
* LAST MODIFIED: <2/24/2016>
********************************************/


/*****************************************************************************
* <Coin Toss Recorder!>
*****************************************************************************
* PROGRAM DESCRIPTION:
* <Coin toss program that records user input and averages data.	>
*****************************************************************************
* ALGORITHM:
* CONSTANTS (double): TOSSNUM = 8.0
* DECLARE CHAR: firstToss, secondToss, thirdToss, fourthToss, fifthToss, sixithToss, seventhToss, eighthToss;
* DECLARE INT: headCount, tailCount;
* DECLARE DOUBLE: percentHeads, percentTails;
* PROMPT: ("Enter 'H' for heads and 'T' for tails.");
* PROMPT: first coin toss = user input via JOptionPane;
* PROMPT: second coin toss = user input via JOptionPane;
* PROMPT: third coin toss = user input via JOptionPane;
* PROMPT: fourth coin toss = user input via JOptionPane;
* PROMPT: fifth coin toss = user input via JoptionPane;
* PROMPT: sixith coin toss = user input via JoptionPane;
* PROMPT: seventh coin toss = user input via JoptionPane;
* PROMPT: eighth coin toss = user input via JoptionPane;
* 
* switch (firstToss) **REPEAT THIS SWITCH FOR EACH COIN TOSS**	
* {
* 	case 'H':
* 		++headCount;
* 		break;
* 	case 'T':
* 		++tailCount;
* 		break;
* 	default:
* 		System.out.println("ERROR: Invalid Entry");
* 		break;
* }
* CALCULATE: percentHeads = (headCount / TOSSNUM);
* CALCULATE: percentTails = (tailCount / TOSSNUM);
* 
* OUTPUT: ("Number of heads: " + headCount);
* OUTPUT: ("Number of tails: " + tailCount);
* OUTPUT: ("Percent Heads: " + percentHeads);
* OUTPUT: ("Percent Tails: " + percentTails);
* 
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* JOptionPane for user input.
* 
*****************************************************************************/

// <IMPORTS GO HERE>
import javax.swing.JOptionPane;
public class CoinToss  
{

	/***** CONSTANT SECTION *****/
	public static final double TOSSNUM = 8.0;
	public static final String CLEAN = "%6.2f";
	
	public static void main(String[] args)
	{
	/***** DECLARATION SECTION *****/
	
	int headCount, tailCount;
	
	double percentHeads, percentTails;
	
	/***** INITIALIZATION SECTION *****/
	
	headCount = 0;
	tailCount = 0;
	
	/***** INPUT SECTION *****/
	
	char firstToss = JOptionPane.showInputDialog("Enter 'H' for heads and 'T' for tails.\n What was the first result?").charAt(0);
	char secondToss = JOptionPane.showInputDialog("Enter 'H' for heads and 'T' for tails.\n What was the second result?").charAt(0);
	char thirdToss = JOptionPane.showInputDialog("Enter 'H' for heads and 'T' for tails.\n What was the third result?").charAt(0);
	char fourthToss = JOptionPane.showInputDialog("Enter 'H' for heads and 'T' for Tails.\n What was the fourth result?").charAt(0);
	char fifthToss = JOptionPane.showInputDialog("Enter 'H' for heads and 'T' for Tails.\n What was the fifth result?").charAt(0);
	char sixthToss = JOptionPane.showInputDialog("Enter 'H' for heads and 'T for Tails.\n What was the sixth result?").charAt(0);
	char seventhToss  = JOptionPane.showInputDialog("Enter 'H' for heads and 'T' for Tails.\n What was the seventh result?").charAt(0);
	char eighthToss = JOptionPane.showInputDialog("Enter 'H' for heads and 'T' for Tails.\n What was the eighth result?").charAt(0);
	
	/***** PROCESSING SECTION *****/
	// FIRST TOSS
	if (firstToss == 'H')
	{
		++headCount;	
	}
	else if (firstToss == 'T')
	{
		++tailCount;
	}
	// SECOND TOSS
	if (secondToss == 'H')
	{
		++headCount;
	}
	else if (secondToss == 'T')
	{
		++tailCount;
	}
	// THIRD TOSS
	if (thirdToss == 'H')
	{
		++headCount;
	}
	else if (thirdToss == 'T')
	{
		++tailCount;
	}
	// FOURTH TOSS
	if (fourthToss == 'H')
	{
		++headCount;
	}
	else if (fourthToss == 'T')
	{
		++tailCount;
	}
	// FIFTH TOSS
	if (fifthToss == 'H')
	{
		++headCount;
	}
	else if (fifthToss == 'T')
	{
		++tailCount;
	}
	// SIXTH TOSS
	if (sixthToss == 'H')
	{
		++headCount;
	}
	else if (sixthToss == 'T')
	{
		++tailCount;
	}
	// SEVENTH TOSS
	if (seventhToss == 'H')
	{
		++headCount;
	}
	else if (seventhToss == 'T')
	{
		++tailCount;
	}
	// EIGHTH TOSS
	if (eighthToss == 'H')
	{
		++headCount;
	}
	else if (eighthToss == 'T')
	{
		++tailCount;
	}
	
	percentHeads = ((headCount / TOSSNUM) * 100);
	percentTails = ((tailCount / TOSSNUM) * 100);
	
	/***** OUTPUT SECTION *****/
	System.out.println("Number of heads: " + headCount);
	System.out.println("Number of tails: " + tailCount);
	System.out.printf("Percent heads: " + CLEAN + "%%%n", percentHeads);
	System.out.printf("Percent tails: " + CLEAN + "%%%n", percentTails);

	}
}
