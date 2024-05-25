package GuessANumber;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int tryCounter = 0;
        while (true) {

            System.out.println("Enter your guess (1-100): ");
            int playerGuess = Integer.parseInt(scanner.nextLine());
            tryCounter++;

            if (playerGuess == randomNumber) {
                System.out.println("Correct! You Win.");
                System.out.println("It took you " + tryCounter + " tries.");
                break;
            } else if (randomNumber > playerGuess) {
                System.out.println("Nope! The number is higher. Guess again");
            } else {
                System.out.println("Nope! The number is lower.Guess again.");
            }
        }

        scanner.close();
    }
}
