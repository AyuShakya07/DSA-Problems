# Write your MySQL query statement below
Select a.name as Customers
from Customers a
left join Orders b on a.id=b.customerid
where b.customerID is null