__________________________________________________________________________________________________
SELECT e1.Name FROM Employee e1
JOIN Employee e2 ON e1.ManagerId = e2.Id
WHERE e1.Salary > e2.Salary;
__________________________________________________________________________________________________
SELECT e1.Name FROM Employee e1, Employee e2
WHERE e1.ManagerId = e2.Id AND e1.Salary > e2.Salary;
__________________________________________________________________________________________________