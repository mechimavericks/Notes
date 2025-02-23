// Write a C# program to demonstrate method overloading.
using System;
class A{
    public void Show(int a){
        Console.WriteLine("Show method with one argument : " + a);
    }
    public void Show(int a, int b){
        Console.WriteLine("Show method with two arguments : " + a + " " + b);
    }
}
class Program{
    static void Main(){
        A a = new A();
        a.Show(10);
        a.Show(10, 20);
    }
}