<!-- Create an abstract class called ‘Fmachine’ having methods getdata() and putdata(). Derive a class ‘Airplane’ having instance variables code, name, capacity and methods getdata() and pudata() (that overrides Fmachine’s getdata() and putdata()) to read and display the result. Create some instances of Airplane and call the required methods -->
<?php
abstract class Fmachine{
    function getdata(){}
    function putdata($code,$name,$capacity){}
}
class Airplane extends Fmachine{
    private $code,$name,$capacity;
    function getdata(){
        echo "<br/>Code: ".$this->code."<br/>Name: ".$this->name."<br/>Capacity: ".$this->capacity;
    }
    function putdata($code,$name,$capacity){
        $this->code=$code;
        $this->name=$name;
        $this->capacity=$capacity;
    }
}
$a = new Airplane();
$b = new Airplane();
$a->putdata("AK2584","Buddha Air 101",500);
$b->putdata("GT3510","Buddha Air 103",250);
$a->getdata();
$b->getdata();
?>