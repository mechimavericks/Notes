using System;
class A{
    public void DispA(){
        Console.WriteLine("Class A");
    }
}
class B:A{
    public void DispB(){
        Console.WriteLine("Class B");
    }
}
class C:B{
    public void DispC(){
        Console.WriteLine("Class C");
    }
}
class MultiLevelInheritance{
    static void Main(){
        C obj = new C();
        obj.DispA();
        obj.DispB();
        obj.DispC();
    }
}