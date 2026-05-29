package Assessment25;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create HashMap

        HashMap<Integer, String> students =
                new HashMap<>();

        // User Input

        System.out.println(
                "Enter number of students:"
        );

        int n = sc.nextInt();

        sc.nextLine();

        // Add Key-Value Pairs

        for(int i = 1; i <= n; i++) {

            System.out.println(
                    "Enter Student ID:"
            );

            int id = sc.nextInt();

            sc.nextLine();

            System.out.println(
                    "Enter Student Name:"
            );

            String name = sc.nextLine();

            students.put(id, name);

        }

        // Display HashMap

        System.out.println(
                "\nStudent Details:"
        );

        for(Map.Entry<Integer, String> entry
                : students.entrySet()) {

            System.out.println(
                    "ID: " + entry.getKey()
                            + " Name: "
                            + entry.getValue()
            );

        }

    }

}