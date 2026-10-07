package Java.Pratice.BROCODE.Random;


import java.util.Random;
import java.util.Scanner;

public class RandomTasks2 {
    public static void main(String[] args) {

        // Create objects for Random and Scanner
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        // Generate a random number between 1 and 10
        int secretNumber = random.nextInt(10) + 1;

        System.out.println("🎯 Welcome to the Guessing Game!");
        System.out.println("Guess a number between 1 and 10: ");

        // Get user’s guess
        int guess = input.nextInt();

        // Compare guess using if statements
        if (guess == secretNumber) {
            System.out.println("🔥 Correct! You guessed the right number!");
        }
        else if (guess > secretNumber) {
            System.out.println("Too high! The number was " + secretNumber + ".");
        }
        else {
            System.out.println("Too low! The number was " + secretNumber + ".");
        }

        // Close the Scanner to prevent memory leak
        input.close();
    }
}




