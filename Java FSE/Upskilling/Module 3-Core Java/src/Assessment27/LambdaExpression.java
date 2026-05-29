package Assessment27;

import java.util.Scanner;

// Functional Interface

interface Message {

    void display(String name);

}

public class LambdaExpression{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User Input

        System.out.println(
                "Enter your name:"
        );

        String name = sc.nextLine();

        // Lambda Expression

        Message msg = (n) -> {

            System.out.println(
                    "Welcome " + n
            );

        };

        // Method Call

        msg.display(name);

    }

}