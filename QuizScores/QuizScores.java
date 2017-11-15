import java.util.Scanner;
public class QuizScores
{
	public static void main(String[] args)
	{
		int[] scores;
		scores = new int[10];
		Scanner keyboard;
		keyboard = new Scanner(System.in);
		
		for (int i = 0; i < scores.length; i++)
		{
			scores[i] = Cs111.readInt("Please enter your quiz score: ", keyboard, -1, 11);
		}
		for (int i = 0; i < scores.length; i++)
		{
			System.out.println(scores[i]);
		}
	}
}
