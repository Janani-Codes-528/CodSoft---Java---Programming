import java.util.Random;
	import java.util.Scanner;

	public class NumberGame {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Random rand = new Random();
	        int totalScore = 0;
	        boolean playAgain = true;

	        System.out.println("--- Welcome to Number Guessing Game ---");

	        while (playAgain) {
	            int numberToGuess = rand.nextInt(100) + 1; // 1 to 100
	            int attempts = 0;
	            int maxAttempts = 7;
	            boolean guessedCorrect = false;

	            System.out.println("\nI have picked a number between 1 to 100. You have " + maxAttempts + " attempts!");

	            while (attempts < maxAttempts) {
	                System.out.print("Enter your guess: ");
	                int userGuess = sc.nextInt();
	                attempts++;

	                if (userGuess == numberToGuess) {
	                    System.out.println("Correct! You guessed it in " + attempts + " attempts.");
	                    totalScore += (maxAttempts - attempts + 1); // More points for fewer attempts
	                    guessedCorrect = true;
	                    break;
	                } else if (userGuess < numberToGuess) {
	                    System.out.println("Too low! Try again.");
	                } else {
	                    System.out.println("Too high! Try again.");
	                }
	                System.out.println("Attempts left: " + (maxAttempts - attempts));
	            }

	            if (!guessedCorrect) {
	                System.out.println("Out of attempts! The number was: " + numberToGuess);
	            }

	            System.out.print("\nWant to play again? (yes/no): ");
	            String choice = sc.next();
	            playAgain = choice.equalsIgnoreCase("yes");
	        }

	        System.out.println("\nGame Over! Your final score: " + totalScore);
	        sc.close();
	    }
	}


