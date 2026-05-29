package Assessment10;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        // Generate Random Number

        int randomNumber = random.nextInt(100) + 1;

        int guess = 0;

        // Game Loop

        while(guess != randomNumber) {

            System.out.println("Guess a number between 1 and 100:");

            guess = sc.nextInt();

            if(guess > randomNumber) {

                System.out.println("Too High!");

            }
            else if(guess < randomNumber) {

                System.out.println("Too Low!");

            }
            else {

                System.out.println(
                        "Correct! You guessed the number."
                );

            }

        }

    }

}