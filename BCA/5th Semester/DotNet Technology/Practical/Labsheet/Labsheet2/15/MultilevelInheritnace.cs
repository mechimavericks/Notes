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
class C : B{
    public void Print(){
        Console.WriteLine("Class C");
    }
}
class Program{
    static void Main(){
        C c = new C();
        c.Display();
        c.Show();
        c.Print();
    }
}