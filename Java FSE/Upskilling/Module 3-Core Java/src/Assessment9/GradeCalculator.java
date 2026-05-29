package Assessment9;
import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input Marks

        System.out.println("Enter marks:");

        int marks = sc.nextInt();

        // Grade Calculation

        if(marks >= 90 && marks <= 100) {

            System.out.println("Grade: A");

        }
        else if(marks >= 80) {

            System.out.println("Grade: B");

        }
        else if(marks >= 70) {

            System.out.println("Grade: C");

        }
        else if(marks >= 60) {

            System.out.println("Grade: D");

        }
        else {

            System.out.println("Grade: F");

        }

    }

}
