using System;
interface A{
    void DispA();
}
class B{
    public void DispB(){
        Console.WriteLine("Class B");
    }
}
class C:B,A{
    public void DispA(){
        Console.WriteLine("Class A");
    }
    public void DispC(){
        Console.WriteLine("Class C");
    }
}
class Multiple{
    static void Main(){
        C obj = new C();
        obj.DispA();
        obj.DispB();
        obj.DispC();
    }
}