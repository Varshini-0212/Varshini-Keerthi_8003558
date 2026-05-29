-- Task: User Engagement Index
-- Topic: Aggregate Functions, Multiple JOINs

USE EventManagement;

SELECT 
    u.full_name,
    COUNT(DISTINCT r.event_id) AS attended_events,
    COUNT(DISTINCT f.feedback_id) AS feedback_count
FROM Users u
LEFT JOIN Registrations r
ON u.user_id = r.user_id
LEFT JOIN Feedback f
ON u.user_id = f.user_id
GROUP BY u.full_name;