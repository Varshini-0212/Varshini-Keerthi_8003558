# Module 4 - Test Driven Development and Logging Framework

## Overview

This module focuses on software testing and logging using industry-standard frameworks. It covers unit testing with JUnit, mocking with Mockito, and application logging using SLF4J and Logback.

## Technologies Used

* Java
* Maven
* JUnit 4.13.2
* Mockito 4.11.0
* SLF4J 1.7.30
* Logback 1.2.3

---

## JUnit Exercises

### Exercise 01 - Setting Up JUnit

* Configured JUnit in a Maven project.
* Created and executed a basic test case.

### Exercise 02 - Writing Basic JUnit Tests

* Developed test cases for Calculator operations.
* Verified addition and subtraction methods.

### Exercise 03 - Assertions in JUnit

* Used JUnit assertion methods:

    * assertEquals()
    * assertTrue()
    * assertFalse()
    * assertNull()
    * assertNotNull()

### Exercise 04 - AAA Pattern, Setup and Teardown

* Implemented Arrange-Act-Assert pattern.
* Used @Before and @After annotations.
* Tested BankAccount functionality.

---

## Mockito Exercises

### Exercise 01 - Mocking and Stubbing

* Created mock objects.
* Stubbed methods to return predefined values.

### Exercise 02 - Verifying Interactions

* Verified method calls using Mockito verify().

### Exercise 03 - Argument Matching

* Used Mockito argument matchers such as anyString().

### Exercise 04 - Handling Void Methods

* Mocked and verified void methods.

### Exercise 05 - Mocking and Stubbing with Multiple Returns

* Configured consecutive return values using thenReturn().

### Exercise 06 - Verifying Interaction Order

* Verified execution order using InOrder.

### Exercise 07 - Handling Void Methods with Exceptions

* Simulated exceptions using doThrow().
* Tested exception handling scenarios.

---

## SLF4J Logging Exercises

### Exercise 01 - Logging Error Messages and Warning Levels

* Implemented logging using SLF4J.
* Generated ERROR and WARN level logs.

### Exercise 02 - Parameterized Logging

* Used parameterized logging placeholders {}.
* Logged dynamic values efficiently.

### Exercise 03 - Using Different Appenders

* Configured Logback using logback.xml.
* Implemented ConsoleAppender and FileAppender.
* Generated logs in both console and log file.

---

## Learning Outcomes

* Understand Test Driven Development concepts.
* Write and execute unit tests using JUnit.
* Create mock objects and verify behavior using Mockito.
* Implement structured logging using SLF4J and Logback.
* Configure appenders and logging levels.
* Build maintainable and testable Java applications.

## Author

Varshini Keerthi
