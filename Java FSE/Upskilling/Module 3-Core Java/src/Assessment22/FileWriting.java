package Assessment22;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // User Input

            System.out.println(
                    "Enter text to write into file:"
            );

            String text = sc.nextLine();

            // File Writing

            FileWriter writer =
                    new FileWriter("output.txt");

            writer.write(text);

            writer.close();

            System.out.println(
                    "Data written successfully into output.txt"
            );

        }

        // Exception Handling

        catch(IOException e) {

            System.out.println(
                    "Error while writing file"
            );

        }

    }

}
