package Assessment15;
import java.util.Scanner;

public class StringReversal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input String

        System.out.println(
                "Enter a string:"
        );

        String str = sc.nextLine();

        String reversed = "";

        // Reverse String

        for(int i = str.length() - 1;
            i >= 0;
            i--) {

            reversed =
                    reversed + str.charAt(i);

        }

        // Output

        System.out.println(
                "Reversed String: "
                        + reversed
        );

    }

}