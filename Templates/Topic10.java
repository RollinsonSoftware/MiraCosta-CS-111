/********************************************
 * AUTHOR: 		Nery Chapeton-Lamas
 * COURSE:		CS 111 Intro to CS I
 * SECTION:		*various*
 * TOPIC #:		10
 ********************************************/

/*****************************************************************************
 * METHODS LECTURE
 *****************************************************************************
 * LECTURE DESCRIPTION:
 * Comprises the code needed to learn about methods (collection of code that
 * is grouped together to perform a single operation. Remember: DO ONE THING
 * AND DO IT WELL!!!).
 *****************************************************************************
 * ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
 * Scanner = used for console input
 *****************************************************************************/

import java.util.Scanner;

public class Topic10 //CONVENTION: Cap start each word, useful name
{
	//CONSTANTS
		// MY_COURSE, MY_NAME, MY_SECTION
	public static final String NAME = "Jack Rollinson";
	public static final String COURSE = "CS 111 Intro to CS I";
	public static final String SECTION = "MoWe 10:50am-1:00pm";
	public static void main(String[] args)
	{
		//DECLARATIONS
		Scanner keyboard;
		int num1, num2;
		double temp;

		//INITIALIZATIONS
		keyboard = new Scanner(System.in);

		//WELCOME
		Topic10.myPrintHeader(15, 1, "3/7/2016");
		
		//INPUT
		num1 = Topic10.myReadInt(keyboard, "Enter quiz score: ", 0, 15);
		
		//PROCESSING

		//OUTPUT
		System.out.println("num1 = " + num1);
		/***** SCRATCH PAD *****/
		
		
		
		
		
		


		/***** END SCRATCH PAD *****/
	}

	/********** START TOPIC WORK AREA **********/

	//myPrintHeader
	public static void myPrintHeader(int hwNum, int projectNum, String lastMod)
	{
		System.out.println("============================");
		System.out.println("Author: " + NAME);
		System.out.println("Course: " + COURSE);
		System.out.println("Section: " + SECTION);
		System.out.println("Homework #: " + hwNum);
		System.out.println("Project  #: " + projectNum);
		System.out.println("Last Modified: " + lastMod);
		System.out.println("============================");
	}
	

	//myReadInt
	public static int myReadInt(Scanner keyboard, String prompt, int lowerBound, int upperBound) //keyboard is instantiated.
	{
		boolean isNotValid;
		int input;
		String temporary;
		do 
		{
			System.out.print(prompt);
			temporary = keyboard.nextLine();
			input = Integer.parseInt(temporary);
			isNotValid = (input < lowerBound || input > upperBound);
			if (isNotValid)
			{
				System.out.println("Error, value must be between " + lowerBound + " and " + upperBound + " inclusive!");
			} 
		}while (isNotValid);
		return input;
	}


	//myConvertTemp




	/********** END TOPIC WORK AREA **********/





	//NOTES ON METHOD CALLING (using the tool):
	/** TO CALL A STATC VOID METHOD:
	*		ClassName.methodName();
	*	TO CALL A VALUE STATIC RETURNING METHOD:
	*		varToStoreResultIn = ClassName.methodName();
	*
	*	Later we will create non-static methods, those
	*	will be called similarly, except that you'll have
	*	to create an object and call the method on that
	*	object.  Think of String methods and how you
	*	had to create a String greeting = "Hello";
	*	to then call the length method: greeting.length()
	*	More on this later.
	*
	*** To play with this file, call the methods below
	* by using the syntax just described.  Put it in the
	* appropriate section to stay organized.  All method
	* calls must match definitions.  If a method has
	* 3 int parameters, you MUST give it 3 ints! Java
	* does not care about what data those 3 ints are
	* or represent, it just cares that there are 3 ints!
	* If YOU care about what values those 3 ints are
	* (such as them being valid), YOU need to make sure
	* of that with your code (looping, branching, etc.)
	**/

	// COMPONENTS OF A METHOD DEFINITION (defining the tool):
	// METHOD HEADER()
	// {
	//		METHOD BODY;
	// }
	//
	//
	// METHOD HEADER's consist of the following parts:
	//		accessSpecifier accessModifier returnType methodName(parameterList)
	//
	//	accessSpecifier = public, private, protected. We only use public for now,
	//		more on the rest later. MUST have only one.
	//	accessModifier = static.  Not required, but when used think of this
	//		tool as being on its own, not relying on ANYTHING/ANYONE. More later.
	//	returnType = any legal Java datatype. MUST have only one.
	//	methodName = legal identifier, follow variable naming convention as well.
	//	parameterList = list of parameters (think variable declarations)
	//		separated by commas.  The parameters can be of ANY Java data type,
	//		as many as you'd like, or none at all! Plenty of examples below.
	//
	//
	// METHOD BODY's are like LOOP/BRANCH bodies, any legal Java
	// code can be placed inside of them, with one excpetion:
	// 		NO METHOD DEFINITIONS INSIDE!!
	// That would be like defining a method inside of a method,
	// and that's confusing.  Not allowed! Try it, won't work!



