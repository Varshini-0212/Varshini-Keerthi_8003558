-- Exercise 4
-- Scenario 1: Calculate the age of a customer

DELIMITER //
CREATE FUNCTION CalculateAge(
    p_dob DATE
)
RETURNS INT
DETERMINISTIC
BEGIN
    RETURN TIMESTAMPDIFF(
        YEAR,
        p_dob,
        CURDATE()
    );
END //
DELIMITER ;
SELECT CalculateAge('1990-07-20') AS Age;

-- Scenario 2: Calculate monthly installment

DELIMITER //
CREATE FUNCTION CalculateMonthlyInstallment(
    p_loanAmount DECIMAL(10,2),
    p_interestRate DECIMAL(5,2),
    p_years INT
)
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN
    DECLARE totalAmount DECIMAL(10,2);
    SET totalAmount =
        p_loanAmount +
        (p_loanAmount * p_interestRate / 100);
    RETURN totalAmount / (p_years * 12);
END //
DELIMITER ;

SELECT CalculateMonthlyInstallment(
    5000,
    5,
    5
) AS MonthlyInstallment;

-- Scenario 3: Check account balance before transaction

DELIMITER //
CREATE FUNCTION HasSufficientBalance(
    p_accountId INT,
    p_amount DECIMAL(10,2)
)
RETURNS BOOLEAN
DETERMINISTIC
BEGIN
    DECLARE v_balance DECIMAL(10,2);
    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_accountId;
    RETURN v_balance >= p_amount;
END //
DELIMITER ;
SELECT HasSufficientBalance(
    1,
    500
) AS Result;
SHOW FUNCTION STATUS
WHERE Db = 'BankDB';