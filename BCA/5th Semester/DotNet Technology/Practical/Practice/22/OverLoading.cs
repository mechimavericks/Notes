using System;
class A{
    public void Add(int x, int y){
        Console.WriteLine("Sum : {0}",(x+y));
    }
    public void Add(double x, double y){
        Console.WriteLine("Sum : {0}",(x+y));
    }
}
class OverLoading{
    public static void Main(){
        A obj = new A();
        obj.Add(10,20);
        obj.Add(10.2,20.2);
    }
}