// Write a program to calculate area and perimeter of rectangle using interface.
using System;
interface IRectangle{
    int Area(int length, int breadth);
    int Perimeter(int length, int breadth);
}
class Rectangle : IRectangle{
    public int Area(int length, int breadth){
        return length * breadth;
    }
    public int Perimeter(int length, int breadth){
        return 2 * (length + breadth);
    }
}
class Program{
    static void Main(){
        Rectangle r = new Rectangle();
        Console.WriteLine("Area : " + r.Area(10, 20));
        Console.WriteLine("Perimeter : " + r.Perimeter(10, 20));
    }
}