package Assessment33;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TransactionHandling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

            // Disable Auto Commit

            con.setAutoCommit(false);

            // User Input

            System.out.println(
                    "Enter Sender Account ID:"
            );

            int sender = sc.nextInt();

            System.out.println(
                    "Enter Receiver Account ID:"
            );

            int receiver = sc.nextInt();

            System.out.println(
                    "Enter Amount:"
            );

            double amount = sc.nextDouble();

            // Debit Query

            String debitQuery =
                    "UPDATE accounts SET balance = balance - ? WHERE id = ?";

            PreparedStatement debit =
                    con.prepareStatement(debitQuery);

            debit.setDouble(1, amount);

            debit.setInt(2, sender);

            debit.executeUpdate();

            // Credit Query

            String creditQuery =
                    "UPDATE accounts SET balance = balance + ? WHERE id = ?";

            PreparedStatement credit =
                    con.prepareStatement(creditQuery);

            credit.setDouble(1, amount);

            credit.setInt(2, receiver);

            credit.executeUpdate();

            // Commit Transaction

            con.commit();

            System.out.println(
                    "Money Transfer Successful"
            );

            con.close();

        }

        catch(SQLException e) {

            System.out.println(
                    "Transaction Failed"
            );

            System.out.println(
                    e.getMessage()
            );

        }

    }

}
