using System;
class ExpressionLambda{
    static int Sum(int x , int y)=>x+y;
    static void Main(){
        int res = Sum(10,20);
        Console.WriteLine("Sum : {0}",res);
    }
}