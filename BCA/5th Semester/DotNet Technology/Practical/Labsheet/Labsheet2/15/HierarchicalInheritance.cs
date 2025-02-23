// Write programs to demonstrate all types of inheritance.(Hierarchical Inheritance)
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
class C : A{
    public void Print(){
        Console.WriteLine("Class C");
    }
}
class Program{
    static void Main(){
        B b = new B();
        C c = new C();
        b.Display();
        b.Show();
        c.Display();
        c.Print();
    }
}