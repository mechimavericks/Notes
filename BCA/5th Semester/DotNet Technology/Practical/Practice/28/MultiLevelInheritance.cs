using System;
class A{
    public virtual void MessageA(){
        Console.WriteLine("Class A");
    }
}
class B:A{
    public void MessageB(){
        Console.WriteLine("Class B");
    }
}
class C:B{
    public override void MessageA(){
        Console.WriteLine("Class C");
        base.MessageA();
    }
}
class MultiLevelInheritance{
    public static void Main(){
        C obj = new C();
        obj.MessageA();
        obj.MessageB();
    }
}