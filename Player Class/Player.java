import java.util.Random;
public class Player
{
	
	//CONSTANTS
	
	public static final int ROCK = 1;
	public static final int PAPER = 2;
	public static final int SCISSORS = 3;
	public static final int LIZARD = 4;
	public static final int SPOCK = 5;
	public static final String DEFAULT_NAME = "CPU";
	public static final int DEFAULT_WINS = 0;
	
	//INSTANCE VARIABLES
	
	private static int rounds = 0;
	private String name;
	private int wins;
	
	//CONSTRUCTORS
	
	// DESCRIPTION: Default constructor for the player class, is overloaded.
	// PRE-CONDITIONS: Takes in no arguments.
	// POST-CONDITIONS: Creates a new object of the Player class, with default values.
	public Player()
	{
		this.name = DEFAULT_NAME;
		this.wins = DEFAULT_WINS;
	}
	// DESCRIPTION: Full constructor for the player class, is overloaded.
	// PRE-CONDITIONS: Takes in a String as the argument for the user's name.
	// POST-CONDITIONS: Creates a new object of the Player class, with user's name and Default wins.
	public Player(String name)
	{
		setName(name);
		this.wins = DEFAULT_WINS;
	}
	
	//SETTERS
	
	// DESCRIPTION:	Setter method that, sets the name of the user.
	// PRE-CONDITIONS: argument is in the form of a String, for the user's name.
	// POST-CONDITIONS: assigns a "name" to the user.
	public void setName(String name)
	{
		this.name = name;
	}
	// DESCRIPTION: Increments the wins.
	// PRE-CONDITIONS: Takes in no arguments.
	// POST-CONDITIONS: Adds 1 to the value of wins.
	public void incrementWins()
	{
		wins++;
	}
	
	//GETTERS
	
	// DESCRIPTION:	Gets the value that was assinged to name.
	// PRE-CONDITIONS: Takes in no arguments.
	// POST-CONDITIONS: returns the value of name for the object that is calling the method.
	public String getName()
	{
		return this.name;
	}
	// DESCRIPTION: Gets the current value of wins.
	// PRE-CONDITIONS: Takes in no arguments.
	// POST-CONDITIONS: Returns the current value of wins.
	public int getWins()
	{
		return this.wins;
	}
	
	//OTHER
	
	// DESCRIPTION:	Returns plyaer name and the amount of wins the player has.	
	// PRE-CONDITIONS: Takes in no arguments.
	// POST-CONDITIONS: Returns a string with the player name and the amount of wins the player has.
	public String toString()
	{
		return "Player: " + name + ", Rounds won: " + wins;
	}
	// DESCRIPTION: Checks for equality between two player names.	
	// PRE-CONDITIONS: Assumes that two players have been created in the driver.
	// POST-CONDITIONS: Returns a boolean true/false after checking equality.
	public boolean equals(Player otherName)
	{
		return this.name.equals(otherName.name);
	}
	// DESCRIPTION: Decides who wins a round and keeps track of the rounds.
	// PRE-CONDITIONS: Assumes that both players have chosen a sign.
	// POST-CONDITIONS: Returns the round result as a char; Win, Loss, or Tie.
	public static char getRoundStatus(int player1Sign, int player2Sign)
	{
		char result;
		if ((player1Sign == ROCK && (player2Sign == SCISSORS || player2Sign == LIZARD)))
		{
			rounds++;
			result = 'W';
			return result;
		}
		else if ((player1Sign == PAPER && (player2Sign == ROCK || player2Sign == SPOCK)))
		{
			rounds++;
			result = 'W';
			return result;
		}
		else if ((player1Sign == SCISSORS && (player2Sign == PAPER || player2Sign == LIZARD)))
		{
			rounds++;
			result = 'W';
			return result;
		}
		else if ((player1Sign == LIZARD && (player2Sign == PAPER || player2Sign == SPOCK)))
		{
			rounds++;
			result = 'W';
			return result;
		}
		else if ((player1Sign == SPOCK && (player2Sign == ROCK || player2Sign == SCISSORS)))
		{
			rounds++;
			result = 'W';
			return result;
		}
		else if (player1Sign == player2Sign)
		{
			rounds++;
			result = 'T';
			return result;
		}
		else 
		{
			rounds++;
			result = 'L';
			return result;
		}
	}
	// DESCRIPTION:	Returns the current number of rounds that have occured.	
	// PRE-CONDITIONS: Takes in no arguments.
	// POST-CONDITIONS: Returns the current number of rounds that have occured.
	public static int getRounds()
	{
		return rounds;
	}
	// DESCRIPTION:	Randomly generates a number between 1 and 5 inclusive.
	// PRE-CONDITIONS: Takes in no arguments, assumes that Random was inported.
	// POST-CONDITIONS: Returns a number between 1 and 5 inclusive.
	public static int getHandSign()
	{
		int sign;
		Random randomSign = new Random();
		sign = randomSign.nextInt(5) + 1;
		return sign;
	}
	// DESCRIPTION: Depending on the sign chosen by the players, prints the chosen handsign.
	// PRE-CONDITIONS: Argument is in the form of an integer to represent the sign.
	// POST-CONDITIONS: According to the paramaters, prints the chosen sign.
	public static void printHandSign(int sign)
	{
		if (sign == ROCK)
		{
			System.out.println("      _______");
			System.out.println("  ---'   ____)");
			System.out.println("        (_____)");
			System.out.println("        (_____)");
			System.out.println("        (____)");
			System.out.println("  ---.__(___)");
			System.out.println(" ");
		}
		else if (sign == PAPER)
		{
			System.out.println("         _______      ");
			System.out.println("    ____(____   `---  ");
			System.out.println("   (______            ");
			System.out.println("   (_______           ");
			System.out.println("    (_______           ");
			System.out.println("      (__________.---  ");
			System.out.println(" ");
		}
		else if (sign == SCISSORS)
		{
			System.out.println("      _______");
			System.out.println("  ---'   ____)____");
			System.out.println("            ______)");
			System.out.println("         __________)");
			System.out.println("        (____)");
			System.out.println("  ---.__(___)");
			System.out.println(" ");
		}
		else if (sign == LIZARD)
		{
			System.out.println("          _ _");
			System.out.println("       .-/ / )");
			System.out.println("       |/ / /");
			System.out.println("       /.' /");
			System.out.println("      // .---.");
			System.out.println("     /   .--._\\ ");
			System.out.println("    /    `--' /");
			System.out.println("   /     .---'");
			System.out.println("  /    .'");
			System.out.println("      /");
		}
		else if (sign == SPOCK)
		{
			System.out.println("   _          ");
			System.out.println("  (>\\       _ ");
			System.out.println(" (>\\ \\     /<)");
			System.out.println("  \\ \\ \\   / / ");
			System.out.println("   \\ \\ \\ / /<)");
			System.out.println("    \\_\\_V_/ /");
			System.out.println("   / )    `-|  ");
			System.out.println("  | | `--   |  ");
			System.out.println("  |     ||  |  ");
			System.out.println("  \\     '   /  ");
			System.out.println("   |       |   ");
			System.out.println("   |       |   ");
			System.out.println(" ");
		}
	}
}
