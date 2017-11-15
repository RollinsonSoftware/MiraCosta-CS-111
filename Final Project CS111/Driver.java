/********************************************
* AUTHOR: <Jack Rollinson>
* COURSE: CS 111 Intro to CS I
* SECTION: <Mon. + Wed. 11:00AM>
* HOMEWORK #: <0>
* PROJECT #: <0>
* LAST MODIFIED: <Final Project>
********************************************/


/****************************************************************************
* <The Alchemist Fortune Teller.>
*****************************************************************************
* PROGRAM DESCRIPTION:
* <Answer all of the Alchemists questions and he will give you a unique fortune!>
*****************************************************************************
* ALGORITHM:
* Turned in with deliverable number 2.
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* Scanner class for user input.
*****************************************************************************/
import java.util.Scanner;
public class Driver
{
	public static void main(String[] args)
	{
		Alchemist FortuneTeller;
		Scanner keyboard;
		
		String choice;
		String color;
		boolean isNotValid;
		int fortuneNum;
		
		FortuneTeller = new Alchemist();
		keyboard = new Scanner(System.in);
		
		Cs111.myPrintHeader(00, 00, "Final Project");
		System.out.println("\nWelcome to THE ALCHEMIST! \nI am a mystical fortune telling machine! \nWould you like me to tell you your fortune?\n");
		
		do
		{
			FortuneTeller.printAlchemist();
			System.out.print("\nDo you want The Alchemist to peer into your very soul? : ");
			choice = keyboard.nextLine();
			
			if (choice.equalsIgnoreCase("no") 
				|| choice.equalsIgnoreCase("nah") 
				|| choice.equalsIgnoreCase("not now"))
			{
				System.out.println("Farewell then, our paths will cross again.");
				System.exit(0);
			}
			
			else if (choice.equalsIgnoreCase("yes") 
					|| choice.equalsIgnoreCase("Very well one last time")
					|| choice.equalsIgnoreCase("yes please")
					|| choice.equalsIgnoreCase("sure")
					|| choice.equalsIgnoreCase("ok"))
			{
				System.out.println("Very well... Open your mind to me.\n");
				System.out.println("Gaze deep into the crystal ball with me...\n");
				FortuneTeller.printCrystalBallFoggy();
				
				do
				{
					System.out.println("\nTell me a color, any color...");
					color = keyboard.nextLine();
					isNotValid = !FortuneTeller.setColor(color);
					
					if (isNotValid)
					{
						System.out.println("You are clouding my vision with your nonsense! Pick an actual color!\n");
					}
					
				}while(isNotValid);
				
				System.out.println("\nHmm... Interesting...\n");
				
				if (FortuneTeller.getState(FortuneTeller.getColor()) == 1)
				{
					System.out.println("How many countries have you been to in your life time?");
					FortuneTeller.setNumber(Cs111.readInt("", keyboard, 1, 999999999));
					
					if (FortuneTeller.getState(FortuneTeller.getNumber()) == 1)
					{
						System.out.println("\nHmm the crystal ball is still to cloudy...\n");
						FortuneTeller.printCrystalBallFoggy();
						System.out.println("\nTell me traveler... \nWhat is the first letter of your last name?");
						FortuneTeller.setLetter(Cs111.readChar("(Must be upper case): ", keyboard, "ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
						
						if (FortuneTeller.getState(FortuneTeller.getLetter()) == 1)
						{
							System.out.println("\nThe crystal ball is starting to become clearer...");
							FortuneTeller.printCrystalBallClearer();
							System.out.println("\nThe Alchamist concentrates on the crystal ball and begins to sweat profusely!");
							System.out.println("\n... \n.... \n..... \n......");
							System.out.println("The smoke in the crystal ball clears completely right before your eye's!\n");
							FortuneTeller.printCrystalBallClear();
							System.out.println("\n... \n.... \n..... \n......");
							System.out.println("You start to see a message surface from the depths of the crystal ball.");
							System.out.println("\n... \n.... \n..... \n......");
							FortuneTeller.giveFortune(FortuneTeller.pickRandom());
						}
						else if (FortuneTeller.getState(FortuneTeller.getLetter()) == 2)
						{
							System.out.println("\nAmazing! The crystal ball has completely cleared all the smoke right before your eye's!");
							FortuneTeller.printCrystalBallClear();
							System.out.println("\n... \n.... \n..... \n......");
							System.out.println("You start to see a message surface from the depths of the crystal ball.");
							System.out.println("\n... \n.... \n..... \n......");
							FortuneTeller.giveFortune((int)FortuneTeller.getLetter() - 64);
						}
					}
					else if (FortuneTeller.getState(FortuneTeller.getNumber()) == 2)
					{
						System.out.println("\nThe smoke still clouds my reading!");
						FortuneTeller.printCrystalBallFoggy();
						System.out.println("\n... \n.... \n..... \n......");
						System.out.println("\nTell me traveler... \nHow many sibling's do you have?");
						FortuneTeller.setNumber(Cs111.readInt("", keyboard, 1, 26));
						System.out.println("\nThe crystal ball is becoming clearer...\n");
						FortuneTeller.printCrystalBallClearer();
						System.out.println("\n... \n.... \n..... \n......");
						
						if (FortuneTeller.getNumber() <= 13)
						{
							System.out.println("\nThe Alchemist closes his eyes and hovers his hands above the crystal ball!\n.....");
							System.out.println("The fog in the crystal ball starts to clear magically!\n");
							FortuneTeller.printCrystalBallClear();
							System.out.println("\n... \n.... \n..... \n......");
							System.out.println("\nAs all the fog vanishes you can clearly see a message...");
							System.out.println("\n... \n.... \n..... \n......");
							FortuneTeller.giveFortune(FortuneTeller.getNumber() + 5);
						}
						else if (FortuneTeller.getNumber() > 13)
						{
							System.out.println("The Alchemist starts to gaze deep into the crystal ball.\n.....");
							System.out.println("The fog refuses to clear.... but wait!\nSomethings happening!");
							FortuneTeller.printCrystalBallClearer();
							System.out.println("\n... \n.... \n..... \n......");
							System.out.println("\nThe smoke inside the crystal ball begins to form letters, it spells...");
							System.out.println("\n... \n.... \n..... \n......");
							FortuneTeller.giveFortune(FortuneTeller.getNumber() - 5);
						}
						else if (FortuneTeller.getNumber() == 5)
						{
							System.out.println("The Alchemist starts to gaze deep into the crystal ball.\n.....");
							System.out.println("The fog refuses to clear.... but wait!\nSomethings happening!");
							FortuneTeller.printCrystalBallClearer();
							System.out.println("\n... \n.... \n..... \n......");
							System.out.println("\nA poorly writen fortune slowly emerges from the fog...");
							System.out.println("\n... \n.... \n..... \n......");
							FortuneTeller.giveFortune(5);
						}
					}	
				}
				else if (FortuneTeller.getState(FortuneTeller.getColor()) == 2)
				{
					System.out.println("\nYou hear a strange noise...");
					System.out.println("\nThe crystal ball starts to shake on the table...");
					System.out.println("\nSome of the smoke in the crystal ball miraculously clears!");
					FortuneTeller.printCrystalBallClearer();
					System.out.println("\n... \n.... \n..... \n......");
					System.out.println("\nThe crystal ball is speaking to you...");
					System.out.println("\nA deep voice echos through the room! Spooky!");
					System.out.println("\nWHAT IS THE FIRST LETTER THAT COMES TO MIND?");
					System.out.println("\nAs you cower at the might of this strange entity in the room, you muster up enough courage to mutter a single letter... ");
					FortuneTeller.setLetter(Cs111.readChar("(Must be upper case): ", keyboard, "ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
					if (((int)FortuneTeller.getLetter() - 64) < 13)
					{
						System.out.println("\nOH NO! The Alchemist lost his focus... ");
						System.out.println("\nSmoke floods into the crystal ball... ");
						FortuneTeller.printCrystalBallFoggy();
						System.out.println("\n... \n.... \n..... \n......");
						System.out.println("\nThe Alchemist tries to recover the vision he was having...");
						System.out.println("\nThe Alchemist goes into a deep state of meditation...");
						System.out.println("\nYou hear a voice in your head, it's the Alchemist!");
						System.out.println("\n\"How old are you young grasshopper?\" The voice asks.");
						FortuneTeller.setNumber(Cs111.readInt("I am: ", keyboard, 1, 100));
						if (FortuneTeller.getNumber() >= 50)
						{
							System.out.println("\nSmoke starts to fade from the glowing orb on the table!");
							FortuneTeller.printCrystalBallClearer();
							System.out.println("\n... \n.... \n..... \n......");
							System.out.println("\nAs the smoke clears, you hear an echo rattling around in your head...");
							System.out.println("\n... \n.... \n..... \n......");
							FortuneTeller.giveFortune(FortuneTeller.pickRandom());
						}
						else if (FortuneTeller.getNumber() <= 49)
						{
							System.out.println("\nThe Alchemist snaps his fingers and all the smoke is magically wisked away!");
							FortuneTeller.printCrystalBallClear();
							System.out.println("\n... \n.... \n..... \n......");
							System.out.println("A blinding light explodes out of the crystal ball and fills the room!");
							System.out.println("\n... \n.... \n..... \n......");
							System.out.println("When you regain your vision The Alchemist and his crystal ball are gone, in his place is a small piece of paper...");
							System.out.println("\n... \n.... \n..... \n......");
							System.out.println("You open it and it reads: ");
							FortuneTeller.giveFortune(FortuneTeller.getNumber() / 2);
						}
					}
					else if (((int)FortuneTeller.getLetter() - 64) >= 13)
					{
						System.out.println("\nThe crystal ball begins to levitate on its own!");
						System.out.println("\nAs it does so, all the smoke is expunged from the orb!");
						FortuneTeller.printCrystalBallClear();
						System.out.println("\n... \n.... \n..... \n......");
						System.out.println("\nI've never experienced a reading like this before!");
						do
						{
							System.out.println("\nQuickly! Give me another color!");
							System.out.println("\nI don't know if I can control it much longer!");
							color = keyboard.nextLine();
							isNotValid = !FortuneTeller.setColor(color);
							
							if (isNotValid)
							{
								System.out.println("You are clouding my vision with your nonsense! Pick an actual color!\n");
							}
						}while(isNotValid);
						if (FortuneTeller.getState(FortuneTeller.getColor()) == 1)
						{
							System.out.println("\nYou didn't respond fast enough! Im losing control!");
							System.out.println("\nThe crystal ball suddenly turns black and EXPLODES!");
							FortuneTeller.printCrystalBallBroken();
							System.out.println("\n... \n.... \n..... \n......");
							System.out.println("The fragments of the crystal ball spell out a message on the floor!");
							System.out.println("\n... \n.... \n..... \n......");
							fortuneNum = FortuneTeller.getColorLength();
							FortuneTeller.giveFortune(fortuneNum);
						}
						else if (FortuneTeller.getState(FortuneTeller.getColor()) == 2)
						{
							System.out.println("\nThe Alchemist turns pale, like he has seen something horrible...");
							System.out.println("\nThe crystal ball starts to hum with power...");
							System.out.println("\nThe magical orb floats over to you and rests in your hands!");
							System.out.println("\n... \n.... \n..... \n......");
							System.out.println("\nAs it touches your skin, it fills with smoke!");
							FortuneTeller.printCrystalBallFoggy();
							System.out.println("\n... \n.... \n..... \n......");
							System.out.println("It reveals a message that only you can decipher!");
							System.out.println("\n... \n.... \n..... \n......");
							fortuneNum = FortuneTeller.getColorLength();
							FortuneTeller.giveFortune(fortuneNum);
						}
					}
				}
			}
			else
			{
				System.out.println("Ill take that as a no then...");
				System.exit(0);
			}
			}while(choice.equalsIgnoreCase("yes")
					|| choice.equalsIgnoreCase("Verywell one last time")
					|| choice.equalsIgnoreCase("of course")
					|| choice.equalsIgnoreCase("sure")
					|| choice.equalsIgnoreCase("ok"));
	}
}
