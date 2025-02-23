// Write a program to demonstrate struct.
using System;
struct Student{
    public int rollNo;
    public string name;
    public int age;
    public void Display(){
        Console.WriteLine("Roll No : " + rollNo);
        Console.WriteLine("Name : " + name);
        Console.WriteLine("Age : " + age);
    }
}
class Program{
    static void Main(){
        Student s;
        s.rollNo = 101;
        s.name = "John";
        s.age = 20;
        s.Display();
    }
}