package Assessment35;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        try {

            // Create Server

            ServerSocket server =
                    new ServerSocket(5000);

            System.out.println(
                    "Server Started..."
            );

            // Wait for Client

            Socket socket =
                    server.accept();

            System.out.println(
                    "Client Connected"
            );

            // Receive Message

            DataInputStream in =
                    new DataInputStream(
                            socket.getInputStream()
                    );

            String message =
                    in.readUTF();

            System.out.println(
                    "Client Says: "
                            + message
            );

            // Close

            in.close();

            socket.close();

            server.close();

        }

        catch(Exception e) {

            System.out.println(
                    e.getMessage()
            );

        }

    }

}
