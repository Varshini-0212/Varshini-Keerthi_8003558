package Assessment24;
import java.util.Scanner;

public class ArrayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create ArrayList

        java.util.ArrayList<String> students =
                new java.util.ArrayList<>();

        // User Input

        System.out.println(
                "Enter number of students:"
        );

        int n = sc.nextInt();

        sc.nextLine();

        // Add Elements

        for(int i = 1; i <= n; i++) {

            System.out.println(
                    "Enter Student Name " + i + ":"
            );

            String name = sc.nextLine();

            students.add(name);

        }

        // Display Elements

        System.out.println(
                "\nStudent List:"
        );

        for(String student : students) {

            System.out.println(student);

        }

    }

}