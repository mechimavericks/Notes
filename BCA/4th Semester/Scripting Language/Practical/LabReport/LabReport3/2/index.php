<!-- Create a class named ‘Member’ having the following data members like name, age, phone,address, salary. It also has a method named ‘setMemberDetails’ which initialized all data members and another method ‘printMemberDetails’ which displays the member details. Second classes ‘Employee’ and ‘Manager’ inherit the ‘Member’ class. The ‘Employee’ and ‘Manager’ classes have data members ‘specialization’ and ‘printSpecialization’ and ‘Manager’ class contains a method named ‘setDepartment’ and ‘printDepartment’. Provide a main class and create objects of ’Employee’ and ‘Manager’, set the details and print them. -->
<?php
class Member{
    private $name,$age,$phone,$address,$salary;
    function setMemberDetails($n,$ag,$ph,$ad,$sal){
        $this->name=$n;
        $this->age=$ag;
        $this->phone=$ph;
        $this->address=$ad;
        $this->salary=$sal;
    }
    function printMemberDetails(){
        echo "<br/>Name: ".$this->name."<br/>Age: ".$this->age."<br/>Phone: ".$this->phone."<br/>Address: ".$this->address."<br/> Salary: ".$this->salary;
    }
}
class Employee extends Member{
    private $specialization="Data Science";
    function printSpecialization(){
        echo "<br/>Specialization: ".$this->specialization;
    }
}
class Manager extends Member{
    private $specialization="Resource Management",$department;
    function printSpecialization(){
        echo "<br/>Specialization: ".$this->specialization;
    }
    function setDepartment($dep){
        $this->department=$dep;
    }
    function printDepartment(){
        echo "<br/>Department: ".$this->department;
    }
}
$e = new Employee();
$e->setMemberDetails("Shyam",25,980000000,"Jhapa",250000);
$e->printMemberDetails();
$e->printSpecialization();
$m=new Manager();
$m->setMemberDetails("Hari",23,980607212,"Birtamode",500000);
$m->printMemberDetails();
$m->printSpecialization();
$m->setDepartment("IT");
$m->printDepartment();
?>