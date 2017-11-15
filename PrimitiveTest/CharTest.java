import java.util.Scanner;

public class CharTest
{
	
	//REMOVE MAIN() METHOD ONCE ALL METHODS ARE WORKING!
	public static void main(String[] args)
	{
        //DECLARATIONS
		Scanner keyboard;
		char charTest;

        //INITIALIZATIONS
		keyboard = new Scanner(System.in);

        //TESTING CODE
		System.out.println("Hi User! You're going to help us test this code!");
		System.out.println("Please follow the instructions, as the output will " +
							"help you find if their is an error!\n\n");
		
	    //testing uppercase values
		System.out.println("You are about to be asked for char input, please enter X for it.");
		charTest = readChar("Enter a char: ", keyboard, "XYZxyz");
		System.out.println("The value of charTest should be X and its " + charTest + "\n");

        System.out.println("You are about to be asked for char input, please enter Y for it.");
        charTest = readChar("Enter a char: ", keyboard, "XYZxyz");
        System.out.println("The value of charTest should be Y and its " + charTest + "\n");

        System.out.println("You are about to be asked for char input, please enter Z for it.");
        charTest = readChar("Enter a char: ", keyboard, "XYZxyz");
        System.out.println("The value of charTest should be Z and its " + charTest + "\n");

        //testing lowercase values
        System.out.println("You are about to be asked for char input, please enter x for it.");
        charTest = readChar("Enter a char: ", keyboard, "XYZxyz");
        System.out.println("The value of charTest should be x and its " + charTest + "\n");

        System.out.println("You are about to be asked for char input, please enter y for it.");
        charTest = readChar("Enter a char: ", keyboard, "XYZxyz");
        System.out.println("The value of charTest should be y and its " + charTest + "\n");

        System.out.println("You are about to be asked for char input, please enter z for it.");
        charTest = readChar("Enter a char: ", keyboard, "XYZxyz");
        System.out.println("The value of charTest should be z and its " + charTest + "\n");

		//error testing "bad" values
		System.out.println("Let's do some error checking.  Enter a, A, b, B, and x. " +
							"\nThe first four should give you errors and prompt to try again.");
        charTest = readChar("Enter a char: ", keyboard, "XYZxyz");
		System.out.println("The value of charTest should be x and its " + charTest + "\n");

        System.out.println("END OF TESTS!");
        System.out.println("If your code matches what the output says, your program should be working correctly!");
		
	}
	
	/******************************************************************************************
	* PSEUDOCODE:
	* 
	*	
	******************************************************************************************/
	// DESCRIPTION:		reads input from user, returns char value (error-checked using validChars)
	// PRECONDITIONS:	
	// POSTCONDITIONS:	
    public static char readChar(String prompt, Scanner key, String validChars)
    {
		String temp;
		boolean isNotValid;
		char userInput;
		int charNum;
		do
		{
			System.out.print(prompt);
			temp = key.nextLine();
			userInput = temp.charAt(0);
			charNum = validChars.indexOf(userInput);
			if (charNum == -1)
			{
				System.out.println("ERROR: Please enter a valid character");
			}
		}while(charNum < 0);
        return userInput;
    }
	
	
}
