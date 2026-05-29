package Assessment2;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input Numbers

        System.out.println("Enter first number:");

        int num1 = sc.nextInt();

        System.out.println("Enter second number:");

        int num2 = sc.nextInt();

        // Operations

        System.out.println("Addition = " + (num1 + num2));

        System.out.println("Subtraction = " + (num1 - num2));

        System.out.println("Multiplication = " + (num1 * num2));

        System.out.println("Division = " + (num1 / num2));

    }

}