package Assessment18;
import java.util.Scanner;

// Parent Class

class Vehicle {

    String brand;

    void showBrand() {

        System.out.println(
                "Vehicle Brand: " + brand
        );

    }

}

// Child Class

class Car extends Vehicle {

    String model;

    void showModel() {

        System.out.println(
                "Car Model: " + model
        );

    }

}

// Main Class

public class Inheritance{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create Child Object

        Car car = new Car();

        // User Input

        System.out.println(
                "Enter Vehicle Brand:"
        );

        car.brand = sc.nextLine();

        System.out.println(
                "Enter Car Model:"
        );

        car.model = sc.nextLine();

        // Display Details

        System.out.println(
                "\nVehicle Details"
        );

        car.showBrand();

        car.showModel();

    }

}