# EXERCISE 1
# Scenario 1: Apply 1% Discount to Loan Interest Rates for Customers Above 60

DELIMITER //
CREATE PROCEDURE ApplySeniorCitizenDiscount()
BEGIN
    DECLARE done INT DEFAULT FALSE;
    DECLARE v_customerId INT;
    DECLARE v_age INT;

    DECLARE cur CURSOR FOR
    SELECT CustomerID,
           TIMESTAMPDIFF(YEAR, DOB, CURDATE())
    FROM Customers;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;
    OPEN cur;
    read_loop: LOOP
        FETCH cur INTO v_customerId, v_age;
	
        IF done THEN
            LEAVE read_loop;
        END IF;

        IF v_age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = v_customerId;
        END IF;
    END LOOP;
    CLOSE cur;
END //
DELIMITER ;
CALL ApplySeniorCitizenDiscount();

# Scenario 2: Promote Customers to VIP Status

ALTER TABLE Customers
ADD COLUMN IsVIP BOOLEAN DEFAULT FALSE;
CALL PromoteVIPCustomers();
SELECT * FROM Customers;

# Scenario 3: Loan Due Reminder (Next 30 Days)

DELIMITER //
CREATE PROCEDURE LoanDueReminders()
BEGIN
    DECLARE done INT DEFAULT FALSE;
    DECLARE v_customerId INT;
    DECLARE v_loanId INT;
    DECLARE v_endDate DATE;
    DECLARE cur CURSOR FOR
    SELECT LoanID, CustomerID, EndDate
    FROM Loans
    WHERE EndDate BETWEEN CURDATE()
    AND DATE_ADD(CURDATE(), INTERVAL 30 DAY);
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;
    
    OPEN cur;
    reminder_loop: LOOP
        FETCH cur INTO v_loanId, v_customerId, v_endDate;
        
        IF done THEN
            LEAVE reminder_loop;
        END IF;

        SELECT CONCAT(
            'Reminder: Customer ',
            v_customerId,
            ' Loan ',
            v_loanId,
            ' is due on ',
            v_endDate
        ) AS Reminder_Message;

    END LOOP;
    CLOSE cur;
END //
DELIMITER ;
CALL LoanDueReminders();