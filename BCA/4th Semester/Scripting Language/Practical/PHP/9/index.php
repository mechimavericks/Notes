<?php
//Single Inheritance
class Parents{
    function HelloParent(){
        echo "Hello I am Parent.<br/>";
    }
}
class Child extends Parents{
    function HelloChild(){
        echo "Hello I am Child";
    }
}
$c=new Child();
$c->HelloParent();
$c->HelloChild();



?>