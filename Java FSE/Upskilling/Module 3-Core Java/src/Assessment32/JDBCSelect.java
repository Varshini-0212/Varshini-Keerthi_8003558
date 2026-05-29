package Assessment32;

import java.sql.*;

public class JDBCSelect {

    public static void main(String[] args) {

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

            // SQL Query

            String query =
                    "SELECT * FROM student";

            // Statement

            Statement st =
                    con.createStatement();

            // Execute Query

            ResultSet rs =
                    st.executeQuery(query);

            // Display Data

            System.out.println(
                    "Student Records"
            );

            while(rs.next()) {

                System.out.println(
                        "ID: "
                                + rs.getInt("id")
                                + " Name: "
                                + rs.getString("name")
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
