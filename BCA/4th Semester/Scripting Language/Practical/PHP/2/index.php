<?php
class Person{
    private $name;
    function __construct(){
        echo "Constructiong the Program<br/>";
    }
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