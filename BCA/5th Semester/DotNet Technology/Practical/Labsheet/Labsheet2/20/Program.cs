// Write a program to demonstrate enum. 
using System;
class Program{
    enum Days { Sun, Mon, Tue, Wed, Thu, Fri, Sat };
    static void Main(){
        int x = (int)Days.Sun;
        int y = (int)Days.Fri;
        Console.WriteLine("Sun = " + x);
        Console.WriteLine("Fri = " + y);
    }
}