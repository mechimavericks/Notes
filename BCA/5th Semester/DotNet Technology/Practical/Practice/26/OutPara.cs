using System;
class OutPara{
    static void Sum(int a, int b, out int x){
        x=a+b;
    }
    public static void Main(){
        int a=10,b=20,c;
        Sum(a,b,out c);
        Console.WriteLine("Sum = {0}",c);
    }
}