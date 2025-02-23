-- Labsheet5
CREATE DATABASE BANK;
USE BANK;
CREATE TABLE Employee(
	emp_no varchar(10) PRIMARY KEY,
	emp_name varchar(25),
	salary decimal(10,2),
	dep_no varchar(10),
	job_id varchar(10),
	FOREIGN KEY(dep_no) REFERENCES Department(dept_no),
	FOREIGN KEY(job_id) REFERENCES Job(job_id)
);
CREATE TABLE Department(
	dept_no varchar(10) PRIMARY KEY,
	dept_name varchar(25),
	location varchar(25)
);
CREATE TABLE Job(
	job_id varchar(10) PRIMARY KEY,
	title varchar(25),
	duration int
);


INSERT INTO Job values("J440","Worker",8),
("J441","Operator",8),
("J442","Supervisor",10),
("J443","Programmer",8),
("J444","Designer",8);


INSERT INTO Department values("A201","Marketing","First-floor"),
("B203","Finance","First-floor"),
("A202","Sales","Second-floor"),
("B204","Purchase","Third-floor");

INSERT INTO Employee VALUES("E101","Ayush",50000,"A201","J444"),
("E102","Bikash",75000,"A202","J441"),
("E103","Kiran",90000,"B203","J442"),
("E104","Maya",55000,"A201","J443"),
("E105","Nitesh",75000,"B204","J441"),
("E106","Manoj",50000,"A202","J444"),
("E107","Ayesha",55000,"B203","J443");

INSERT INTO Employee(emp_no,emp_name,salary) VALUES("E108","Uttam",90000),
("E109","Krishna",50000);

INSERT INTO Department(dept_no,dept_name) values("C205","Management"),
("C206","Training");

SELECT emp_name,salary FROM Employee WHERE salary>10000 AND salary<15000;
SELECT emp_name FROM Employee,Department WHERE Employee.dep_no=Department.dept_no AND Department.dept_name="Marketing";
SELECT emp_name,salary FROM Employee WHERE salary>10000 ORDER BY Salary ASC;



-- Labsheet6
SELECT emp_name,salary FROM Employee WHERE salary=(select MAX(salary) from Employee);
SELECT emp_no, emp_name,salary FROM Employee WHERE salary=(select MIN(salary) from Employee);
SELECT COUNT(emp_no) FROM Employee WHERE job_id IS NOT NULL;
SELECt SUM(salary) as Total_Expenses from Employee;
SELECt AVG(salary) from Employee;
SELECt AVG(salary) from Employee WHERE dep_no="A201";
SELECt AVG(salary) from Employee WHERE job_id="J441" ;
SELECt count(*) from Employee,Department WHERE Employee.dep_no=Department.dept_no AND Department.dept_no="B203";
SELECT dep_no,MAX(salary),AVG(salary),MIN(salary) FROM Employee GROUP BY dep_no;




-- Labsheet7
SELECT emp_name FROM Employee,Department WHERE Employee.dep_no=Department.dept_no AND Department.dept_name="Sales";
SELECT emp_name FROM Employee,Department WHERE Employee.dep_no=Department.dept_no AND Department.dept_name="Purchase" AND salary>15000;
SELECT emp_name,salary,dep_no FROM Employee,Job WHERE Employee.job_id=Job.job_id AND Job.title="Supervisor";
SELECT emp_name,salary,location FROM Employee,Department WHERE Employee.dep_no=Department.dept_no AND Department.dept_name="purchase";
SELECT emp_name,salary,location FROM Employee,Department,Job WHERE Employee.dep_no=Department.dept_no AND Employee.job_id=Job.job_id AND Department.dept_name="purchase" AND Job.title="Operator";
SELECT dep_no,COUNT(*) FROM Employee GROUP BY dep_no;





