# Exercise 2: Error Handling
# Create Error Log Table
-- Table to store error messages

CREATE TABLE ErrorLog (
    LogID INT AUTO_INCREMENT PRIMARY KEY,
    ErrorMessage VARCHAR(255),
    ErrorDate DATETIME DEFAULT CURRENT_TIMESTAMP
);

# Scenario 1: SafeTransferFunds
-- Transfer money safely between accounts

DELIMITER //
CREATE PROCEDURE SafeTransferFunds(
    IN p_fromAccount INT,
    IN p_toAccount INT,
    IN p_amount DECIMAL(10,2)
)
BEGIN

    DECLARE v_balance DECIMAL(10,2);
    DECLARE EXIT HANDLER FOR SQLEXCEPTION
    BEGIN
        ROLLBACK;
        INSERT INTO ErrorLog(ErrorMessage)
        VALUES('Error occurred during fund transfer');
    END;

    START TRANSACTION;
    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_fromAccount;

    IF v_balance < p_amount THEN
        INSERT INTO ErrorLog(ErrorMessage)
        VALUES('Insufficient Funds');
        ROLLBACK;
    ELSE
        UPDATE Accounts
        SET Balance = Balance - p_amount
        WHERE AccountID = p_fromAccount;

        UPDATE Accounts
        SET Balance = Balance + p_amount
        WHERE AccountID = p_toAccount;
        
        COMMIT;
    END IF;
END //
DELIMITER ;
CALL SafeTransferFunds(1,2,500);

#  Scenario 2: UpdateSalary
-- Increase employee salary by percentage

DELIMITER //
CREATE PROCEDURE UpdateSalary(
    IN p_employeeId INT,
    IN p_percentage DECIMAL(5,2)
)
BEGIN
    DECLARE v_count INT;
    SELECT COUNT(*)
    INTO v_count
    FROM Employees
    WHERE EmployeeID = p_employeeId;

    IF v_count = 0 THEN
        INSERT INTO ErrorLog(ErrorMessage)
        VALUES('Employee ID does not exist');
    ELSE
        UPDATE Employees
        SET Salary = Salary +
                     (Salary * p_percentage / 100)
        WHERE EmployeeID = p_employeeId;
    END IF;
END //
DELIMITER ;
CALL UpdateSalary(1,10);
SELECT * FROM Employees;

# Scenario 3: AddNewCustomer
-- Insert customer safely

DELIMITER //
CREATE PROCEDURE AddNewCustomer(
    IN p_customerId INT,
    IN p_name VARCHAR(100),
    IN p_dob DATE,
    IN p_balance DECIMAL(10,2)
)
BEGIN
    DECLARE v_count INT;
    SELECT COUNT(*)
    INTO v_count
    FROM Customers
    WHERE CustomerID = p_customerId;
    IF v_count > 0 THEN
        INSERT INTO ErrorLog(ErrorMessage)
        VALUES('Customer ID already exists');
    ELSE
        INSERT INTO Customers(
            CustomerID,
            Name,
            DOB,
            Balance,
            LastModified
        )
        VALUES(
            p_customerId,
            p_name,
            p_dob,
            p_balance,
            NOW()
        );
    END IF;
END //
DELIMITER ;
CALL AddNewCustomer(
    3,
    'David Wilson',
    '1995-08-15',
    5000
);
SELECT * FROM Customers;

-- View all logged errors
SELECT * FROM ErrorLog;