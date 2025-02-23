// Write a C# program to find sum and product of two numbers using delegate.
using System;
class DelegatesProgram{
    public delegate void Calculation(int x, int y);
    static void Sum(int a, int b){
        Console.WriteLine("Sum: {0}", a+b);
    }
    static void Product(int x, int y){
        Console.WriteLine("Product: {0}", x*y);
    }
    static void Main(){
        Calculation calc=new Calculation(Sum);
        calc+=Product; 
        calc(10, 30);
    }
}
