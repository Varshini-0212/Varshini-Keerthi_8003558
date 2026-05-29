-- Task: Sessions per Upcoming Event
-- Topic: JOINs, COUNT, GROUP BY

USE EventManagement;

SELECT 
    e.title,
    COUNT(s.session_id) AS session_count
FROM Events e
LEFT JOIN Sessions s
ON e.event_id = s.event_id
WHERE e.status = 'upcoming'
GROUP BY e.title;