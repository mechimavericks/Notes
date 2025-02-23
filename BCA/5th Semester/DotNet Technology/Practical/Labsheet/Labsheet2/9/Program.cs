// Write a program to demonstrate properties.

using System;
class Person{
    private string name;
    public string Name{
        get{
            return name;
        }
        set{
            name = value;
        }
    }
}
class  Program{
    static void Main(){
        Person p = new Person();
        p.Name = "John";
        Console.WriteLine("Name of the Person : " + p.Name);
    }
}