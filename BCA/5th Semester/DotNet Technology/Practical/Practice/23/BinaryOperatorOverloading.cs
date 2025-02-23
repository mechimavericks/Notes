// Binary Operator Overloading in C# 
using System;
class OperatorOverload{
    private int x,y;
    public OperatorOverload(){}
    public OperatorOverload(int x , int y){
        this.x=x;
        this.y=y;
    }
    public static OperatorOverload operator +(OperatorOverload a, OperatorOverload b){
        OperatorOverload temp = new OperatorOverload();
        temp.x=a.x+b.x;
        temp.y=a.y+b.y;
        return temp;
    }
    public void dispValue(){
        Console.WriteLine("X : {0}  Y : {1}",x,y);
    }
}
class BinaryOperatorOverloading{
    static void Main(){
        OperatorOverload obj1=new OperatorOverload(10,20);
        obj1.dispValue();
        OperatorOverload obj2=new OperatorOverload(5,10);
        obj2.dispValue();
        obj2 = obj1+obj2;
        obj2.dispValue();

    }
}