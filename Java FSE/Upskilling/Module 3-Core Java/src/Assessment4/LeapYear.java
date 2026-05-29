package Assessment4;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input Year

        System.out.println("Enter a year:");

        int year = sc.nextInt();

        // Leap Year Logic

        if(year % 4 == 0) {

            if(year % 100 == 0) {

                if(year % 400 == 0) {

                    System.out.println(year + " is a Leap Year");

                }
                else {

                    System.out.println(year + " is NOT a Leap Year");

                }

            }
            else {

                System.out.println(year + " is a Leap Year");

            }

        }
        else {

            System.out.println(year + " is NOT a Leap Year");

        }

    }

}
