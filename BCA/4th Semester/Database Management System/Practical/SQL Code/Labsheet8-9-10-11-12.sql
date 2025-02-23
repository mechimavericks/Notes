-- Labsheet 8
CREATE DATABASE HOSPITAL;
use HOSPITAL;
CREATE TABLE Doctor(
	doc_id int primary key,
	doc_name varchar(25),
	speciality varchar(25),
	enroll_date date,
	experience int
);

CREATE TABLE Disease(
	des_id int primary key,
	des_name varchar(25),
	causes varchar(25),
	recovery_date int,
	doc_id int,
	foreign key(doc_id) references Doctor(doc_id)
);

CREATE TABLE Department(
	dept_id int primary key,
	dept_name varchar(25),
	location varchar(25),
	position varchar(25)
);

CREATE TABLE Hospital(
	doc_id int,
	salaary decimal(10,2),
	dept_id int,
	foreign key(doc_id) references Doctor(doc_id),
	foreign key(dept_id) references Department(dept_id)
);

CREATE TABLE Patient(
	p_id int,
	p_name varchar(25) NOT NULL,
	dob varchar(25) NOT NULL,
	address varchar(25),
	status varchar(25),
	doc_id int,
	des_id int,
	PRIMARY KEY(p_id),
	FOREIGN KEY(doc_id) REFERENCES Doctor(doc_id),
	FOREIGN KEY(des_id) REFERENCES Disease(des_id)	
);

INSERT INTO Patient VALUES(100,"Hari","2060","KTM","Normal",205,302),
(102,"Shyam","2050","BTM","ICU",201,305),
(103,"Siya","2057","BRT","Ventilator",204,303),
(104,"Madan","2040","LPT","Normal",203,304),
(105,"Basu","2035","PKH","ICU",202,301),
(106,"Manoj","2054","BTM","Normal",205,302),
(107,"Krishna","2052","KTM","Ventilator",203,303);

INSERT INTO Doctor values(201,"Fulmati","Heart","2075/10/3",10),
(202,"Ramesh","Liver","2071/1/3",12),
(203,"Harka Bhadur","Bone","2078/3/10",3),
(204,"Rasthana","Pregnancy","2075/10/3",10),
(205,"Priyaka","Eye","2075/10/3",10);

INSERT INTO Disease values(301,"Jaundice","Liver",10,202),
(302,"Birdflu","Eye",3,205),
(303,"Heart Attack","Heart",1,201),
(304,"Bone Break","Bone",5,203),
(305,"Birth","Birth",1,204);

INSERT INTO Department values(501,"Surgery","First Floor","First"),
(502,"Cardiology","First Floor","First"),
(503,"Radiology","First Floor","First"),
(504,"Ophthalmology","First Floor","First"),
(505,"Pregnancy","First Floor","First");

INSERT INTO Hospital values(201,125000,502),
(202,115000,501),
(203,100000,503),
(204,85000,505),
(205,75000,504);

INSERT INTO Doctor(doc_id,doc_name,speciality) values(206,"Hitesh","Brain"),
(207,"Rahul","Digestion");

INSERT INTO Department(dept_id,dept_name) values(506,"Account"),(507,"Medicine");


-- Labsheet 9
SELECT Doctor.doc_name,Hospital.salaary FROM Doctor,Hospital WHERE Doctor.doc_id=Hospital.doc_id AND Hospital.salaary=(SELECT MAX(Hospital.salaary) FROM Hospital);
SELECT count(DISTINCT doc_id) AS Totoal_Doctor FROM Patient;
SELECT Doctor.doc_name FROM Doctor,Department,Hospital WHERE Doctor.doc_id=Hospital.doc_id AND Hospital.dept_id = Department.dept_id AND Department.dept_name ="Surgery";
SELECT Doctor.doc_name,Hospital.salaary FROM Doctor,Hospital WHERE Doctor.doc_id=Hospital.doc_id AND Hospital.salaary=(SELECT MIN(Hospital.salaary) FROM Hospital);
SELECT DISTINCT Doctor.doc_name FROM Doctor,Patient,Disease WHERE Doctor.doc_id=Patient.doc_id AND Patient.des_id=Disease.des_id AND Disease.des_name="BirdFlu";
SELECT * FROM Patient;
SELECT causes,recovery_date FROM Disease WHERE des_name='Jaundice';
ALTER TABLE Department DROP COLUMN position;



-- LabSheet 10
UPDATE Hospital SET salaary=salaary+salaary*0.16;
UPDATE Hospital SET salaary=salaary-salaary*0.1 WHERE doc_id=(SELECT doc_id FROM Doctor WHERE doc_name="Fulmati");
UPDATE Hospital,Doctor SET salaary=salaary-salaary*0.1 WHERE Hospital.doc_id=Doctor.doc_id AND Doctor.doc_name LIKE "Ra%";
UPDATE Hospital SET salaary=CASE 
	WHEN salaary<100000 THEN salaary+50000
	ELSE salaary-75000
END;
SELECT doc_name FROM Doctor WHERE doc_name NOT IN(SELECT p_name FROM Patient);



-- LabSheet 11
SELECT Patient.p_name FROM Patient,Doctor WHERE Patient.doc_id = Doctor.doc_id AND Doctor.doc_name ="Rasthana" LIMIT 3;
SELECT doc_name FROM Doctor WHERE speciality="Heart" AND experience>=11 LIMIT 5;
-- Other Question Not Finished or completed



-- LahSheet 12
SELECT doc_name FROM Doctor,Department,Hospital WHERE Doctor.doc_id=Hospital.doc_id AND Department.dept_id=Hospital.dept_id AND Department.dept_name<>"Surgery";
SELECT doc_name FROM Doctor,Department,Hospital WHERE Doctor.doc_id=Hospital.doc_id AND Department.dept_id=Hospital.dept_id AND Department.dept_name<>"Surgery" LIMIT 3;
SELECT Doctor.doc_name FROM Doctor,Hospital WHERE Doctor.doc_id=Hospital.doc_id AND Doctor.doc_name NOT LIKE "%esh" AND Hospital.salaary>(SELECT AVG(salaary) FROM Hospital);
































