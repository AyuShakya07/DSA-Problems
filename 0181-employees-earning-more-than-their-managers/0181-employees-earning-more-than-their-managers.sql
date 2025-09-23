# Write your MySQL query statement below

SELECT em.name AS Employee
FROM Employee ep
INNER JOIN Employee em ON ep.id=em.managerID
WHERE ep.salary<em.salary;