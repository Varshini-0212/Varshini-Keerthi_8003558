-- Task: Top Feedback Providers
-- Topic: COUNT, GROUP BY, ORDER BY

USE EventManagement;

SELECT 
    u.full_name,
    COUNT(f.feedback_id) AS total_feedbacks
FROM Users u
JOIN Feedback f
ON u.user_id = f.user_id
GROUP BY u.full_name
ORDER BY total_feedbacks DESC
LIMIT 5;