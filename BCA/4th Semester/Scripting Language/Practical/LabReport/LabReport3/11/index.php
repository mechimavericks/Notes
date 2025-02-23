<!-- Create a class hierarchy for a zoo. Define a base class Animal with data members for the name and age of an animal, and a method to make a sound. Create subclasses for different types of animals, such as Lion, Tiger, Giraffe, and Zebra, and override the makeSound() method for each subclass to make the appropriate sound. -->
<?php
class Animal{
    private $name,$age;
    function makeSound(){}
}
class Lion extends Animal{
    function makeSound(){
        echo "<br/>Lion Roars.";
    }
}
class Tiger extends Animal{
    function makeSound(){
        echo "<br/>Tiger Purr";
    }
}
class Dog extends Animal{
    function makeSound(){
        echo "<br/>Dog barks";
    }
}
class Giraffe extends Animal{
    function makeSound(){
        echo "<br/>Giraffe Hum";
    }    
}
$l=new Lion();
$t=new Tiger();
$d=new Dog();
$g=new Giraffe();
$l->makeSound();
$t->makeSound();
$d->makeSound();
$g->makeSound();
?>