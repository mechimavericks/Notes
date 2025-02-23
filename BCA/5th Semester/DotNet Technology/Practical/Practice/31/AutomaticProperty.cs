using System;
class A{
    public int a{get;set;}
}
class AutomaticProperty{
    static void Main(){
        A obj= new A();
        obj.a=10;
        int b=10;
        Console.WriteLine("Value of a : {0}",obj.a);
    }
}