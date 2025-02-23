<?php
//Single Inheritance
class Person{
    private $id,$name;
    function __construct($id,$name){
        $this->id=$id; 
        $this->name=$name; 
    }
    function getData(){
        echo "ID: ".$this->id."<br/>Name: ".$this->name;
    }
}
class Student extends Person{
    private $level;
    function __construct($i,$n,$l){
        $this->level=$l;
        Person::__construct($i,$n);
    }
    function getData(){
        Person::getData();
        echo "<br/>Level: ".$this->level;
    }
}
$s=new Student(1,"Santosh Bhandari","Bachelor");
$s->getdata();





?>