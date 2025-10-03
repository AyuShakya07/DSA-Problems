# Write your MySQL query statement below
Select email 
FROM Person
Group by email
Having count(email)>1