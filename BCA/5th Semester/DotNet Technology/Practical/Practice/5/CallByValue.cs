using System;
class CallByValue{
    static void Test(int x){
        x=x+5;
    }
    static void Main(){
        int x=10;
        Test(x);
        Console.WriteLine("Value of x : {0}",x);
    }
}