<?php
//MultiLevel Inheritance
class A{
    function A(){
        echo "Class A<br/>";
    }
}
class B extends A{
    function B(){
        echo "Class B<br/>";
    }
}
class C extends B{
    function C(){
        echo "Class C<br/>";
    }
}
$c = new C();
$c->A();
$c->B();
$c->C();
?>