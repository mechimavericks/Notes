// Write a program to demonstrate indexers. 
using System;
class A{
    private string[] names = new string[5];
    public string this[int index]{
        get{
            return names[index];
        }
        set{
            names[index] = value;
        }
    }
}
class Program{
    static void Main(){
        A obj = new A();
        obj[0] = "Santosh";
        obj[1] = "Ramesh";
        obj[2] = "Mahesh";
        obj[3] = "Ganesh";
        obj[4] = "Rajesh";
        for(int i = 0; i < 5; i++){
            Console.WriteLine(obj[i]);
        }
    }
}