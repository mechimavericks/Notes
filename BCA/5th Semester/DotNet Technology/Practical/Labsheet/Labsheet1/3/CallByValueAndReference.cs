// Write a C# program to illustrate call by value and call by reference.
using System;
class CallByValueAndReference{
    static void ByValue(int a){
        Console.WriteLine("By Value : {0}",a);
        a=10;
    }
    static void ByReference(ref int a){
        Console.WriteLine("By Reference : {0}",a);
        a=10;
    }
    static void Main(){
        int a=5;
        ByValue(a);
        Console.WriteLine("After By Value : {0}",a);
        ByReference(ref a);
        Console.WriteLine("After By Reference : {0}",a);
    }
}