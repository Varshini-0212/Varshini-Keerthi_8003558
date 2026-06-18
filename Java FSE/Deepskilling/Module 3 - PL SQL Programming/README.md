# Banking Management System – PL/SQL Exercises

## About the Project

This project is a collection of PL/SQL exercises implemented using MySQL Workbench. The system simulates a basic banking environment and demonstrates important database programming concepts such as stored procedures, functions, triggers, cursors, exception handling, and package-like implementations.

The project was developed to understand how database operations can be automated and managed efficiently using SQL programming techniques.

## Tools and Technologies

* MySQL Workbench
* MySQL Server
* SQL / PL-SQL Concepts

## Database Used

**BankDB**

The database contains the following tables:

* Customers
* Accounts
* Transactions
* Loans
* Employees
* AuditLog
* ErrorLog

## Exercises Completed

### Exercise 1 – Control Structures

Implemented logic to:

* Provide loan interest discounts for senior citizens.
* Promote customers to VIP status based on account balance.
* Generate reminders for customers whose loans are due soon.

### Exercise 2 – Error Handling

Implemented:

* Safe fund transfer with rollback support.
* Employee salary update validation.
* Customer insertion validation to avoid duplicate records.

### Exercise 3 – Stored Procedures

Created procedures for:

* Processing monthly interest.
* Updating employee bonuses.
* Transferring funds between accounts.

### Exercise 4 – Functions

Created functions to:

* Calculate customer age.
* Calculate monthly loan installments.
* Check whether an account has sufficient balance.

### Exercise 5 – Triggers

Implemented triggers to:

* Automatically update the LastModified field.
* Maintain transaction audit logs.
* Enforce deposit and withdrawal business rules.

### Exercise 6 – Cursors

Implemented cursor-based operations to:

* Generate monthly transaction statements.
* Apply annual maintenance fees.
* Update loan interest rates according to policy changes.

### Exercise 7 – Package Equivalent Implementation

Since MySQL does not support Oracle Packages, package functionality was implemented using related procedures and functions.

#### Customer Management

* Add Customer
* Update Customer Details
* Get Customer Balance

#### Employee Management

* Hire Employee
* Update Employee Details
* Calculate Annual Salary

#### Account Operations

* Open Account
* Close Account
* Get Total Balance



## How to Run

1. Open MySQL Workbench.
2. Execute `01_CreateDatabaseAndTables.sql`.
3. Execute `02_InsertSampleData.sql`.
4. Run each exercise file in sequence.
5. Verify the created procedures, functions, and triggers.

## Key Learning Outcomes

* Understanding database programming concepts.
* Working with stored procedures and functions.
* Using triggers for automatic database actions.
* Implementing cursors for record-by-record processing.
* Handling exceptions and maintaining data integrity.
* Applying SQL concepts to real-world banking scenarios.

## Author

**Varshini Keerthi**

Github : https://github.com/Varshini-0212
