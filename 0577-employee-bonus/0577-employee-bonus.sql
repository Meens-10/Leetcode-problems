# Write your MySQL query statement below

select e.name as name , B.bonus as bonus from employee e left  join bonus B 
on e.empid = B.empId 
where b.bonus < 1000 or Bonus is null ;