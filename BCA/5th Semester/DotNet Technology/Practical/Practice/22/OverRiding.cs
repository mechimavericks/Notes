using System;
class A{
    public virtual void Display(){
        Console.WriteLine("Parent Class");
    }
}
class B : A{
    public override void Display(){
        base.Display();
        Console.WriteLine("Child Class ");
    }
}
class OverRiding{
    static void Main(){
        B objb =  new B();
        // A obja = new A();
        objb.Display();
    }
}