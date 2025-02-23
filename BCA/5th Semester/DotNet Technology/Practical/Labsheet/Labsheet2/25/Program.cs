// Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and a square.

using System;
class Rectangle{
    int length, breadth;
    public Rectangle(int l, int b){
        length = l;
        breadth = b;
    }
    public void Area(){
        Console.WriteLine("Area: " + (length * breadth));
    }
    public void Perimeter(){
        Console.WriteLine("Perimeter: " + (2 * (length + breadth)));
    }
}
class Square : Rectangle{
    public Square(int s) : base(s, s){
    }
}
class Program{
    static void Main(){
        Rectangle r = new Rectangle(5, 10);
        r.Area();
        r.Perimeter();
        Square s = new Square(5);
        s.Area();
        s.Perimeter();
    }
}