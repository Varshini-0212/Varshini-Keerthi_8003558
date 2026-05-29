-- Task: Event with Maximum Sessions
-- Topic: Aggregate Functions, Subqueries

USE EventManagement;

SELECT 
    e.title,
    COUNT(s.session_id) AS total_sessions
FROM Events e
JOIN Sessions s
ON e.event_id = s.event_id
GROUP BY e.title
ORDER BY total_sessions DESC
LIMIT 1;