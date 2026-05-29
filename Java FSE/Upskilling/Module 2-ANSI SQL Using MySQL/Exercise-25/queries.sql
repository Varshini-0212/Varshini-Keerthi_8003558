-- Task: Events Without Sessions
-- Topic: LEFT JOIN, NULL Handling

USE EventManagement;

SELECT 
    e.title,
    COUNT(DISTINCT r.user_id) AS total_participants,
    COUNT(DISTINCT s.session_id) AS total_sessions,
    COUNT(DISTINCT f.feedback_id) AS total_feedbacks
FROM Events e
LEFT JOIN Registrations r
ON e.event_id = r.event_id
LEFT JOIN Sessions s
ON e.event_id = s.event_id
LEFT JOIN Feedback f
ON e.event_id = f.event_id
GROUP BY e.title;