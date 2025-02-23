// Write a C# program to show the usage of abstract class and methods.
using System;
abstract class Shape{
    public abstract void Draw();
}
class Rectangle : Shape{
    public override void Draw(){
        Console.WriteLine("Drawing Rectangle");
    }
}
class Program{
    static void Main(){
        Rectangle r = new Rectangle();
        r.Draw();
    }
}