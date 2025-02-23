<?php
//Multiple Inheritance using Trait instead of Class.
Trait A{
    function helloA(){
        echo "Hello BY A<br/>";
    }
}
Trait B{
    function helloB(){
        echo "Hello By B<br/>";
    }
}
class Inherit{
    use A,B;
}
$i=new Inherit();
$i->helloA();
$i->helloB();
?>