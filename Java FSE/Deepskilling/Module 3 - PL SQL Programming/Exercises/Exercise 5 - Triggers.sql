-- Exercise 5
-- Scenario 1: Update LastModified automatically

DELIMITER //
CREATE TRIGGER UpdateCustomerLastModified
BEFORE UPDATE
ON Customers
FOR EACH ROW
BEGIN
    SET NEW.LastModified = NOW();
END //
DELIMITER ;
UPDATE Customers
SET Balance = 2000
WHERE CustomerID = 1;
SELECT * FROM Customers;

-- Scenario 2: Maintain transaction audit log
CREATE TABLE AuditLog (
    LogID INT AUTO_INCREMENT PRIMARY KEY,
    TransactionID INT,
    AccountID INT,
    Amount DECIMAL(10,2),
    TransactionType VARCHAR(20),
    LogDate DATETIME
);
SHOW TABLES;
DELIMITER //
CREATE TRIGGER LogTransaction
AFTER INSERT
ON Transactions
FOR EACH ROW
BEGIN
    INSERT INTO AuditLog(
        TransactionID,
        AccountID,
        Amount,
        TransactionType,
        LogDate
    )
    VALUES(
        NEW.TransactionID,
        NEW.AccountID,
        NEW.Amount,
        NEW.TransactionType,
        NOW()
    );
END //
DELIMITER ;

INSERT INTO Transactions
VALUES(
    3,
    1,
    CURDATE(),
    500,
    'Deposit'
);
SELECT * FROM AuditLog;
INSERT INTO Transactions
VALUES(
    4,
    1,
    CURDATE(),
    500,
    'Deposit'
);
SELECT * FROM AuditLog;

-- Scenario 3: Enforce transaction rules

DELIMITER //
CREATE TRIGGER CheckTransactionRules
BEFORE INSERT
ON Transactions
FOR EACH ROW
BEGIN
    DECLARE v_balance DECIMAL(10,2);
    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = NEW.AccountID;
    -- Deposit must be positive
    IF NEW.TransactionType = 'Deposit'
       AND NEW.Amount <= 0 THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT =
        'Deposit amount must be positive';
    END IF;
    -- Withdrawal cannot exceed balance
    IF NEW.TransactionType = 'Withdrawal'
       AND NEW.Amount > v_balance THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT =
        'Insufficient balance for withdrawal';
    END IF;
END //
DELIMITER ;

INSERT INTO Transactions
VALUES(
    5,
    1,
    CURDATE(),
    -100,
    'Deposit'
);
-- Expected Error : Deposit amount must be positive

INSERT INTO Transactions
VALUES(
    6,
    1,
    CURDATE(),
    50000,
    'Withdrawal'
);
-- Expected Error : Insufficient balance for withdrawal

INSERT INTO Transactions
VALUES(
    7,
    1,
    CURDATE(),
    100,
    'Deposit'
);
-- successfully executed
SHOW TRIGGERS;