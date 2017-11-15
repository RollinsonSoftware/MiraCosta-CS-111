/********************************************
* AUTHOR: <Jack Rollinson>
* COURSE: CS 111 Intro to CS I
* SECTION: <Mon. + Wed. 11:00AM>
* HOMEWORK #: <homework #11>
* PROJECT #: <project #2>
* LAST MODIFIED: <4/24/2016>
********************************************/


/*****************************************************************************
* <Check Digit Calculator>
*****************************************************************************
* PROGRAM DESCRIPTION:
* <Writes a program that takes in an account number (of any length) fromt he user
* without the check digit, and output the full account number.>
*****************************************************************************
* ALGORITHM:
* PROMPT: "Please enter your account number: "
* READ: Account numbers as a string.
* Real Account Number =  new int[accountString.length];
*		START FOR LOOP (int i = 0; i < accountString.length(); i++)
*			Real Account Number[i] = Digit.trueValue(accountString.charAt(i));
*			if (i % 2 == 1) //Step 1
*			{
*				Real Account Number[i] = Digit.trueValue(accountString.charAt(i)) * 2;
*			}
*			START IF (Real Account Number[i] >= 10)
*				AccountNumber[i] -= 10
*				AccountNumber[i] += 1
*			END IF	
* 		END FOR LOOP		
*PRINT: "Your full account number is: " + AccountNumberString + Check Digit.
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* Scanner Class for user input.
*****************************************************************************/
import java.util.Scanner;
public class CheckDigitCalc
{
	public static void main(String[] args)
	{
		String accountNum;
		Scanner keyboard;
		int[] trueAccountNumber;
		
		keyboard = new Scanner(System.in);
		
		Cs111.myPrintHeader(11, 2, "4/24/2016");
		System.out.print("Please enter your account number: ");
		accountNum =  keyboard.nextLine();
		trueAccountNumber =  new int[accountNum.length()];
		
		for (int i = 0; i < accountNum.length(); i++)
		{
			trueAccountNumber[i] = Digit.trueValue(accountNum.charAt(i));
			if (i % 2 == 1) //Step 1
			{
				trueAccountNumber[i] = Digit.trueValue(accountNum.charAt(i)) * 2;
			}
			if (trueAccountNumber[i] >= 10) //Step 2
			{
				trueAccountNumber[i] -= 10;
				trueAccountNumber[i] += 1;
			}
		}
		System.out.println("Your full account number is: " + accountNum + Digit.checkDigit(Digit.sum(trueAccountNumber)));
	}
}
