-- Task: Average Session Duration per Event
-- Topic: Date-Time Functions, AVG

USE EventManagement;

SELECT 
    e.title,
    AVG(
        TIMESTAMPDIFF(
            MINUTE,
            s.start_time,
            s.end_time
        )
    ) AS average_duration_minutes
FROM Events e
JOIN Sessions s
ON e.event_id = s.event_id
GROUP BY e.title;