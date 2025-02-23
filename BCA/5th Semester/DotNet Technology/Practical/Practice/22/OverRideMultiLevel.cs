using System;
class A{
    public virtual void Message(){
        Console.WriteLine("Class A");
    }
}
class B:A{
    public override void Message(){
        base.Message();
        Console.WriteLine("Class B");
    }
}
class C:B{
    public override void Message(){
        base.Message();
        Console.WriteLine("Class C");
    }
}

class OverRideMultiLevel{
    static void Main(){
        C obj = new C();
        obj.Message();
    }
}