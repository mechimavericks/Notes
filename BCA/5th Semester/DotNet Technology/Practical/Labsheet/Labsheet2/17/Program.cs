// Write a C# program to demonstrate the use of “base” keyword in inheritance. 
using System;
class A{
    public void Show(){
        Console.WriteLine("Class A");
    }
}
class B : A{
    public void Show(){
        base.Show();
        Console.WriteLine("Class B");
    }
}
class Program{
    static void Main(){
        B b = new B();
        b.Show();
    }
}