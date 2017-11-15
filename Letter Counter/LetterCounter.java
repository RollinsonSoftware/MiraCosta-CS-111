public class LetterCounter
{
	//DESCRIPTION: Changes a char to an int minus 97 to make it a letter between 0-26
	//PRECONDITION: Takes in a char as an argument, assumes char is valid.
	//POSTCONDITION: Returns an integer that represents the charecter that was in the argument. 
	public static int letterToNum(char letter)
	{
		int indexVal;
		indexVal = (int)letter - 97;
		return indexVal;	
	}
	//DESCRIPTION: Changes a char to an int plus 97 to restore the letter back to its original ascii code.
	//PRECONDITION: Takes in an int as the argument, assumes int is valid.
	//POSTCONDITION: Returns a char A-Z deppending on the argument.
	public static char numToLetter(int letter)
	{
		char indexVal;
		letter += 97;
		indexVal = (char)letter;
		return indexVal;
	}
}
