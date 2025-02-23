CREATE database Students_Info;
USE Students_Info;
CREATE TABLE Student(SNO int, Sname varchar(50),Saddress varchar(50),sage int);
ALTER TABLE Student ADD SDOB DATE;
ALTER TABLE Student DROP COLUMN Sage;
ALTER TABLE Student CHANGE SNO student_id int;
ALTER TABLE Student MODIFY student_id varchar(20);
ALTER TABLE Student RENAME TO KCC_Students