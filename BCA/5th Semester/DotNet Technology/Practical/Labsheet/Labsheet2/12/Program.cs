// Write a C# program to show the usage of sealed class.
using System;
sealed class A{
    public void Show(){
        Console.WriteLine("Show method of class A");
    }
}
class B : A{
    // Error: 'B': cannot derive from sealed type 'A'
}
class Program{
    static void Main(){
        A a = new A();
        a.Show();
    }
}