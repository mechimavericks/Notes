using System;
class A{
    public int a=10,b=20;
}
class B:A{

}
class SingleInheritance {
    static void Main(){
        B obj = new B();
        Console.WriteLine("Value of A : {0} and B : {1}",obj.a,obj.b);
    }
}