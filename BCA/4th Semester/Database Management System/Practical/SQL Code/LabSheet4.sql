CREATE DATABASE lab4;
USE lab4;
CREATE TABLE College(
	s_id int, 
	s_name varchar(25),
	s_address varchar(25),
	age int,
	phone int
);
INSERT INTO College values(1,"Ram","Kathmandu",21,5562236),
(2,"Hari","Pokhara",25,5465222),
(3,"Sita","Pokhara",23,4635544),
(4,"Ramhari","Bhairawa",25,4566855),
(5,"Rameshwor","Bhutwal",19,6542534),
(6,"Harka","Kathmandu",31,5302530),
(7,"Sitaram","Pokhara",28,5554560);


SELECT s_name,s_address,phone from College Where s_name LIKE "R%";
SELECT s_id, s_name from College Where s_name LIKE "_a%";
SELECT s_name,phone from College Where s_name LIKE "%m";
SELECT s_name,s_address from College Where s_name LIKE "_a%r_";
SELECT s_name from College WHERE  LENGTH(s_name)=4;  
SELECT * FROM College WHERE s_name LIKE "H___";
SELECT * FROM College WHERE s_name LIKE "H___" OR s_name LIKE "S___";
SELECT * FROM College WHERE s_name LIKE "S__A";
SELECT s_name, s_address, age FROM College WHERE s_address="Kathmandu" AND age>=20;
SELECT * FROM College ORDER BY age desc;
SELECT s_id,s_name,age,s_address FROM College ORDER BY age;
SELECT * FROM College ORDER BY s_name DESC;
SELECT DISTINCT s_address FROM College;

















