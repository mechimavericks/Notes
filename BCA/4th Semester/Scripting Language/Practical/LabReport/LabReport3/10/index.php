<!-- Create a class box with instance variables length, breath and height. Add one method getVolume() to compute the volume of box. Use suitable constructors. Create a subclass boxWeight that extends Box that add one variable weight. Add two methods setWeight() and getWeight() that sets and displays the weight of box to this class. Add sutable constructors. Your class should use upper keyword to call superclass constructor, then create a class BoxDemo with main() method that creates two objects of BoxWeight and display volumes and weight of box boxes. -->
<?php
class Box{
    private $length,$breadth,$height;
    function __construct($l,$b,$h){
        $this->length=$l;
        $this->breadth=$b;
        $this->height=$h;
    }
    function getVolume(){
        echo "<br/>Volume: ".($this->length*$this->breadth*$this->height);
    }
}
class boxWeight extends Box{
    private $weight;
    function __construct($l,$b,$h){
        Box::__construct($l,$b,$h);
    }
    function setWeight($w){        
        $this->weight=$w;
    }
    function getWeight(){
        echo "<br/>Weight: ".$this->weight;
    }
}
class BoxDemo{
    function main(){
        $b1= new boxWeight(10,15,20);
        $b2=new boxWeight(15,7,10);
        $b1->getVolume();
        $b1->setWeight(400);
        $b1->getWeight();
        $b2->getVolume();
        $b2->setWeight(800);
        $b2->getWeight();
    }
}
$b=new BoxDemo();
$b->main();

?>