/********************************************
* AUTHOR: <Jack Rollinson>
* COURSE: CS 111 Intro to CS I
* SECTION: <Mon. + Wed. 11:00AM>
* HOMEWORK #: <homework #6>
* PROJECT #: <project #2>
* LAST MODIFIED: <3/6/2016>
********************************************/


/*****************************************************************************
* <Auto Grader>
*****************************************************************************
* PROGRAM DESCRIPTION:
* <Reads in a list of exam scores (interger percentrages in the range 0 to 100)
* and output the total number of grades as well as the number of grades in each
* letter-grade category and what percentage of the total grades each letter grade
* represents. The end of the input is indicated by a negative scre as a sentinel value.>
*****************************************************************************
* ALGORITHM:
* int score, gradeCount, aCount, bCount, cCount, dCount, fCount;
* double percentA, percentB, percentC, percentD, percentF;
* 
* count = 0;
* 
* do
* {
* PROMT: ("Please enter grade (-1 to exit): ");
* STORE: score = scanner input;
* 	if ((score <= 100) && (score >= 90))
* 	{
* 		++aCount;
* 	}
* 	else if ((score <= 89) && (score >= 80))
* 	{
* 		++bCount;
* 	}
* 	else if ((score <= 79) && (score >= 70))
* 	{
* 		++cCount;
* 	}
* 	else if ((score <= 69) && (score >= 60))
* 	{
* 		++dCount;
* 	}
* 	else if ((score <= 59) && (score >= 0))
* 	{
* 		++fCount;
* 	}
* ++gradeCount;
* }while (score >= 0);
* 
* percentA = count / (double)aCount;
* percentB = count / (double)bCount;
* percentC = count / (double)cCount;
* percentD = count / (double)dCount;
* percentF = count / (double)fCount;
* 
* OUTPUT: ("Total number of grades: " + count);
* OUTPUT: ("Number of A's: " + aCount + " which is " + percentA);
* OUTPUT: ("Number of B's: " + bCount + " which is " + percentB);
* OUTPUT: ("Number of C's: " + cCount + " which is " + percentC);
* OUTPUT: ("Number of D's: " + dCount + " which is " + percentD);
* OUTPUT: ("Number of F's: " + fCount + " which is " + percentF);
*  
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* Scanner class.
*****************************************************************************/

// <IMPORTS GO HERE>
import java.util.Scanner;
public class Homework6P2  
{

	/***** CONSTANT SECTION *****/
	public static final String PERCENT_FORMAT = "%3.1f";
	public static void main(String[] args)
	{
	/***** DECLARATION SECTION *****/
	Scanner keyboard;
	int score, gradeCount, aCount, bCount, cCount, dCount, fCount;
	double percentA, percentB, percentC, percentD, percentF;
	/***** INITIALIZATION SECTION *****/
	keyboard = new Scanner(System.in);
	gradeCount = 0;
	aCount = 0;
	bCount = 0;
	cCount = 0;
	dCount = 0;
	fCount = 0;
	
	/***** INPUT SECTION *****/
	do
	{
		System.out.print("Please enter grade (-1 to exit): ");
		score = keyboard.nextInt();
		if ((score <= 100) && (score >= 90))
		{
			++aCount;
		}
		else if ((score <= 89) && (score >= 80))
		{
			++bCount;
		}
		else if ((score <= 79) && (score >= 70))
		{
			++cCount;
		}
		else if ((score <= 69) && (score >= 60))
		{
			++dCount;
		}
		else if ((score <= 59) && (score >= 0))
		{
			++fCount;
		}
	++gradeCount;
	if (score < 0)
	{
		--gradeCount;
	}
	}while (score >= 0);
	/***** PROCESSING SECTION *****/
	percentA = ((double)aCount / gradeCount) * 100;
	percentB = ((double)bCount / gradeCount) * 100;
	percentC = ((double)cCount / gradeCount) * 100;	
	percentD = ((double)dCount / gradeCount) * 100;
	percentF = ((double)fCount / gradeCount) * 100;
	/***** OUTPUT SECTION *****/
	System.out.println(" ");
	System.out.printf("Total number of grades: " + gradeCount + "%n");
	System.out.printf("Number of A's: " + aCount + " which is " + PERCENT_FORMAT + "%%%n", percentA);
	System.out.printf("Number of B's: " + bCount + " which is " + PERCENT_FORMAT + "%%%n", percentB);
	System.out.printf("Number of C's: " + cCount + " which is " + PERCENT_FORMAT + "%%%n", percentC);
	System.out.printf("Number of D's: " + dCount + " which is " + PERCENT_FORMAT + "%%%n", percentD);
	System.out.printf("Number of F's: " + fCount + " which is " + PERCENT_FORMAT + "%%%n", percentF);

	}
}
