# Write your MySQL query statement below
select l.firstName,l.lastName,r.city,r.state from Person as l left join Address as r on l.personId=r.personId;