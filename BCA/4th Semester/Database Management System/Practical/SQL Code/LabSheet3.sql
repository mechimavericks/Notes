create Database lab3;
use lab3;
CREATE TABLE Employee(
	eid int,
	ename varchar(25),
	branch_name varchar(25),
	salary int
);
INSERT  INTO Employee values
(10,"Saroj","KTM",13000),
(11,"Bikash","LPT",15000),
(13,"Rabi","KTM",18000),
(16,"Subash","LPT",15000),
(19,"Santhosh","BKT",7500),
(20,"Ajay","KTM",11000),
(21,"Kiran","BKT",14500),
(22,"Bipin","LPT",7500);



SELECT SUM(salary) from Employee;  
SELECT MAX(salary) as Highest_Salary from Employee;
SELECT AVG(salary) from Employee;
SELECT COUNT(*) from Employee;
SELECT DISTINCT branch_name from Employee;
SELECT count(branch_name) from Employee;
SELECT ename from Employee ORDER BY ename ASC;
SELECT ename from Employee;
SELECT ename from Employee WHERE salary=(SELECT MAX(salary) from Employee);
SELECT ename from Employee WHERE salary=(SELECT MIN(salary) from Employee);
SELECT ename from Employee WHERE salary>(SELECT AVG(salary) from Employee);
SELECT ename from Employee WHERE salary=(SELECT salary from Employee WHERE ename="Bipin") AND ename<>"Bipin";
SELECT SUM(salary) from Employee GROUP BY branch_name;
SELECT branch_name, SUM(salary) from Employee GROUP BY branch_name having SUM(salary)>50000;


































