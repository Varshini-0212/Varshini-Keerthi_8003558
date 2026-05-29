-- Task: Daily New User Count
-- Topic: Date Functions, Aggregate Functions

USE EventManagement;

SELECT 
    registration_date,
    COUNT(user_id) AS new_users
FROM Users
WHERE registration_date >= CURDATE() - INTERVAL 7 DAY
GROUP BY registration_date;