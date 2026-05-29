-- Task: Registration Trends
-- Topic: Date Functions, Aggregate Functions

USE EventManagement;

SELECT 
    MONTH(registration_date) AS month,
    YEAR(registration_date) AS year,
    COUNT(registration_id) AS total_registrations
FROM Registrations
WHERE registration_date >= CURDATE() - INTERVAL 12 MONTH
GROUP BY YEAR(registration_date), MONTH(registration_date)
ORDER BY year, month;