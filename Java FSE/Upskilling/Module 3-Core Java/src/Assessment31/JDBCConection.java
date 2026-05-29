package Assessment31;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JDBCConection {
    public static void main(String[] args) {

        // Database URL

        String url =
                "jdbc:mysql://localhost:3306/corejava";

        // MySQL Username

        String username = "root";

        // MySQL Password

        String password = "admin";

        try {

            // Establish Connection

            Connection con =
                    DriverManager.getConnection(
                            url,
                            username,
                            password
                    );

            System.out.println(
                    "Database Connected Successfully"
            );

            // Close Connection

            con.close();

        }

        catch(SQLException e) {

            System.out.println(
                    "Database Connection Failed"
            );

            System.out.println(
                    e.getMessage()
            );

        }

    }
}
