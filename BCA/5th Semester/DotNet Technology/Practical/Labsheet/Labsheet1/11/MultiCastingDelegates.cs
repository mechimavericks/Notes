// Write a C# program to demonstrate multicasting of delegates.
using System;
class MultiCastingDelegates{
    delegate void MultiCast();
    static void Method1(){
        Console.WriteLine("Method 1");
    } 
    static void Method2(){
        Console.WriteLine("Method 2");
    }
    static void Method3(){
        Console.WriteLine("Method 3");
    }
    static void Main(){
        MultiCast obj = new MultiCast(Method1);
        obj += Method2;
        obj += Method3;
        obj();
    }
}