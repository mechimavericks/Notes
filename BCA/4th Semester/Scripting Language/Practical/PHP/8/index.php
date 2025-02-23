<?php
//Encapsulation
class Human{
    private $name,$age;
    function setData($n,$a){
        $this->name=$n;
        $this->age=$a;
    }   
    function getData(){
        echo "Name: ".$this->name."<br/>Age: ".$this->age;
    }
}
$h=new Human();
$h->setData("Santosh Bhandari",22);
$h->getData();
?>