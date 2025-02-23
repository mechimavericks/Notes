// Define a class Rectangle with data members: length and breadth. Initialize its data members with some fixed values (i.e. say 100 and 200 for length and breadth respectively) using a constructor. Write a program to use an object of the class to calculate area of a rectangle.

using System;
class Rectangle{
    private int length,breadth;
    public Rectangle(){
        length = 100;
        breadth = 200;
    }
    public void Area(){
        Console.WriteLine($"Area of Rectangle : {this.length*this.breadth}");
    }
}
class Program{
    static void Main(){
        Rectangle r = new Rectangle();
        r.Area();
    }
}