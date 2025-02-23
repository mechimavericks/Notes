// Create a class named 'Shape' with a method to print "This is This is shape". Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print "This is rectangular shape" and "This is circular shape" respectively. Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.
using System;
class Shape{
    public void Print(){
        Console.WriteLine("This is shape");
    }
}
class Rectangle : Shape{
    public void Print(){
        Console.WriteLine("This is rectangular shape");
    }
}
class Circle : Shape{
    public void Print(){
        Console.WriteLine("This is circular shape");
    }
}
class Square : Rectangle{
    public void Print(){
        Console.WriteLine("Square is a rectangle");
    }
}
class Program{
    static void Main(){
        Square s = new Square();
        s.Print();
        ((Rectangle)s).Print();
        ((Shape)s).Print();
    }
}