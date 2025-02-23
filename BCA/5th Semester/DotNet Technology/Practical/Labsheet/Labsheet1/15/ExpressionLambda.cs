// Write a C# program to demonstrate expression lambda.
using System;
class ExpressionLambda{
    static int Sum(int x, int y)=>x+y;
    static void Main(){
        Console.WriteLine("Sum of 10 and 20 is {0}.",Sum(10,20));
    }
}