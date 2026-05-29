package Assessment14;
import java.util.Scanner;

public class ArraySumAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input Array Size

        System.out.println(
                "Enter number of elements:"
        );

        int n = sc.nextInt();

        int[] arr = new int[n];

        int sum = 0;

        // Input Array Elements

        System.out.println(
                "Enter array elements:"
        );

        for(int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

            sum = sum + arr[i];

        }

        // Calculate Average

        double average =
                (double) sum / n;

        // Output

        System.out.println(
                "Sum = " + sum
        );

        System.out.println(
                "Average = " + average
        );

    }

}
