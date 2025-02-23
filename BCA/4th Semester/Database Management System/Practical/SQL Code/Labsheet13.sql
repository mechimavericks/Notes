CREATE DATABASE lab13;
use lab13;
CREATE TABLE Location(
	location_id int primary key,
	regional_group varchar(25)
);
INSERT INTO Location VALUES(122,"New York"),
(123,"Dallas"),
(124,"Chicago"),
(167,"Boston");
CReate TABLE Department(
	department_id int primary key,
	name varchar(25),
	location_id int,
	foreign key(location_id) references Location(location_id)
);
INSERT INTO Department VALUES(10,"Accounting",122),
(20,"Research",124),
(30,"Sales",123),
(40,"Operations",167);
CREATE Table Job(
	job_id int primary key,
	function varchar(25)
);
INSERT INTO Job VALUES(667,"Clerk"),
(668,"Staff"),
(669,"Analyst"),
(670,"Salesperson"),
(671,"Manager"),
(672,"President");
CREATE TABLE Employee(
	employee_id int primary key,
	last_name varchar(25),
	first_name varchar(25),
	middle_name varchar(25),
	job_id int,
	manager_id int,
	hire_date varchar(25),
	salary decimal(10,2),
	comm int,
	department_id int,
	foreign key(job_id) references Job(job_id),
	foreign key(department_id) references Department(department_id)
);

INSERT INTO Employee(employee_id,last_name,first_name,middle_name,job_id,manager_id,hire_date,salary,department_id)
VALUES(7369,"Smith","John","Q",667,7902,"17-Dec-84",800,20),
(7505,"Doyle","Jean","k",671,7839,"04-Apr-85",2850,30),
(7506,"Dennis","Lynn","S",671,7839,"15-May-85",2750,30),
(7507,"Baker","Leslie","D",671,7839,"10-Jun-85",2200,40);
INSERT INTO Employee Values(7499,"Allen","Kevi","J",670,7698,"20-Feb-85",1600,300,30),
(7521,"Wark","Cynthia","D",670,7698,"22-Feb-85",1250,500,30);


-- Simple Queries
SELECT * FROM Employee;
SELECT * FROM Department;
SELECT * FROM Job;
SELECT * FROM Location;
SELECT first_name,last_name,salary,comm FROM Employee;
SELECT employee_id AS "ID of the Employee",last_name AS "Name of the Employee", department_id AS "Department ID" FROM Employee;
SELECT first_name,salary FROM Employee;



-- Where Conditions
SELECT * FROM Employee WHERE last_name ="Smith";
SELECT first_name FROM Employee WHERE department_id = 20;
SELECT first_name FROM Employee WHERE salary BETWEEN 3000 AND 4500;
SELECT first_name FROM Employee WHERE department_id IN(10,20);
SELECT first_name FROM Employee WHERE department_id NOT IN (10,30);
SELECT first_name FROM Employee WHERE last_name LIKE "S%";
SELECT first_name,last_name FROM Employee WHERE last_name LIKE "S%H";
SELECT first_name FROM Employee WHERE last_name LIKE "S___";
SELECT first_name FROM Employee WHERE department_id=10 and salary>3500;
SELECT first_name FROM Employee WHERE comm IS NULL;



-- Order By clause
SELECT employee_id,last_name FROM Employee ORDER BY employee_id ASC;
SELECT employee_id,last_name FROM Employee ORDER BY salary DESC;
SELECT first_name,last_name,salary FROM Employee ORDER BY last_name ASC, salary DESC;
SELECT first_name,last_name,department_id FROM Employee ORDER BY last_name ASC, department_id DESC;




-- Group By & Having Clause
SELECT department_id,count(*) FROM Employee GROUP BY department_id;
SELECT department_id,MAX(salary),MIN(salary),AVG(salary) FROM Employee GROUP BY department_id;
SELECT job_id,MAX(salary),MIN(salary),AVG(salary) FROM Employee GROUP BY job_id;
SELECT department_id,count(*) FROM Employee GROUP BY department_id HAVING count(*)>=4;



-- Sub Queries
SELECT first_name FROM Employee WHERE salary=(SELECT MAX(salary) from Employee);
SELECT first_name FROM Employee WHERE department_id=(SELECT department_id FROM Department WHERE name="Sales");
SELECT first_name FROM Employee WHERE job_id=(SELECT job_id FROM Job WHERE function="Clerk");
SELECT first_name FROM Employee,Department,Location WHERE Employee.department_id=Department.department_id 
AND Department.location_id = Location.location_id AND Location.regional_group="New York";
SELECT count(*) FROM Employee WHERE department_id=(SELECT department_id FROM Department WHERE name="Sales");
UPDATE Employee SET Salary=salary+salary*0.1 WHERE job_id=(SELECT job_id FROM Job WHERE function="Clerk");
DELETE FROM Employee WHERE department_id=(SELECT department_id FROM Department WHERE name="Accounting");
SELECT first_name,salary FROM Employee ORDER BY salary DESC LIMIT 1,1;



-- Sub-Query operators: (ALL,ANY,SOME,EXISTS)
Select first_name  from Employee where salary > all (Select salary from Employee where department_id=30);
Select first_name  from Employee where salary > any (Select salary from Employee where department_id=30);
Select name from Department d where not exists (select  * from Employee e where d.department_id=e.department_id);


-- Joins

-- Simple Join
SELECT first_name,Department.name FROM Employee,Department WHERE Employee.department_id=Department.department_id;
SELECT first_name,Job.function FROM Employee,Job WHERE Employee.job_id=Job.job_id;
SELECT first_name,Department.name,Location.regional_group FROM Employee,Department,Location WHERE Employee.department_id=Department.department_id AND Department.location_id=Location.location_id;
SELECT Department.name,count(*) FROM Employee,Department WHERE Employee.department_id=Department.department_id GROUP BY Department.name;
SELECT Department.name,count(*) FROM Employee,Department WHERE Employee.department_id=Department.department_id AND Department.name="Sales";
SELECT Department.name,count(*) AS Total FROM Employee,Department WHERE Employee.department_id=Department.department_id GROUP BY Department.name HAVING Total>=5 ORDER BY Department.name ASC;
SELECT Count(DISTINCT Employee.job_id) FROM Employee,Job WHERE Employee.job_id=Job.job_id AND Job.function IS NOT NULL; 
SELECT count(*) FROM Employee,Department,Location WHERE Employee.department_id=Department.department_id AND Department.location_id=Location.location_id AND Location.location_id="New York";

-- SET Operators
SELECT DISTINCT Department.name,Job.function FROM Job,Employee,Department WHERE Employee.department_id=Department.department_id AND Employee.job_id=Job.job_id AND Department.name  IN("Sales","Accounting");
SELECT Department.name,Job.function FROM Job,Employee,Department WHERE Employee.department_id=Department.department_id AND Employee.job_id=Job.job_id AND Department.name  IN("Sales","Accounting");
SELECT d.name,j.function FROM Job j,Employee e,Department d WHERE e.department_id=d.department_id AND e.job_id=j.job_id AND d.name  IN("Research","Accounting") ORDER BY j.function ASC;










































































