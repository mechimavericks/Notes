<?php
//Learning OOP
class Person{
    private $name;
    public function setName($name){
        $this->name=$name;
    }
    public function getName(){
        return $this->name;
    }
}
$per = new Person();
$per->setName("Santosh Bhandari");
echo "Name: ".$per->getName();
?>