package Assessment16;
import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input String

        System.out.println(
                "Enter a string:"
        );

        String str = sc.nextLine();

        // Remove special characters and spaces

        str = str.replaceAll(
                "[^a-zA-Z0-9]",
                ""
        );

        // Convert to lowercase

        str = str.toLowerCase();

        // Reverse String

        String reversed = "";

        for(int i = str.length() - 1;
            i >= 0;
            i--) {

            reversed =
                    reversed + str.charAt(i);

        }

        // Check Palindrome

        if(str.equals(reversed)) {

            System.out.println(
                    "Palindrome String"
            );

        }
        else {

            System.out.println(
                    "Not a Palindrome String"
            );

        }

    }

}