	/***********************************************************
	* METHOD EXAMPLES/PARTS WE BUILT DURING LECTURE. RETYPED
	* BELOW AS SEPARATE EXAMPLES FOR YOUR OWN NOTES IN CASE
	* YOU MISSED SOMETHING IN CLASS.
	***********************************************************/




	// VOID METHODS:
	// Do not return value, they just do SOMETHING: console output,
	// modify/change data, etc.


	// DESCRIPTION:		Print author information for start of program
	// PRE-CONDITIONS:	N/A
	// POST-CONDITIONS:	Outputs author info to console
	public static void printHeader3()
	{
		//output
		System.out.println("/********************************************");
		System.out.println("* AUTHOR:        Nery Chapeton-Lamas");
		System.out.println("* COURSE:        CS 111 Intro to CS I");
		System.out.println("* SECTION:       TuTh 11:30am-3:20pm");
		System.out.println("* HOMEWORK #:    5");
		System.out.println("* LAST MODIFIED: 9/23/2014");
		System.out.println("********************************************/");
	}

	// NOT DYNAMIC ENOUGH!!! Let's go in a more flexible direction...

	// DESCRIPTION:		Print author information for start of program
	// PRE-CONDITIONS:	N/A
	// POST-CONDITIONS:	Outputs author info to console
	public static void printHeader2()
	{
		//declarations
		String name, course, section, lastModified;
		int homework;

		//initializations
		name = "Nery Chapeton-Lamas";
		course = "CS 111 Intro to CS I";
		section = "TuTh 11:30am-3:20pm";
		homework = 5;
		lastModified = "9/23/2014";

		//output
		System.out.println("/********************************************");
		System.out.println("* AUTHOR:        " + name);
		System.out.println("* COURSE:        " + course);
		System.out.println("* SECTION:       " + section);
		System.out.println("* HOMEWORK #:    " + homework);
		System.out.println("* LAST MODIFIED: " + lastModified);
		System.out.println("********************************************/");
	}

	// WE CAN GET MORE DYNAMIC!! best version of printHeader(), now including
	// 	project #. don't forget to move the constants!
	// NOTE: parameter naming convention == variable naming convention = camelCase
	// What you want to be flexible == parameter

	// DESCRIPTION:		Print author information for start of program
	// PRE-CONDITIONS:	All parameters are valid according to thier name.
	// POST-CONDITIONS:	Outputs author info to console
	public static void printHeader(int homework, int project, String lastModified)
	{
		//constants, should be placed at top of class!!
		

		//output
		System.out.println("/********************************************");
		System.out.println("* AUTHOR:        " + NAME);
		System.out.println("* COURSE:        " + COURSE);
		System.out.println("* SECTION:       " + SECTION);
		System.out.println("* HOMEWORK #:    " + homework);
		System.out.println("* PROJECT #:	 " + project);
		System.out.println("* LAST MODIFIED: " + lastModified);
		System.out.println("********************************************/");
	}


	// VALUE RETURNING METHODS:
	// Return value matching data type in method header.  return statement
	// should be at end of method body.

	// DESCRIPTION:		Reads string from user and returns parsed int
	// PRE-CONDITIONS:	Scanner instantiated
	// POST-CONDITIONS:	Returns integer from user input
	public static int readInt4(Scanner input)
	{
		//declarations
		int result;
		String temp;

		System.out.print("Enter integer: ");
		temp = input.nextLine();
		result = Integer.parseInt(temp);

		return result; //CONVENTION: should be at end, just one!
	}

	// DESCRIPTION:		Reads string from user and returns parsed int
	// PRE-CONDITIONS:	All parameters are given a value, Scanner instantiated
	// POST-CONDITIONS:	Returns integer from user input
	public static int readInt3(String prompt, Scanner input)
	{
		//declarations
		int result;
		String temp;

		System.out.print(prompt);
		temp = input.nextLine();
		result = Integer.parseInt(temp);

		return result;
	}

	// WHAT ABOUT THOSE BEAUTIFUL LOOPS WE LEARNED?! ERROR CHECKING!

