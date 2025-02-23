<?php
// Method Overriding
class A{
    function Greet(){
        echo "Hello<br/>";
    }
}
class B extends A{
    function Greet(){
        echo "Hey";
    }
}
$a=new A();
$a->Greet();
$b=new B();
$b->Greet();

?>