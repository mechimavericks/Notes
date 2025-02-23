// Write a C# program to calculate factorial of a number using value type.
using System;
class Factorial{
    static void Main(){
        Console.Write("Enter a Number: ");
        int n = Convert.ToInt32(Console.ReadLine());
        int fact=1;
        for(int i=1;i<=n;i++)
            fact*=i;
        Console.WriteLine("Factorial of {0} is {1}",n,fact);
    }
}