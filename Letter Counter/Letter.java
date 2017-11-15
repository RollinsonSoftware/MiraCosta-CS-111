/********************************************
* AUTHOR: <Jack Rollinson>
* COURSE: CS 111 Intro to CS I
* SECTION: <Mon. + Wed. 11:00AM>
* HOMEWORK #: <homework #11>
* PROJECT #: <project #1>
* LAST MODIFIED: <4/24/2016>
********************************************/


/*****************************************************************************
* <Letter Counter!>
*****************************************************************************
* PROGRAM DESCRIPTION:
* <Reads in a line of text and outputs how many times each letter occurs.>
*****************************************************************************
* ALGORITHM:
* PROMPT: Please enter a sentecne, don't forget the period!
* DO
* 	READ: in users sentence.
* 	FIND: index of the period.
* 	START IF (no period in the sentence?)
* 		OUTPUT: "ERROR! You forgot the period!"
* 	END IF
*	START IF (there is a period in the sentence)
* 		make substring from 0 to the index of the period.
* 	END IF
* WHILE (there is a period in the sentence)
* CONVERT: sentence sub-string to all lower case letters.
* CLOSE KEYBOARD
* FOR (runs according to the number of indicies in the array.)
* {
* 	change each character in the String and turn it into a number.
* 	START IF
* 	depending on the number returned, add 1 to the count of that index.
* 	END IF
* }
* FOR (runs according to the number of indicies in the array.)
* {
* 	START IF (indexed value > 0)
* 		OUTPUT: This letter occured x number of times.
* 	END IF
* }
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* Scanner Class for user input.
*****************************************************************************/
import java.util.Scanner;
public class Letter
{
	public static final int ALPHA_NUM = 26;
	
	public static void main(String[] args)
	{
		int[] letterCount;
		String message;
		Scanner keyboard;
		int period;
		
		letterCount = new int[ALPHA_NUM];
		keyboard = new Scanner(System.in);
		
		Cs111.myPrintHeader(11, 1, "4/23/2016");
		System.out.println("Please enter a sentence, don't forget the period: ");
		do
		{
			message = keyboard.nextLine();
			period = message.indexOf('.');
			if (period < 0)
			{
				System.out.println("Error, you forgot the period try again!");
			}
			else if (period >= 0)
			{
				message = message.substring(0, period);
			}
		}while (period < 0);
		message = message.toLowerCase();
		keyboard.close();
		for (int i = 0; i < message.length(); i++)
		{
			int index;
			index = LetterCounter.letterToNum(message.charAt(i));
			if (index == 0)
			{
				letterCount[0] += 1; 
			}
			else if (index == 1)
			{
				letterCount[1] += 1; 
			}
			else if (index == 2)
			{
				letterCount[2] += 1; 
			}
			else if (index == 3)
			{
				letterCount[3] += 1; 
			}
			else if (index == 4)
			{
				letterCount[4] += 1; 
			}
			else if (index == 5)
			{
				letterCount[5] += 1; 
			}
			else if (index == 6)
			{
				letterCount[6] += 1; 
			}
			else if (index == 7)
			{
				letterCount[7] += 1; 
			}
			else if (index == 8)
			{
				letterCount[8] += 1; 
			}
			else if (index == 9)
			{
				letterCount[9] += 1; 
			}
			else if (index == 10)
			{
				letterCount[10] += 1; 
			}
			else if (index == 11)
			{
				letterCount[11] += 1; 
			}
			else if (index == 12)
			{
				letterCount[12] += 1; 
			}
			else if (index == 13)
			{
				letterCount[13] += 1; 
			}
			else if (index == 14)
			{
				letterCount[14] += 1; 
			}
			else if (index == 15)
			{
				letterCount[15] += 1; 
			}
			else if (index == 16)
			{
				letterCount[16] += 1; 
			}
			else if (index == 17)
			{
				letterCount[17] += 1; 
			}
			else if (index == 18)
			{
				letterCount[18] += 1; 
			}
			else if (index == 19)
			{
				letterCount[19] += 1; 
			}
			else if (index == 20)
			{
				letterCount[20] += 1; 
			}
			else if (index == 21)
			{
				letterCount[21] += 1; 
			}
			else if (index == 22)
			{
				letterCount[22] += 1; 
			}
			else if (index == 23)
			{
				letterCount[23] += 1; 
			}
			else if (index == 24)
			{
				letterCount[24] += 1; 
			}
			else if (index == 25)
			{
				letterCount[25] += 1; 
			}
			else if (index == 26)
			{
				letterCount[26] += 1; 
			}
		}
		for (int i = 0; i < ALPHA_NUM; i++)
		{
			if (letterCount[i] > 0)
			{
				System.out.println("Number of " + LetterCounter.numToLetter(i) + "'s : " + letterCount[i]);
			}
		}
	}
}
