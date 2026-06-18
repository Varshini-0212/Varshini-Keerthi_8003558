-- Exercise 3
-- Scenario 1: Process monthly interest for savings accounts

DELIMITER //
CREATE PROCEDURE ProcessMonthlyInterest()
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType = 'Savings';
END //
DELIMITER ;
CALL ProcessMonthlyInterest();
SELECT * FROM Accounts;

-- Scenario 2: Update employee bonus based on department
DROP PROCEDURE IF EXISTS UpdateEmployeeBonus;
DELIMITER //
CREATE PROCEDURE UpdateEmployeeBonus(
    IN p_department VARCHAR(50),
    IN p_bonusPercent DECIMAL(5,2)
)
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_bonusPercent / 100)
    WHERE EmployeeID IN
    (
        SELECT EmployeeID
        FROM (
            SELECT EmployeeID
            FROM Employees
            WHERE Department = p_department
        ) temp
    );
END //
DELIMITER ;
SELECT @@SQL_SAFE_UPDATES;
CALL UpdateEmployeeBonus('IT',10);

-- Scenario 3: Transfer funds between accounts
DELIMITER //
CREATE PROCEDURE TransferFunds(
    IN p_fromAccount INT,
    IN p_toAccount INT,
    IN p_amount DECIMAL(10,2)
)
BEGIN
    DECLARE v_balance DECIMAL(10,2);
    -- Get source account balance
    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_fromAccount;
    -- Check sufficient balance
    IF v_balance >= p_amount THEN
        -- Deduct from source account
        UPDATE Accounts
        SET Balance = Balance - p_amount
        WHERE AccountID = p_fromAccount;
        -- Add to destination account
        UPDATE Accounts
        SET Balance = Balance + p_amount
        WHERE AccountID = p_toAccount;
        SELECT 'Transfer Successful' AS Message;
    ELSE
        SELECT 'Insufficient Balance' AS Message;
    END IF;
END //
DELIMITER ;
CALL TransferFunds(1,2,200);
SELECT * FROM Accounts;