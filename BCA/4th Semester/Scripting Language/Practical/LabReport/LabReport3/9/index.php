<!-- create a class Number with three integer instance variables x,y and z. the class will have one constructor to initialize instance variable. The class also will contain method getMax() method that will return the larger number. Create a class NumberDemo with main method that will create an object of Number and will print the largest number. -->
<?php
class Number{
   private $x,$y,$z;
   function __construct($x,$y,$z){
        $this->x=$x;
        $this->y=$y;
        $this->z=$z;
   }
   function getMax(){
    $a=$this->x > $this->y?$this->x:$this->y;
    $a=$a>$this->z?$a:$this->z;
    return $a;
   } 
}
class NumberDemo{
    function main(){
        $n = new Number(40,50,30);
        echo "Largest Number: ".$n->getMax();
    }
}
$n=new NumberDemo();
$n->main();
?>