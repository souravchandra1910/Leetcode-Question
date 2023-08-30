# Write your MySQL query statement below
select eu.unique_id,e.name from employees as e left join employeeUNI as eu on e.id=eu.id;