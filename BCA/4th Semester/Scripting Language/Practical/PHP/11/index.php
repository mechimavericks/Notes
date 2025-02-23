<?php
//Multiple Inheritance
interface A{
    function HelloA();
}
interface B{
    function HelloB();
}
// class B{
    // function HelloB(){
    //     echo "<br/>Hello By B";
// }
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