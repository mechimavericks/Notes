// Write programs to demonstrate all types of inheritance. (Multiple Inheritance)
using System;
interface A{
    void Display();
}
class B{
    public void Show(){
        Console.WriteLine("Class B");
    }
}
class C : B, A{
    public void Print(){
        Console.WriteLine("Class C");
    }
    public void Display(){
        Console.WriteLine("Class A");
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