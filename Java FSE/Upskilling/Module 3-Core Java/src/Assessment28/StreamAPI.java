package Assessment28;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamAPI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create List

        List<Integer> numbers =
                new ArrayList<>();

        // User Input

        System.out.println(
                "Enter number of elements:"
        );

        int n = sc.nextInt();

        // Add Elements

        for(int i = 1; i <= n; i++) {

            System.out.println(
                    "Enter Number " + i + ":"
            );

            numbers.add(sc.nextInt());

        }

        // Stream API Filter

        List<Integer> evenNumbers =
                numbers.stream()

                        .filter(num -> num % 2 == 0)

                        .collect(Collectors.toList());

        // Display Results

        System.out.println(
                "\nOriginal List: "
                        + numbers
        );

        System.out.println(
                "Even Numbers: "
                        + evenNumbers
        );

    }

}