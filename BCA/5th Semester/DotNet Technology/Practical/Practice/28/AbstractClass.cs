using System;
public abstract class A{
    public abstract void Message();
}
class AbstractClass:A{
    public override void Message(){
        Console.WriteLine("Abstract Class");
    }
    public static void Main(){
        AbstractClass obj =new AbstractClass();
        obj.Message();
    }
}