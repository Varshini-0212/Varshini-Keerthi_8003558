package Assessment20;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // User Input

            System.out.println(
                    "Enter First Number:"
            );

            int num1 = sc.nextInt();

            System.out.println(
                    "Enter Second Number:"
            );

            int num2 = sc.nextInt();

            // Division

            int result = num1 / num2;

            // Output

            System.out.println(
                    "Result = " + result
            );

        }

        catch(ArithmeticException e) {

            System.out.println(
                    "Cannot divide by zero"
            );

        }

    }

}