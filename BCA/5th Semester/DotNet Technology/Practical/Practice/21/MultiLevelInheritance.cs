using System;
class A{
    public void Display1(){
        Console.WriteLine("Class A");
    }
}
class B:A{
    public void Display2(){
        Console.WriteLine("Class B");
    }
}
class C:B{
    public void Display3(){
        Console.WriteLine("Class C");
    }
}
class D:C{
    public void Display4(){
        Console.WriteLine("Class D");
    }
}
class MultiLevelInheritance{
    static void Main(){
        D obj = new D();
        obj.Display1();
        obj.Display2();
        obj.Display3();
        obj.Display4();
    }
}