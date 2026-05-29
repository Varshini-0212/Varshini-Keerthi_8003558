package Assessment21;
import java.util.Scanner;

// Custom Exception Class

class InvalidAgeException
        extends Exception {

    InvalidAgeException(String message) {

        super(message);

    }

}

public class CustomException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // User Input

            System.out.println(
                    "Enter your age:"
            );

            int age = sc.nextInt();

            // Validation

            if(age < 18) {

                throw new InvalidAgeException(
                        "You are not eligible to vote"
                );

            }

            System.out.println(
                    "You are eligible to vote"
            );

        }

        // Catch Block

        catch(InvalidAgeException e) {

            System.out.println(
                    e.getMessage()
            );

        }

    }

}
