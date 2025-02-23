// Write a C# program to demonstrate statement lambda.
using System;
class StatementLambda{
    delegate void MyDel(int n);
    static void Main(){
        MyDel obj = (x)=>{
            if(x%2==0)
                Console.WriteLine($"{x} Even Number.");
            else
                Console.WriteLine($"{x} Odd Number.");
        };
        obj(5);
        obj(10);
    }
}