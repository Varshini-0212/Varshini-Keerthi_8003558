-- Task: Resource Availability Check
-- Topic: LEFT JOIN, NULL Handling

USE EventManagement;

SELECT 
    e.title
FROM Events e
LEFT JOIN Resources r
ON e.event_id = r.event_id
WHERE r.resource_id IS NULL;