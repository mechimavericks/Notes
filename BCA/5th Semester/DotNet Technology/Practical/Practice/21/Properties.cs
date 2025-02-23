using System;
class Child{
    private int x;
    public int data{
        set{x=value;}
        get{return x;}
    }
}
class Properties{
    static void Main(){
        Child obj = new Child();
        obj.data=10;
        Console.WriteLine($"Value of X : {obj.data}");
    }
}