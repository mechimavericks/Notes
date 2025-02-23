// Write a C# program to illustrate different parameters like ref, out, params, optional, etc.
using System;
class DifferentParameters{
    static void Reference(ref int a){
        Console.WriteLine("By Reference : {0}",a);
    }
    static void OutPara(int a, int b,out int sum){
        sum = a + b;
    }
    static void Params(params int[] a){
        Console.Write("Params : ");
        foreach(int i in a){
            Console.Write("\t"+i);
        }
    }
    static void Optional(int a, int b = 10){
        Console.WriteLine("\nSum : {0}",a+b);
    }
    static void Main(){
        int a = 10,sum=0;
        Reference(ref a);
        OutPara(10,20,out sum);
        Console.WriteLine("Sum : {0}",sum);
        Params(1,2,3,4,5);
        Optional(10);
    }
}