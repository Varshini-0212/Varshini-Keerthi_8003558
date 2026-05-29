-- Task: Unregistered Active Users
-- Topic: LEFT JOIN, Date Filtering

USE EventManagement;

SELECT *
FROM Users
WHERE registration_date >= CURDATE() - INTERVAL 30 DAY
AND user_id NOT IN (

    SELECT user_id
    FROM Registrations

);