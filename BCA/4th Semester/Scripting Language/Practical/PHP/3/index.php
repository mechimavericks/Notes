<?php
class Car{
    private $make,$model;
    function __get($name){
        return $this->$name;
    }
    function __set($name,$value){
        $this->$name=$value;
        $this->$mode=$modval;
    }
}
$car = new Car();
$car->make= "BMW";
echo "Car Mode = ".$car->make;
?>