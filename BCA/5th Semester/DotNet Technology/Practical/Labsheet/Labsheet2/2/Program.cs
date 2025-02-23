// Write a program to define a class named Box which has data length, breadth and height and public functions ReadData() for reading data members and Volume() to calculate volume of box.
using System;
class Box{
    private int length,breadth,height;
    public void ReadData(int length,int breadth,int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    public void Volume(){
        Console.WriteLine($"Volume of Box : {length*breadth*height}");
    }
}
class Program{
    static void Main(){
        Box b = new Box();
        b.ReadData(10,20,30);
        b.Volume();
    }
}