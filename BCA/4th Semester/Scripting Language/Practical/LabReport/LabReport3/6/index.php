<!-- Create an interface called calculate which has method int add(int x, int y) and perform addition and subtraction of numbers passed as argument. Then define a class that implements interface calculate. -->
<?php
interface Calculate{
    function add($x,$y);
}
class Calc implements Calculate{
    function add($x,$y){
        echo "Addition: ".($x+$y);
        echo "<br/>Subtraction: ".($x-$y);
    }
}
$c = new Calc();
$c->add(20,15);
?>