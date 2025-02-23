// Write a C# program to calculate factorial of a number using delegate.
using System;
class FactorialDelegates{
    delegate void Factorial(int n);
    static void FactorialCalc(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
            fact*=i;
        Console.WriteLine("Facorial of {0} is {1}", n, fact);
    }
    static void Main(){
        Factorial fact=new Factorial(FactorialCalc);
        fact(5);

    }
}