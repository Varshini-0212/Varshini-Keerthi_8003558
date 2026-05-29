-- Task: Organizer Event Summary
-- Topic: JOINs, Aggregate Functions

USE EventManagement;

SELECT 
    u.full_name AS organizer,
    e.status,
    COUNT(e.event_id) AS total_events
FROM Users u
JOIN Events e
ON u.user_id = e.organizer_id
GROUP BY u.full_name, e.status;