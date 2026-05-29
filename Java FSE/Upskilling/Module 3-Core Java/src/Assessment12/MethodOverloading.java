package Assessment12;
import java.util.Scanner;

public class MethodOverloading {

    // Method 1
    // Two Integers

    int add(int a, int b) {

        return a + b;

    }

    // Method 2
    // Two Doubles

    double add(double a, double b) {

        return a + b;

    }

    // Method 3
    // Three Integers

    int add(int a, int b, int c) {

        return a + b + c;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MethodOverloading obj =
                new MethodOverloading();

        // Two Integers

        System.out.println(
                "Enter first integer:"
        );

        int num1 = sc.nextInt();

        System.out.println(
                "Enter second integer:"
        );

        int num2 = sc.nextInt();

        // Two Doubles

        System.out.println(
                "Enter first double value:"
        );

        double d1 = sc.nextDouble();

        System.out.println(
                "Enter second double value:"
        );

        double d2 = sc.nextDouble();

        // Three Integers

        System.out.println(
                "Enter third integer:"
        );

        int num3 = sc.nextInt();

        // Results

        System.out.println(
                "Sum of 2 Integers: " +
                        obj.add(num1, num2)
        );

        System.out.println(
                "Sum of 2 Doubles: " +
                        obj.add(d1, d2)
        );

        System.out.println(
                "Sum of 3 Integers: " +
                        obj.add(num1, num2, num3)
        );

    }

}
