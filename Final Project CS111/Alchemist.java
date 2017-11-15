import java.util.Random;
public class Alchemist
{	
	private String color;
	private int number;
	private char letter;
	
	// DESCRIPTION: Defualt constructor for the Alchemist class.
	// PRECONDITIONS: Takes in no arguments.
	// POSTCONDITIONS: Sets all instance variables to default.
	public Alchemist()
	{
		setAll("default", 0, 'A');
	}
	// DESCRIPTION: Full constructor for the Alchemist class.
	// PRECONDITIONS: Takes in arguments; color, number, and letter
	// POSTCONDITIONS: Sets all instance variables in according to the parameters given.
	public Alchemist(String color, int number, char letter)
	{
		setAll(color, number, letter);
	}
	// DESCRIPTION: Copy constructor for the Alchemist class.
	// PRECONDITIONS: Takes in an Alchemist object as its arguments.
	// POSTCONDITIONS: If it isn't making a copy of a null refference then, it will copy the given object.
	public Alchemist(Alchemist original)
	{
		if (original == null)
		{
			System.out.println("ERROR NULL COPY");
			System.exit(0);
		}
		else
		{
			setAll(original.color, original.number, original.letter);
		}
	}
	// DESCRIPTION: Overwritten toString method.
	// PRECONDITIONS: Takes in no arguements.
	// POSTCONDITIONS: Returns a string containing all instance variables.
	public String toString()
	{
		return "Color: " + this.color + ", Number: " + this.number + ", Letter: " + this.letter;
	}
	// DESCRIPTION: Overwritten equals method.
	// PRECONDITIONS: Takes in an object to be compared.
	// POSTCONDITIONS: Returns a boolean after checking equality.
	public boolean equals(Object other)
	{
		Alchemist otherAlchemist;
		if (other == null)
		{
			return false;
		}
		else if (this.getClass() != other.getClass())
		{
			return false;
		}
		else
		{
			otherAlchemist = (Alchemist)other;
			return this.color.equals(otherAlchemist.color)
					&& this.number == otherAlchemist.number
					&& this.letter == otherAlchemist.letter;
		}
	}
	// DESCRIPTION: Set all mutatator, sets all instance variables. 
	// PRECONDITIONS: Takes in String, int and a char for arguments, assumes all input is valid.
	// POSTCONDITIONS: Sets the value of all instance vaiables. 
	public void setAll(String color, int number, char letter)
	{
		setNumber(number);
		setColor(color);
		setLetter(letter);
	}
	// DESCRIPTION: Sets the value of number.
	// PRECONDITIONS: Takes in an int, assumes all input is valid.
	// POSTCONDITIONS: Returns nothing, Sets the value of number.
	public void setNumber(int number)
	{
		this.number = number;
	}
	// DESCRIPTION: Sets the value of color, if valid color.
	// PRECONDITIONS: Takes in a String, Sets value if its a valid color.
	// POSTCONDITIONS: Returns a boolean, if a value was set for color, returns true.
	public boolean setColor(String color)
	{
		if (color.equalsIgnoreCase("red")
			|| color.equalsIgnoreCase("blue")
			|| color.equalsIgnoreCase("yellow")
			|| color.equalsIgnoreCase("green")
			|| color.equalsIgnoreCase("orange")
			|| color.equalsIgnoreCase("purple")
			|| color.equalsIgnoreCase("black")
			|| color.equalsIgnoreCase("white")
			|| color.equalsIgnoreCase("brown")
			|| color.equalsIgnoreCase("grey")
			|| color.equalsIgnoreCase("pink")
			|| color.equalsIgnoreCase("gold")
			|| color.equalsIgnoreCase("silver"))
			{
				this.color = color;
				return true;
			}
		else
		{
			return false;
		}
	}
	// DESCRIPTION: Sets the value of letter.
	// PRECONDITIONS: Assumes all input is valid, takes a single char as arguement.
	// POSTCONDITIONS: Returns nothing, Assigns a new value for letter.
	public void setLetter(char letter)
	{
		this.letter = letter;
	}
	// DESCRIPTION: Gets the current value of number.
	// PRECONDITIONS: Takes in no arguments.
	// POSTCONDITIONS: Returns the current value of number as an int.
	public int getNumber()
	{
		return this.number;
	}
	// DESCRIPTION: Gets the current value of color.
	// PRECONDITIONS: Takes in no arguements.
	// POSTCONDITIONS: Returns the current value of color as a String.
	public String getColor()
	{
		return this.color;
	}
	// DESCRIPTION: Gets the current value of letter.
	// PRECONDITIONS: Takes in no arguements.
	// POSTCONDITIONS: Returns the current value of letter as a char.
	public char getLetter()
	{
		return this.letter;
	}
	// DESCRIPTION: Gets the length of the current value stored in color.
	// PRECONDITIONS: Takes in no arugements.
	// POSTCONDITIONS: Returns the length of color as an int.
	public int getColorLength()
	{
		return this.color.length();
	}
	// DESCRIPTION: Determines the flow of the program, check to see if the number is even or odd.
	// PRECONDITIONS: Takes in an int as the argument, assumes all input is valid.
	// POSTCONDITIONS: Returns an int, if its even it returns 2, if odd 1.
	public int getState(int number)
	{
		if ((number % 2) == 0)
		{
			return 2; //landed on state 2
		}
		else
		{
			return 1; //landed on state 1
		}
	}
	// DESCRIPTION: Determines the flow of the program, check to see if the number of characters in color is even or odd.
	// PRECONDITIONS: Takes in an String as the arguement, assumes all input is valid.
	// POSTCONDITIONS: Returns an int, if its even it returns 2, if odd 1.
	public int getState(String color)
	{
		if ((color.length() % 2) == 0)
		{
			return 2; //landed on state 2
		}
		else
		{
			return 1; //landed on state 1
		}
	}
	// DESCRIPTION: Determines the flow of the program, check to see if the letters ascii value is even or odd.
	// PRECONDITIONS: Takes in a char as the arguement, assumes all input is valid.
	// POSTCONDITIONS: Returns an int, if its even it returns 2, if odd 1.
	public int getState(char letter)
	{
		if (((int)letter % 2) == 0)
		{
			return 2; //landed on state 2
		}
		else 
		{
			return 1; //landed on state 1
		}
	}
	// DESCRIPTION: Generates a random number 1 - 26.
	// PRECONDITIONS: Takes in no arguments.
	// POSTCONDITIONS: Returns a random int between 1 and 26.
	public static int pickRandom()
	{
		Random fortune;
		fortune = new Random();
		return fortune.nextInt(26) + 1;
	}
	// DESCRIPTION: Selects 1 of 26 different fortunes.
	// PRECONDITIONS: Takes in an int as the argument, assumes all input is valid.
	// POSTCONDITIONS: Depending on the argument, prints 1 of 26 different fortunes.
	public static void giveFortune(int number)
	{
		if (number == 1)
		{
			System.out.println("Fortune #1: I see wealth in your future.");
			System.out.println("=========================================\n\n\n\n");
		}
		else if (number == 2)
		{
			System.out.println("Fortune #2: Prepare yourself for hard times.");
			System.out.println("=========================================\n\n\n\n");
		}
		else if (number == 3)
		{
			System.out.println("Fortune #3: You will meet someone new today.");
			System.out.println("=========================================\n\n\n\n");
		}
		else if (number == 4)
		{
			System.out.println("Fortune #4: Love is in the air.");
			System.out.println("=========================================\n\n\n\n");
		}
		else if (number == 5)
		{
			System.out.println("Fortune #5: Error 404: Fortune not found.");
			System.out.println("=========================================\n\n\n\n");
		}
		else if (number == 6)
		{
			System.out.println("Fortune #6: Rizaelnig you can raed this mepsislled fnurote wlil be the hgihgliht of yuor day.");
			System.out.println("=========================================\n\n\n\n");
		}
		else if (number == 7)
		{
			System.out.println("Fortune #7: It's high time for one of your most promising ideas.");
			System.out.println("=========================================\n\n\n\n");
		}
		else if (number == 8)
		{
			System.out.println("Fortune #8: You will live a long life and eat many fortune cookies.");
			System.out.println("=========================================\n\n\n\n");
		}
		else if (number == 9)
		{
			System.out.println("Fortune #9: Even a broken clock is right two times a day.");
			System.out.println("=========================================\n\n\n\n");
		}
		else if (number == 10)
		{
			System.out.println("Fortune #10: Your pet is planning to eat you.");
			System.out.println("=========================================\n\n\n\n");
		}
		else if (number == 11)
		{
			System.out.println("Fortune #11: Soon a visitor shall delight you.");
			System.out.println("=========================================\n\n\n\n");
		}
		else if (number == 12)
		{
			System.out.println("Fortune #12: Every exit is an entrance to new experiences.");
			System.out.println("=========================================\n\n\n\n");
		}
		else if (number == 13)
		{
			System.out.println("Fortune #13: A long lost family member will be found today!");
			System.out.println("=========================================\n\n\n\n");
		}
		else if (number == 14)
		{
			System.out.println("Fortune #14: Your a wizard Harry.");
			System.out.println("=========================================\n\n\n\n");
		}
		else if (number == 15)
		{
			System.out.println("Fortune #15: You should not look forward to CS 113.");
			System.out.println("=========================================\n\n\n\n");
		}
		else if (number == 16)
		{
			System.out.println("Fortune #16: You will be hungry again in exactly one hour.");
			System.out.println("=========================================\n\n\n\n");
		}
		else if (number == 17)
		{
			System.out.println("Fortune #17: Wouldn't it be ironic... to die in the living room?");
			System.out.println("=========================================\n\n\n\n");
		}
		else if (number == 18)
		{
			System.out.println("Fortune #18: You don't need to be faster than the bear, you just have to be faster than the slowest guy running from it.");
			System.out.println("=========================================\n\n\n\n");
		}
		else if (number == 19)
		{
			System.out.println("Fortune #19: If it seems the fates are against you today, they probably are.");
			System.out.println("=========================================\n\n\n\n");
		}
		else if (number == 20)
		{
			System.out.println("Fortune #20: Don't marry for money, you can borrow it for cheaper.");
			System.out.println("=========================================\n\n\n\n");
		}
		else if (number == 21)
		{
			System.out.println("Fortune #21: A new pair of shoes will do you a world of good!");
			System.out.println("=========================================\n\n\n\n");
		}
		else if (number == 22)
		{
			System.out.println("Fortune #22: THE END IS NEAR... And it's all your fault!");
			System.out.println("=========================================\n\n\n\n");
		}
		else if (number == 23)
		{
			System.out.println("Fortune #23: Your classmates secretly agree that your head is too small for your body.");
			System.out.println("=========================================\n\n\n\n");
		}
		else if (number == 24)
		{
			System.out.println("Fortune #24: The road to riches is paved with homework.");
			System.out.println("=========================================\n\n\n\n");
		}
		else if (number == 25)
		{
			System.out.println("Fortune #25: A thrilling time is in your immediate future.");
			System.out.println("=========================================\n\n\n\n");
		}
		else if (number == 26)
		{
			System.out.println("Fortune #26: Someone has Googled you recently.");
			System.out.println("=========================================\n\n\n\n");
		}
	}
	// DESCRIPTION: Prints out the Alchemist.
	// PRECONDITIONS: Takes in no arguments.
	// POSTCONDITIONS: Outputs to the screen a picture of the Alchemist.
	public static void printAlchemist()
	{
		System.out.println("              _,._      ");
		System.out.println("  .||,       /_ _\\\\     ");
		System.out.println(" \\.`',/      |'L'| |    ");
		System.out.println(" = ,. =      | -,| L    ");
		System.out.println(" / || \\    ,-'\\\"" + "/,'`.   ");
		System.out.println("   ||     ,'   `,,. `.  ");
		System.out.println("   ,|____,' , ,;' \\| |  ");
		System.out.println("  (3|\\    _/|/'   _| |  ");
		System.out.println("   ||/,-''  | >-'' _,\\\\ ");
		System.out.println("   ||'      ==\\ ,-'  ,' ");
		System.out.println("   ||       |  V \\ ,|   ");
		System.out.println("   ||       |    |` |   ");
		System.out.println("   ||       |    |   \\  ");
		System.out.println("   ||       |    \\    \\ ");
		System.out.println("   ||       |     |    \\ ");
		System.out.println("   ||       |      \\_,-'");
		System.out.println("   ||       |___,,--\"" + ")_\\ ");
		System.out.println("   ||         |_|   ccc/ ");
		System.out.println("   ||        ccc/       ");
		System.out.println("   ||                ");
	}
	// DESCRIPTION: Prints out picture of a broken crystal ball.
	// PRECONDITIONS: Takes in no arguments.
	// POSTCONDITIONS: Outputs to the screen a picture of the crystal ball.
	public static void printCrystalBallBroken()
	{
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("      /\\/\\/\\/\\");
		System.out.println("     :        \\ :");
		System.out.println("     :          \\:");
		System.out.println("      \\          /");
		System.out.println("       `-.,,,,.-'  ");
		System.out.println("        _(    )_   ");
		System.out.println("       )________(  ");
		System.out.println("      (          ) ");
		System.out.println("       `-......-`  ");
	}
	// DESCRIPTION: Prints out a picture of the crystal ball with no smoke in it.
	// PRECONDITIONS: Takes in no arguments.
	// POSTCONDITIONS: Outputs to the screen a picture of the crystal ball.
	public static void printCrystalBallClear()
	{
		System.out.println("         _...._");
		System.out.println("       .`      `.");
		System.out.println("      /          \\");
		System.out.println("     :            :");
		System.out.println("     :            :");
		System.out.println("      \\          /");
		System.out.println("       `-.,,,,.-'  ");
		System.out.println("        _(    )_   ");
		System.out.println("       )________(  ");
		System.out.println("      (          ) ");
		System.out.println("       `-......-`  ");
	}
	// DESCRIPTION: Prints out a picture of the crystal ball with a little smoke in it.
	// PRECONDITIONS: Takes in no arguments.
	// POSTCONDITIONS: Outputs to the screen a picture of the crystal ball.
	public static void printCrystalBallClearer()
	{
		System.out.println("         _...._");
		System.out.println("       .`      `.");
		System.out.println("      / ***      \\");
		System.out.println("     : **         :");
		System.out.println("     :         ** :");
		System.out.println("      \\      *** /");
		System.out.println("       `-.,,,,.-'  ");
		System.out.println("        _(    )_   ");
		System.out.println("       )________(  ");
		System.out.println("      (          ) ");
		System.out.println("       `-......-`  ");
	}
	// DESCRIPTION: Prints out a picture of the crystal ball that is filled with smoke.
	// PRECONDITIONS: Takes in no arguments.
	// POSTCONDITIONS: Outputs to the screen a picture of the crystal ball.
	public static void printCrystalBallFoggy()
	{
		System.out.println("         _...._");
		System.out.println("       .`      `.");
		System.out.println("      / ******** \\");
		System.out.println("     : ********** :");
		System.out.println("     : ********** :");
		System.out.println("      \\ ******** / ");
		System.out.println("       `-.,,,,.-'  ");
		System.out.println("        _(    )_   ");
		System.out.println("       )________(  ");
		System.out.println("      (          ) ");
		System.out.println("       `-......-`  ");
	}
}
