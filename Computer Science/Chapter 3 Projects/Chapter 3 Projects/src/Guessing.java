import java.util.Scanner;

public class Guessing
{
	public static void main(String[] args)
	{
		int numGuesses = 0, guess, highestPossible = 100, lowestPossible = 1;
		String response;
		Boolean done = false;
		Scanner scan = new Scanner(System.in);
		System.out.print("Think of a number between 1 and 100 and then press any key.");
		response = scan.nextLine();
		while (!done)
		{
			guess = (highestPossible + lowestPossible) / 2;
			numGuesses++;
			System.out.print("Is the number " + guess + " (Correct, Low, High)? ");
			response = scan.nextLine();
			if (response.equalsIgnoreCase("c"))
				done = true;
			else if (response.equalsIgnoreCase("l"))
				lowestPossible = guess;
			else if (response.equalsIgnoreCase("h"))
				highestPossible = guess;
			else
				System.out.println("Invalid input. Try again.");
		}
		System.out.println("Number of guesses: " + numGuesses);
	}
}