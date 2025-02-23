<!-- Create an interface Shape with has methods get_data() and display_area(). Create two classes Rectangle and Square which implements this interface. Define the instance variables of these classes as per requirement in class itself. Create some instance of Rectangle and Square classes and demonstrate interface implementation by classes. -->
<?php
interface Shape{
    function get_data();
    function display_area();
}
class Rectangle implements Shape{
    private $length,$breadth;
    function __construct($l,$b){
        $this->length=$l;
        $this->breadth=$b;
    }
    function get_data(){
        return ("Length: ".$this->length."<br/>Breadth: ".$this->breadth);
    }
    function display_area(){
        echo "<br/>Area: ".($this->length*$this->breadth);
    }
}
class Square implements Shape{
    private $length;
    function __construct($l){
        $this->length=$l;
    }
    function get_data(){
        return ("<br/>Length: ".$this->length);
    }
    function display_area(){
        echo "<br/>Area: ".($this->length*$this->length);
    }
}
$r=new Rectangle(10,6);
echo $r->get_data();
$r->display_area();
$s=new Square(10);
echo $s->get_data();
$s->display_area();
?>