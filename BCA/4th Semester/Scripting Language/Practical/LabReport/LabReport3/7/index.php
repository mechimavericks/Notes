<!-- Create a class student with instance variable roll_no and two methods to read and display the roll_no. then, create another class Test that inherits class student, consisting of its own instance variables to hold the marks of two subjects and also methods to read and display the marks. Finally, create another class Result which inherits class Test. It also has its own instance variable total to hold the total two marks scored by the student. Similarly, it has methods to calculate and display the total. Create some instances of above classes and demonstrate inheritance. -->
<?php 
class Student{
    private $roll_no;
    function read1($rno){
        $this->roll_no=$rno;
    }
    function display(){
        echo "Roll No.: ".$this->roll_no;
    }
}
class Test extends Student{
    public $sub1,$sub2;
    function read($sub1,$sub2){
        $this->sub1=$sub1;
        $this->sub2=$sub2;
    }
    function display(){
        Parent::display();
        echo "<br/>Subject 1 : ".$this->sub1."<br/>Subject 2: ".$this->sub2;
    }
}
class Result extends Test{
    private $total;
    function calculate(){
        $this->total=$this->sub1+$this->sub2;
    }
    function display(){
        Parent::display();
        echo "<br/>Total: ".$this->total;
    }
}
$r=new Result();
$r->read1(20);
$r->read(60,70);
$r->calculate();
$r->display();

?>



