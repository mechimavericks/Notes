using System;
abstract class A{
    public abstract void Display();
}
class abstractclass : A{
    public override void Display(){
        Console.WriteLine("Abstract Class");
    }
    public static void Main(){
        abstractclass obj = new abstractclass();
        obj.Display();
    }
}