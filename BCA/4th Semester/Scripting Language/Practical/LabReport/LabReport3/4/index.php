<!-- Make a class “Rectangle” with attributes length and breadth. The class contains methods computeArea and displayArea. Write a program with main method that create two object of Rectangle class and find their areas and display area of larger rectangle. -->
<?php
class Rectangle{
    private $length,$breadth;
    function computeArea($length,$breadth){
        $this->length=$length;
        $this->breadth=$breadth;
        return $length*$breadth;
    }
    function displayArea(){
        echo "<br/>Area: ".($this->length*$this->breadth);
    }
}
function main(){
    echo "Hello";
    $a = new Rectangle();
    $b = new Rectangle();
    if($a->computeArea(50,100)>$b->computeArea(50,120))
        $a->displayArea();
    else    
        $b->displayArea();
}
main();
?>
