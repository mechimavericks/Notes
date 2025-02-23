using System;
class Hello{
    public virtual string Welcome(){
        return "Welcome,";
    }
}
class HelloWorld:Hello{
    public override string Welcome(){
        return "Welcome, Santosh Bhandari";
    }

    static void Main(){
        HelloWorld obj = new HelloWorld();
        Hello obj1 = new Hello();
        
        Console.WriteLine("{0} Hello World",obj1.Welcome());
        Console.WriteLine(obj.Welcome());
        
    }
}