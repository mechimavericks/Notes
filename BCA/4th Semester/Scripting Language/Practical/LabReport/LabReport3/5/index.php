<!-- Make an interface named num with two methods int add(int x, int y) and int diff(int x, int y) then make a class that implements that interface num. -->
<?php
interface num{
    function add($x,$y);
    function diff($x, $y);
}
class Calc implements num{
    function add($x,$y){
        echo "Addition: ".($x+$y);
    }
    function diff($x,$y){
        echo "<br/>Difference: ".($x-$y);
    }
}
$c = new Calc();
$c->add(15,10);
$c->diff(15,10);
?>