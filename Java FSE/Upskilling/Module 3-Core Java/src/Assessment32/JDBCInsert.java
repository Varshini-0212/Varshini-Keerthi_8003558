package Assessment32;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCInsert {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Database Details

        String url =
                "jdbc:mysql://localhost:3306/corejava";

        String username = "root";

        String password = "admin";

        try {

            // Connection

            Connection con =
                    DriverManager.getConnection(
                            url,
                            username,
                            password
                    );

            // User Input

            System.out.println(
                    "Enter Student ID:"
            );

            int id = sc.nextInt();

            sc.nextLine();

            System.out.println(
                    "Enter Student Name:"
            );

            String name = sc.nextLine();

            // SQL Query

            String query =
                    "INSERT INTO student VALUES (?, ?)";

            // PreparedStatement

            PreparedStatement pst =
                    con.prepareStatement(query);

            pst.setInt(1, id);

            pst.setString(2, name);

            // Execute Query

            int rows =
                    pst.executeUpdate();

            if(rows > 0) {

                System.out.println(
                        "Record Inserted Successfully"
                );

            }

            con.close();

        }

        catch(SQLException e) {

            System.out.println(
                    "Database Error"
            );

            System.out.println(
                    e.getMessage()
            );

        }

    }

}
