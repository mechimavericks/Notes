// Write a program to demonstrate static constructor. 
using System;
class Person{
    public static string Name;
    static Person(){
        Name = "John";
    }
}
class Program{
    static void Main(){
        Console.WriteLine("Name of the Person : " + Person.Name);
    }
}

