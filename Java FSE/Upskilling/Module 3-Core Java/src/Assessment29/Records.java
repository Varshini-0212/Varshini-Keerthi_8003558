package Assessment29;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// Record

record Person(String name, int age) {

}

public class Records {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // List of Persons

        List<Person> persons =
                new ArrayList<>();

        // User Input

        System.out.println(
                "Enter number of persons:"
        );

        int n = sc.nextInt();

        sc.nextLine();

        // Add Persons

        for(int i = 1; i <= n; i++) {

            System.out.println(
                    "Enter Name:"
            );

            String name = sc.nextLine();

            System.out.println(
                    "Enter Age:"
            );

            int age = sc.nextInt();

            sc.nextLine();

            persons.add(
                    new Person(name, age)
            );

        }

        // Display All Records

        System.out.println(
                "\nAll Persons:"
        );

        for(Person p : persons) {

            System.out.println(p);

        }

        // Filter Using Streams

        List<Person> adults =
                persons.stream()

                        .filter(p -> p.age() >= 18)

                        .collect(Collectors.toList());

        // Display Filtered Records

        System.out.println(
                "\nAdults:"
        );

        for(Person p : adults) {

            System.out.println(p);

        }

    }

}