package Assessment17;
import java.util.Scanner;

public class ClassAndObjectCreation {

    // Attributes

    String make;
    String model;
    int year;

    // Method

    void displayDetails() {

        System.out.println(
                "Car Make: " + make
        );

        System.out.println(
                "Car Model: " + model
        );

        System.out.println(
                "Car Year: " + year
        );

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Object 1

        ClassAndObjectCreation car1 =
                new ClassAndObjectCreation();

        System.out.println(
                "Enter Car 1 Make:"
        );

        car1.make = sc.nextLine();

        System.out.println(
                "Enter Car 1 Model:"
        );

        car1.model = sc.nextLine();

        System.out.println(
                "Enter Car 1 Year:"
        );

        car1.year = sc.nextInt();

        sc.nextLine();

        // Object 2

        ClassAndObjectCreation car2 =
                new ClassAndObjectCreation();

        System.out.println(
                "Enter Car 2 Make:"
        );

        car2.make = sc.nextLine();

        System.out.println(
                "Enter Car 2 Model:"
        );

        car2.model = sc.nextLine();

        System.out.println(
                "Enter Car 2 Year:"
        );

        car2.year = sc.nextInt();

        // Display Details

        System.out.println(
                "\nCar 1 Details"
        );

        car1.displayDetails();

        System.out.println(
                "\nCar 2 Details"
        );

        car2.displayDetails();

    }

}
