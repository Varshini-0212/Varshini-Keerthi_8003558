package Assessment19;
import java.util.Scanner;

// Interface

interface Animal {

    void sound();

}

// Class Implementing Interface

class Dog implements Animal {

    @Override

    public void sound() {

        System.out.println(
                "Dog barks"
        );

    }

}

// Another Class

class Cat implements Animal {

    @Override

    public void sound() {

        System.out.println(
                "Cat meows"
        );

    }

}

// Main Class

public class InterfaceImplementation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Enter animal type:"
        );

        String animalType =
                sc.nextLine();

        Animal obj;

        // Runtime Decision

        if(animalType.equalsIgnoreCase("dog")) {

            obj = new Dog();

        }
        else if(animalType.equalsIgnoreCase("cat")) {

            obj = new Cat();

        }
        else {

            System.out.println(
                    "Invalid Animal Type"
            );

            return;

        }

        // Method Call

        obj.sound();

    }

}
