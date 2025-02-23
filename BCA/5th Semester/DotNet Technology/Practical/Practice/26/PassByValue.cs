using System;
class PassByValue{
    static int Sum(int a, int b){
        return a+b;
    }
    public static void Main(){
        int a=10,b=20,value;
        value = Sum(a,b);
        Console.WriteLine("Sum =  {0}",value);
    }
}