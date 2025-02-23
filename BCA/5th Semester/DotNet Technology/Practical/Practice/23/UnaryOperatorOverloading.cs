// Example of Unary Operator Overloading Program
using System;
class operatoroverload{
    private int a,b;
    public operatoroverload(){ }
    public operatoroverload(int x, int y){
        a=x;
        b=y;
    }
    public void dispValue(){
        Console.WriteLine($"A : {a}, B : {b}");
    }
    public static operatoroverload operator -(operatoroverload obj){
        operatoroverload temp = new operatoroverload();
        temp.a=-obj.a;
        temp.b=-obj.b;
        return temp;
    }
}
class UnaryOperatorOverloading{
    public static void Main(){
        operatoroverload obj1=new operatoroverload(10,20);
        obj1.dispValue();
        operatoroverload obj2 = new operatoroverload();
        obj2.dispValue();
        obj2=-obj1;
        obj2.dispValue();
    }
}