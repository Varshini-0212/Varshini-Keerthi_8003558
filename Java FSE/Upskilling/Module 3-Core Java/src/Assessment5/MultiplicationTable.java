package Assessment5;
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input Number

        System.out.println("Enter a number:");

        int num = sc.nextInt();

        // Multiplication Table

        for(int i = 1; i <= 10; i++) {

            System.out.println(
                    num + " x " + i + " = " + (num * i)
            );

        }

    }

}