-- Task: Average Rating per City
-- Topic: AVG, GROUP BY

USE EventManagement;

SELECT 
    e.city,
    AVG(f.rating) AS average_rating
FROM Events e
JOIN Feedback f
ON e.event_id = f.event_id
GROUP BY e.city;