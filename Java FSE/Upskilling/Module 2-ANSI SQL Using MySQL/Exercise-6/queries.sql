-- Task: Event Resource Summary
-- Topic: Aggregate Functions, GROUP BY

USE EventManagement;

SELECT 
    e.title,
    COUNT(r.resource_id) AS total_resources
FROM Events e
LEFT JOIN Resources r
ON e.event_id = r.event_id
GROUP BY e.title;