/********************************************
* AUTHOR: <Jack Rollinson>
* COURSE: CS 111 Intro to CS I
* SECTION: <Mon. + Wed. 11:00AM>
* HOMEWORK #: <homework #7>
* PROJECT #: <project #2>
* LAST MODIFIED: <3/13/2016>
********************************************/

/*****************************************************************************
* <R.P.S.L.S. Game, Alpha >
*****************************************************************************
* PROGRAM DESCRIPTION:
* <Try and see if you can beat the computer! takes in commands as ints (1-5)>
*****************************************************************************
* ALGORITHM:
* for (count = 3; count > 0; count--)
* {
*		userChoice = Cs111.readInt("Enter Choice: ", keyboard, 1, 5)
* 		cpuChoice = Player.getHandSign()
* 		if userChoice == 1
*				{
*					PRINT "You chose ROCK!"
*					Player.printHandSign(1)
*				}
*				else if userChoice == 2
*				{
*					PRINT "You chose PAPER!")
*					Player.printHandSign(2)
*				}
*				else if userChoice == 3
*				{
*					PRINT "You chose SCISSORS!"
*					Player.printHandSign(3)
*				}
*				else if userChoice == 4
*				{
*					PRINT "You chose LIZARD!"
*					Player.printHandSign(4)
*				}
*				else if userChoice == 5
*				{
*					PRINT "You chose SPOCK!"
*					Player.printHandSign(5)
*				}
*				if cpuChoice == 1
*				{
*					PRINT "CPU chose ROCK!"
*					Player.printHandSign(1)
*				}
*				else if cpuChoice == 2
*				{
*					PRINT "CPU chose PAPER!"
*					Player.printHandSign(2)
*				}
*				else if cpuChoice == 3
*				{
*					PRINT "CPU chose SCISSORS!"
*					Player.printHandSign(3)
*				}
*				else if cpuChoice == 4
*				{
*					PRINT "CPU chose LIZARD!"
*					Player.printHandSign(4)
*				}
*				else if cpuChoice == 5
*				{
*					PRINT "CPU chose SPOCK!"
*					Player.printHandSign(5)
*				}
*				roundResult = Player.getRoundStatus(userChoice, cpuChoice); //assign victor after sign has been printed
*				if roundResult == 'W'
*				{
*					PRINT "Round " + Player.getRounds() + " Result: "
*					PRINT "You win!"
*					user.incrementWins()
*				}
*				else if roundResult == 'L'
*				{
*					PRINT "Round " + Player.getRounds() + " Result: "
*					PRINT "Aww you lost..."
*					cpu.incrementWins()
*				}
*				else if roundResult == 'T'
*				{
*					PRINT "Round " + Player.getRounds() + " Result: "
*					PRINT "Wow! It's a tie!"
* 				}
* }
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* Scanner Class for user input.
*****************************************************************************/
import java.util.Scanner;
public class Driver
{
	public static void main(String[] args)
	{
		Scanner keyboard;
		Cs111 checkingValid;
		Player user;
		Player cpu;
		int userChoice, cpuChoice, numTies;
		char roundResult;
		
		keyboard = new Scanner(System.in);
		checkingValid = new Cs111();
		user = new Player("Leeroy Jenkins");
		cpu = new Player();
		numTies = 0;
		
		Cs111.myPrintHeader(9, 1, "4/9/2016"); 
		System.out.println(" ");
		if (user.equals(cpu) == false) //checking for unique player names.
		{
			System.out.println("==============RULES================");
			System.out.println(" - Best out of 3 wins, try to beat the CPU!");
			System.out.println(" - Rock beats Scissors or Lizard.");
			System.out.println(" - Paper beats Rock or Spock.");
			System.out.println(" - Scissors beats Paper or Lizard.");
			System.out.println(" - Lizard beats Paper or Spock");
			System.out.println(" - Spock beats Rock or Scissors.");
			System.out.println("===================================");
			System.out.println(" ");
			System.out.println("===CONTROLS==="); 
			System.out.println("1 = ROCK    ");
			System.out.println("2 = PAPER   ");
			System.out.println("3 = SCISSORS");
			System.out.println("4 = LIZARD  ");
			System.out.println("5 = SPOCK   ");
			System.out.println("==============");
			System.out.println(" ");
			for (int count = 3; count > 0; count--) //run game for 3 rounds
			{
				userChoice = Cs111.readInt("Enter Choice (1-5): ", keyboard, 1, 5); //checking for valid move from user
				cpuChoice = Player.getHandSign(); //assinging random number for the CPU
				
				System.out.println(" ");
				System.out.println("===================");
				if (userChoice == 1)
				{
					System.out.println("You chose ROCK!");
					Player.printHandSign(1);
				}
				else if (userChoice == 2)
				{
					System.out.println("You chose PAPER!");
					Player.printHandSign(2);
				}
				else if (userChoice == 3)
				{
					System.out.println("You chose SCISSORS!");
					Player.printHandSign(3);
				}
				else if (userChoice == 4)
				{
					System.out.println("You chose LIZARD!");
					Player.printHandSign(4);
				}
				else if (userChoice == 5)
				{
					System.out.println("You chose SPOCK!");
					Player.printHandSign(5);
				}
				if (cpuChoice == 1)
				{
					System.out.println("CPU chose ROCK!");
					Player.printHandSign(1);
				}
				else if (cpuChoice == 2)
				{
					System.out.println("CPU chose PAPER!");
					Player.printHandSign(2);
				}
				else if (cpuChoice == 3)
				{
					System.out.println("CPU chose SCISSORS!");
					Player.printHandSign(3);
				}
				else if (cpuChoice == 4)
				{
					System.out.println("CPU chose LIZARD!");
					Player.printHandSign(4);
				}
				else if (cpuChoice == 5)
				{
					System.out.println("CPU chose SPOCK!");
					Player.printHandSign(5);
				}
				roundResult = Player.getRoundStatus(userChoice, cpuChoice); //assign victor after sign has been printed
				if (roundResult == 'W')
				{
					System.out.println("Round " + Player.getRounds() + " Result: ");
					System.out.println("You win!");
					user.incrementWins();
				}
				else if (roundResult == 'L')
				{
					System.out.println("Round " + Player.getRounds() + " Result: ");
					System.out.println("Aww you lost...");
					cpu.incrementWins();
				}
				else if (roundResult == 'T')
				{
					System.out.println("Round " + Player.getRounds() + " Result: ");
					System.out.println("Wow! It's a tie!");
					numTies += 1;
				}
				System.out.println("===================");
				System.out.println(" ");
			}
			System.out.println(" ");
			System.out.println("====Final-Score====");
			System.out.println(" ");
			if (numTies >= 1)
			{
				System.out.println("You tied " + numTies + " time(s)!");
			}
			System.out.println(user);
			System.out.println(cpu);
			System.out.println(" ");
			System.out.println("===================");
			if (user.getWins() > cpu.getWins())
			{
				System.out.println(user.getName() + " is the winner! \nOMG YOU WON!!");
			}
			else if (user.getWins() < cpu.getWins())
			{
				System.out.println(cpu.getName() + " is the winner! \nHow could you lose such a simple game?");
			}
			else if (user.getWins() == cpu.getWins())
			{
				System.out.println("You're all winners! Its a tie! :D");
			}
			System.out.println(" ");
		}
		else
		{
			System.out.println("Error, player names cannot be the same!");
		}
	}
}
