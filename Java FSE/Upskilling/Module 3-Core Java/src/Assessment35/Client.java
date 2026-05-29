package Assessment35;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // Connect to Server

            Socket socket =
                    new Socket(
                            "localhost",
                            5000
                    );

            System.out.println(
                    "Connected To Server"
            );

            // Send Message

            DataOutputStream out =
                    new DataOutputStream(
                            socket.getOutputStream()
                    );

            System.out.println(
                    "Enter Message:"
            );

            String msg =
                    sc.nextLine();

            out.writeUTF(msg);

            // Close

            out.close();

            socket.close();

        }

        catch(Exception e) {

            System.out.println(
                    e.getMessage()
            );

        }

    }

}
