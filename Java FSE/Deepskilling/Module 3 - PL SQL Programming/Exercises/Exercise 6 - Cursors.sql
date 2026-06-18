-- Exercise 6
-- Scenario 1: Generate Monthly Statements

DELIMITER //
CREATE PROCEDURE GenerateMonthlyStatements()
BEGIN
    DECLARE done INT DEFAULT FALSE;
    DECLARE v_transactionId INT;
    DECLARE v_accountId INT;
    DECLARE v_amount DECIMAL(10,2);
    DECLARE v_type VARCHAR(20);

    DECLARE cur CURSOR FOR
    SELECT TransactionID,
           AccountID,
           Amount,
           TransactionType
    FROM Transactions
    WHERE MONTH(TransactionDate)=MONTH(CURDATE())
      AND YEAR(TransactionDate)=YEAR(CURDATE());

    DECLARE CONTINUE HANDLER FOR NOT FOUND
    SET done = TRUE;
    OPEN cur;
    read_loop: LOOP
        FETCH cur INTO
        v_transactionId,
        v_accountId,
        v_amount,
        v_type;

        IF done THEN
            LEAVE read_loop;
        END IF;
        SELECT CONCAT(
            'Transaction ID: ',
            v_transactionId,
            ', Account: ',
            v_accountId,
            ', Amount: ',
            v_amount,
            ', Type: ',
            v_type
        ) AS MonthlyStatement;
    END LOOP;
    CLOSE cur;
END //
DELIMITER ;
CALL GenerateMonthlyStatements();

-- Scenario 2: Apply Annual Fee

DELIMITER //
CREATE PROCEDURE ApplyAnnualFee()
BEGIN
    DECLARE done INT DEFAULT FALSE;
    DECLARE v_accountId INT;

    DECLARE cur CURSOR FOR
    SELECT AccountID
    FROM Accounts;

    DECLARE CONTINUE HANDLER FOR NOT FOUND
    SET done = TRUE;
    OPEN cur;
    fee_loop: LOOP
        FETCH cur INTO v_accountId;
        IF done THEN
            LEAVE fee_loop;
        END IF;
        UPDATE Accounts
        SET Balance = Balance - 100
        WHERE AccountID = v_accountId;
    END LOOP;
    CLOSE cur;
END //
DELIMITER ;
CALL ApplyAnnualFee();
SELECT * FROM Accounts;

-- Scenario 3: Update Loan Interest Rates

DELIMITER //
CREATE PROCEDURE UpdateLoanInterestRates()
BEGIN
    DECLARE done INT DEFAULT FALSE;
    DECLARE v_loanId INT;
    DECLARE cur CURSOR FOR
    SELECT LoanID
    FROM Loans;

    DECLARE CONTINUE HANDLER FOR NOT FOUND
    SET done = TRUE;

    OPEN cur;
    loan_loop: LOOP
        FETCH cur INTO v_loanId;
        IF done THEN
            LEAVE loan_loop;
        END IF;
        UPDATE Loans
        SET InterestRate = InterestRate + 0.5
        WHERE LoanID = v_loanId;
    END LOOP;
    CLOSE cur;
END //
DELIMITER ;
CALL UpdateLoanInterestRates();
SELECT * FROM Loans;
SHOW PROCEDURE STATUS
WHERE Db='BankDB';