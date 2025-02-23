// Write programs to demonstrate all types of inheritance.
using System;
class A{
    public void Display(){
        Console.WriteLine("Class A");
    }
}
class B : A{
    public void Show(){
        Console.WriteLine("Class B");
    }
}
class Program{
    static void Main(){
        B b = new B();
        b.Display();
        b.Show();
    }
}