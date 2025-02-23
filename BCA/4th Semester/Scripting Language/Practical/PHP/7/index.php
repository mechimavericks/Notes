<?php
interface Shape{
    public function getArea();
}
class Circle implements Shape{
    private $r;
    public function __construct($radius){
        $this->r=$radius;
    }
    function getArea(){
        echo "Area of Circle: ".(M_PI*pow($this->r,2));
    }
}
class Rectangle implements Shape{
    private $l,$b;
    function __construct($length,$breadth){
        $this->l=$length;
        $this->b=$breadth;
    }
    function getArea(){
        echo "<br/>Area of Rectangle: ".($this->l*$this->b);
    }
}
$c=new Circle(7);
$c->getArea();
$r=new Rectangle(5,6);
$r->getArea();
?>