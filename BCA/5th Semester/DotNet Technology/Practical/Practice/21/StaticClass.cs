using System;
static class A{
    public static void Display(){
        Console.WriteLine("Testing Static Class");
    }
}
class StaticClass{
    static void Main(){
        A.Display();
    }
}