	// DESCRIPTION:		Reads string from user and returns parsed int
	// PRE-CONDITIONS:	All parameters are given a value, Scanner instantiated
	// POST-CONDITIONS:	Returns int from user between 0 and 50, inclusive
	public static int readInt2(String prompt, Scanner input)
	{
		//declarations
		int result;
		String temp;
		boolean isNotValid;

		//input + processing
		do {
			System.out.print(prompt);
			temp = input.nextLine();
			result = Integer.parseInt(temp);
			isNotValid = (result < 0) || (result > 50);

			if (isNotValid)
			{
				System.out.println("ERROR: Please input number between 0 and 50");
			}
		} while (isNotValid);


		return result;
	}



	// MORE DYNAMIC!!!! (Starting to see a pattern?)
	// Notice how line-wrapping is handled for long parameter lists!

	// DESCRIPTION:		Reads string from user and returns parsed int
	// PRE-CONDITIONS:	lowerBound, upperBound, Scanner instantiated, prompt is in the form of "Enter...: "
	// POST-CONDITIONS:	Returns int from user between lowerBound and
	//					 upperBound values, inclusive
	public static int readInt(String prompt, Scanner input,
					int lowerBound, int upperBound)
	{
		//declarations
		int result;
		String temp;
		boolean isNotValid;

		//input + processing
		do
		{
			System.out.print(prompt);
			temp = input.nextLine();
			result = Integer.parseInt(temp);
			isNotValid = (result < lowerBound) || (result > upperBound);

			if (isNotValid)
			{
				System.out.printf("ERROR: Please input number between %d and %d%n",
										lowerBound,upperBound);
			}
		} while (isNotValid);


		return result;
	}


	// DESCRIPTION:		Returns maximum between two integers
	// PRE-CONDITIONS:	All parameters are given a value
	// POST-CONDITIONS:	Returns int representing max of the two
	public static int max(int n1, int n2)
	{
		//declarations
		int max;

		//processing
		if (n1 > n2)
		{
			max = n1;
		}
		else
		{
			max = n2;
		}

		return max;
	}


	//Since the code for max() and min() is very similar (> vs. <)
	// I've provided a different way to do it below!

	// DESCRIPTION:		Returns minimum between two integers
	// PRE-CONDITIONS:	All parameters are given a value
	// POST-CONDITIONS:	Returns int representing min of the two
	public static int min(int n1, int n2)
	{
		return (n1 < n2) ? n1 : n2; //not as readable, but you kept your promise!
	}


	// DESCRIPTION:		Converts fahrenheit degrees to celsius
	// PRE-CONDITIONS:	All parameters are given a value
	// POST-CONDITIONS:	Returns int representing same temp but in celsius
	public static double convertTemp2(int tempF)
	{
		//declarations
		double tempC;

		//processing
		tempC = (tempF - 32) * 5 / 9.0;

		return tempC;
	}


	// MORE DYNAMIC (and useful)!!!!

	// DESCRIPTION:		Converts to F/C degrees based on inScale
	// PRE-CONDITIONS:	All parameters are given a value
	// POST-CONDITIONS:	Returns int representing same temp but in opposite of inScale
	public static double convertTemp(int temp, char inScale)
	{
		//declarations
		double result;

		//processing
		if (inScale == 'F' || inScale == 'f')
		{
			result = (temp - 32) * 5 / 9.0; //convert to celsius!!
		}
		else
		{
			result = temp * 9 / 5.0  + 32; //convert to fahrenheit!!
		}

		return result;
	}





	// Think of methods as wrenches.  You want them to accomplish ONE
	// task and do it well, but also be flexible enough to handle multiple
	// situations.  This will make our lives MUCH easier! (Imagine coding
	// a convertToFahrenheit() and convertToCelsius() method, testing, making
	// sure it works, and then remembering which one is which.  Here we have
	// ONE method that deals with converting temperatures, but can handle
	// both situations and keeps our code organized and simple!




	// DOCUEMENTATION TEMPLATE:
	// 		EVERY single method you ever write in this class must have
	// 	this above it to be considered complete (documentation).  Only excpetion
	// 	is main() method because it has its own special documentation. If you
	// 	want to avoid losing documentation points, make sure to have them
	// 	and make sure they make SENSE!  You have some good examples above,
	// 	and I'll keep giving you examples as needed through the semester.

	// DESCRIPTION:		<Describe what your method does/accomplishes in
	// 	1-2 sentences, keep it short and sweet, but complete and descriptive!>
	// PRE-CONDITIONS:	<Assumptions you have made that must be true for your
	// 	method to work correctly>
	// POST-CONDITIONS:	<The results of your method running. What changed?
	// 	Did you return something? close() anything? etc.>

}
