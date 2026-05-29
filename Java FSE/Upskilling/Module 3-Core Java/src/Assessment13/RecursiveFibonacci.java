package Assessment13;
import java.util.Scanner;

public class RecursiveFibonacci {

    // Recursive Method

    static int fibonacci(int n) {

        if(n == 0) {

            return 0;

        }
        else if(n == 1) {

            return 1;

        }
        else {

            return fibonacci(n - 1)
                    + fibonacci(n - 2);

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input

        System.out.println(
                "Enter value of n:"
        );

        int n = sc.nextInt();

        // Output

        System.out.println(
                "Fibonacci number at position "
                        + n + " is "
                        + fibonacci(n)
        );

    }

}
