// Write a program to calculate sum and product of two numbers using automatic property.

using System;
class Number{
    public int Number1{get; set;}
    public int Number2{get; set;}
    public int Sum{
        get{
            return Number1 + Number2;
        }
    }
    public int Product{
        get{
            return Number1 * Number2;
        }
    }
}
class Program{
    static void Main(){
        Number n = new Number();
        n.Number1 = 10;
        n.Number2 = 20;
        Console.WriteLine("Sum : " + n.Sum);
        Console.WriteLine("Product : " + n.Product);
    }
}