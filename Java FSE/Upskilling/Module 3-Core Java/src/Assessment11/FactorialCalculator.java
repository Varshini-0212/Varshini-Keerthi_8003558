package Assessment11;
import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input

        System.out.println("Enter a number:");

        int num = sc.nextInt();

        long factorial = 1;

        // Factorial Calculation

        for(int i = 1; i <= num; i++) {

            factorial = factorial * i;

        }

        // Output

        System.out.println(
                "Factorial of " + num + " = " + factorial
        );

    }

}