-- Task: Peak Session Hours
-- Topic: Aggregate Functions, Time Filtering

USE EventManagement;

SELECT 
    e.title,
    COUNT(s.session_id) AS total_sessions
FROM Events e
JOIN Sessions s
ON e.event_id = s.event_id
WHERE TIME(s.start_time) BETWEEN '10:00:00' AND '12:00:00'
GROUP BY e.title;