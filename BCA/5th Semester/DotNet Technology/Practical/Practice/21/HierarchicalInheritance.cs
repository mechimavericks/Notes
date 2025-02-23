using System;
class A{
    public void Display1(){
        Console.WriteLine("Class A");
    }
}
class B:A{
}
class C:A{
}
class D:A{
}
class HierarchicalInheritance{
    static void Main(){
        B obj = new B();
        obj.Display1();
        C obj1 = new C();
        obj1.Display1();
        D obj2 = new D();
        obj2.Display1();
    }
}