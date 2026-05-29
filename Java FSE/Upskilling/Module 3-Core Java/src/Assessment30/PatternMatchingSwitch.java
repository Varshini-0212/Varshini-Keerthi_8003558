package Assessment30;
import java.util.Scanner;

public class PatternMatchingSwitch {

    // Method

    public static void checkType(Object obj) {

        switch(obj) {

            case Integer i ->

                    System.out.println(
                            "Integer Value: " + i
                    );

            case String s ->

                    System.out.println(
                            "String Value: " + s
                    );

            case Double d ->

                    System.out.println(
                            "Double Value: " + d
                    );

            default ->

                    System.out.println(
                            "Unknown Type"
                    );

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Choose Input Type:"
        );

        System.out.println(
                "1. Integer"
        );

        System.out.println(
                "2. String"
        );

        System.out.println(
                "3. Double"
        );

        int choice = sc.nextInt();

        sc.nextLine();

        switch(choice) {

            case 1 -> {

                System.out.println(
                        "Enter Integer:"
                );

                int num = sc.nextInt();

                checkType(num);

            }

            case 2 -> {

                System.out.println(
                        "Enter String:"
                );

                String text = sc.nextLine();

                checkType(text);

            }

            case 3 -> {

                System.out.println(
                        "Enter Double:"
                );

                double value = sc.nextDouble();

                checkType(value);

            }

            default ->

                    System.out.println(
                            "Invalid Choice"
                    );

        }

    }

}
