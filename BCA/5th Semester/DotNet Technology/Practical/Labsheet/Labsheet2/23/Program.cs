// Create a class Polygon with data members to represent two dimensions and parameterized constructor to initialize data members. Derive two classes Rectangle and Triangle from Polygon class with appropriate member function to calculate area of each rectangle and triangle.

using System;
class Polygon{
    protected int length,breadth;
    public Polygon(int l, int b){
        length = l;
        breadth = b;
    }
}
class Rectangle : Polygon{
    public Rectangle(int l, int b) : base(l, b){
        Console.WriteLine("Area of Rectangle is: " + (length * breadth));
    }
}
class Triangle : Polygon{
    public Triangle(int l, int b) : base(l, b){
        Console.WriteLine("Area of Triangle is: " + (0.5 * length * breadth));
    }
}
class Program{
    static void Main(){
        Rectangle r = new Rectangle(5, 10);
        Triangle t = new Triangle(5, 10);
    }
}