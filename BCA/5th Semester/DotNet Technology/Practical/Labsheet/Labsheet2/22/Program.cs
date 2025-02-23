// Create a class Polygon with data members: dimension1 and dimension2 and a member function: ReadDimension () to read data members. Derive two classes Rectangle and Triangle from Polygon class with appropriate member function to calculate area of each rectangle and triangle .
using System;
class Polygon{
    protected double dimension1, dimension2;
    public void ReadDimension(){
        Console.WriteLine("Enter the first dimension");
        dimension1 = Convert.ToDouble(Console.ReadLine());
        Console.WriteLine("Enter the second dimension");
        dimension2 = Convert.ToDouble(Console.ReadLine());
    }
}
class Rectangle : Polygon{
    public void Area(){
        Console.WriteLine("Area of Rectangle is: " + (dimension1 * dimension2));
    }
}
class Triangle : Polygon{
    public void Area(){
        Console.WriteLine("Area of Triangle is: " + (0.5 * dimension1 * dimension2));
    }
}
class Program{
    static void Main(){
        Rectangle r = new Rectangle();
        r.ReadDimension();
        r.Area();
        Triangle t = new Triangle();
        t.ReadDimension();
        t.Area();
    }
}
