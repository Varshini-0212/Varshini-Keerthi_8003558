package Assessment23;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

    public static void main(String[] args) {

        try {

            // Open File

            FileReader reader =
                    new FileReader("output.txt");

            int character;

            System.out.println(
                    "File Content:"
            );

            // Read File

            while((character = reader.read()) != -1) {

                System.out.print(
                        (char) character
                );

            }

            // Close File

            reader.close();

        }

        // Exception Handling

        catch(IOException e) {

            System.out.println(
                    "Error while reading file"
            );

        }

    }

}
