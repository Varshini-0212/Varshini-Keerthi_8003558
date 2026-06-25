package JUnit_Exercises.Exercise04;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BackAccountTest {
    private BankAccount account;

    @Before
    public void setUp() {
        System.out.println("Setting up test...");
        account = new BankAccount(1000);
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up after test...");
    }

    @Test
    public void testDeposit() {

        // Arrange
        double depositAmount = 500;

        // Act
        account.deposit(depositAmount);

        // Assert
        assertEquals(1500, account.getBalance(), 0.001);
    }
}
