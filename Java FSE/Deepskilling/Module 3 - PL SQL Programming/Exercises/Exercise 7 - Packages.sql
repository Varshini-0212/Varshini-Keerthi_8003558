-- Exercise-7 packages
-- Scenario 1: CustomerManagement Package

-- Add New Customer
DELIMITER //
CREATE PROCEDURE AddCustomer(
    IN p_customerId INT,
    IN p_name VARCHAR(100),
    IN p_dob DATE,
    IN p_balance DECIMAL(10,2)
)
BEGIN
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
END //
DELIMITER ;

-- Update Customer Details
DELIMITER //
CREATE PROCEDURE UpdateCustomerDetails(
    IN p_customerId INT,
    IN p_name VARCHAR(100)
)
BEGIN
    UPDATE Customers
    SET Name = p_name
    WHERE CustomerID = p_customerId;
END //
DELIMITER ;

-- Get Customer Balance
 DELIMITER //
CREATE FUNCTION GetCustomerBalance(
    p_customerId INT
)
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN
    DECLARE v_balance DECIMAL(10,2);
    SELECT Balance
    INTO v_balance
    FROM Customers
    WHERE CustomerID = p_customerId;
    RETURN v_balance;
END //
DELIMITER ;

-- Scenario 2: EmployeeManagement Package

-- Hire Employee
DELIMITER //
CREATE PROCEDURE HireEmployee(
    IN p_employeeId INT,
    IN p_name VARCHAR(100),
    IN p_position VARCHAR(50),
    IN p_salary DECIMAL(10,2),
    IN p_department VARCHAR(50)
)
BEGIN
    INSERT INTO Employees(
        EmployeeID,
        Name,
        Position,
        Salary,
        Department,
        HireDate
    )
    VALUES(
        p_employeeId,
        p_name,
        p_position,
        p_salary,
        p_department,
        CURDATE()
    );
END //
DELIMITER ;

-- Update Employee Details
DELIMITER //
CREATE PROCEDURE UpdateEmployeeDetails(
    IN p_employeeId INT,
    IN p_position VARCHAR(50)
)
BEGIN
    UPDATE Employees
    SET Position = p_position
    WHERE EmployeeID = p_employeeId;
END //
DELIMITER ;

-- Calculate Annual Salary
DELIMITER //
CREATE FUNCTION CalculateAnnualSalary(
    p_employeeId INT
)
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN
    DECLARE v_salary DECIMAL(10,2);
    SELECT Salary
    INTO v_salary
    FROM Employees
    WHERE EmployeeID = p_employeeId;
    RETURN v_salary * 12;
END //
DELIMITER ;

-- Scenario 3: AccountOperations Package

-- Open Account
DELIMITER //
CREATE PROCEDURE OpenAccount(
    IN p_accountId INT,
    IN p_customerId INT,
    IN p_accountType VARCHAR(20),
    IN p_balance DECIMAL(10,2)
)
BEGIN
    INSERT INTO Accounts(
        AccountID,
        CustomerID,
        AccountType,
        Balance,
        LastModified
    )
    VALUES(
        p_accountId,
        p_customerId,
        p_accountType,
        p_balance,
        NOW()
    );
END //
DELIMITER ;

-- Close Account
DELIMITER //
CREATE PROCEDURE CloseAccount(
    IN p_accountId INT
)
BEGIN
    DELETE FROM Accounts
    WHERE AccountID = p_accountId;
END //
DELIMITER ;

-- Get Total Balance
DELIMITER //
CREATE FUNCTION GetTotalBalance(
    p_customerId INT
)
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN
    DECLARE v_total DECIMAL(10,2);
    SELECT IFNULL(SUM(Balance),0)
    INTO v_total
    FROM Accounts
    WHERE CustomerID = p_customerId;
    RETURN v_total;
END //
DELIMITER ;

-- Testing
-- Customer Package
CALL AddCustomer(10,'Rahul','1998-05-10',5000);
CALL UpdateCustomerDetails(10,'Rahul Sharma');
SELECT GetCustomerBalance(10);

-- Employee Package
CALL HireEmployee(
3,
'David',
'Analyst',
50000,
'Finance'
);

CALL UpdateEmployeeDetails(
3,
'Senior Analyst'
);

SELECT CalculateAnnualSalary(3);

-- Account Package
CALL OpenAccount(
10,
1,
'Savings',
10000
);
SELECT GetTotalBalance(1);
CALL CloseAccount(10);

SHOW PROCEDURE STATUS
WHERE Db='BankDB';

SHOW FUNCTION STATUS
WHERE Db='BankDB';