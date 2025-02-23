<?php
//Multiple Inheritance using Interface
interface A{
    function HelloA();
}
interface B{
    function HelloB();
}
class C implements A,B{
    function HelloA(){
            echo "<br/>Hello By A";
    }
    function HelloB(){
        echo "<br/>Hello By B";
    }
    function HelloC(){
        echo "<br/>Hello By C";
    }
}
$c = new C();
$c->HelloA();
$c->HelloB();
$c->HelloC();



?>