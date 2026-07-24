# Write your MySQL query statement below
select e.name as Employee
from Employee e
join Employee m
ON e.managerId=m.id
Where e.salary > m.salary;