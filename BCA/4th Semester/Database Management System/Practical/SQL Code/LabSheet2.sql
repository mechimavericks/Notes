CREATE DATABASE lab2;
USE lab2;
CREATE TABLE Employee(
	eid int, 
	ename varchar(50),
	eaddress varchar(50),
	egender char(2),
	eage int,
	esalary decimal(10,2));
INSERT INTO Employee VALUES(1,"Niroj","Ktm","M",21,12000),
	(2,"Firoj","Pkh","M",22,5000),
	(3,"Suraj","Ktm","M",20,10500),
	(4,"Sujeena","Lpt","F",19,7500),
	(6,"Prerana","Pkh","F",18,13000),
	(8,"Samir","NPJ","M",23,8500),
	(9,"Samipa","Brt","F",22,6700);
INSERT INTO Employee(eid,ename,egender,eage,esalary) values(5,"Sandhya","F",20,19000),
	(7,"Subodh","M",23,9800),
	(10,"Uday","M",25,11300);
SELECT ename,eaddress FROM Employee;
SELECT ename,eaddress FROM Employee WHERE eaddress ="Ktm" AND esalary >7900;
DELETE FROM Employee WHERE eage<=20;
SELECT * from Employee WHERE eaddress="Ktm" AND (eage>22 OR esalary>10500);
SELECT * from Employee WHERE eaddress IS NULL;
ALTER TABLE Employee CHANGE eid EMP_ID int;
ALTER TABLE Employee MODIFY EMP_ID varchar(10);
UPDATE Employee set eage=eage+2 WHERE ename ="Suraj";
DELETE FROM Employee WHERE eaddress='Bkt' OR esalary >15000;
UPDATE Employee set esalary=esalary+esalary*0.07;
UPDATE Employee SET esalary= CASE 
	WHEN esalary >15000 THEN esalary+esalary*0.05
	ELSE esalary+esalary*0.1
	END;
SELECT * FROM Employee WHERE esalary BETWEEN 6999 AND 11998;
SELECT * FROM Employee WHERE eaddress!='Ktm';
UPDATE Employee set eaddress="NPJ" WHERE ename="Uday";













