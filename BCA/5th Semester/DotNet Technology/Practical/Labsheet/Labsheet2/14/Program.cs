// Write a C# program to demonstrate method overriding using virtual method. 
using System;
class A{
    public virtual void Show(){
        Console.WriteLine("Show method of class A");
    }
}
class B : A{
    public override void Show(){
        Console.WriteLine("Show method of class B");
    }
}
class Program{
    static void Main(){
        B a = new B();
        a.Show();
    }
}