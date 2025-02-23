using System;
class CallByReference{
    static void Test(ref int x){
        x=x+5;
    }
    static void Main(){
        int x=10;
        Console.WriteLine("Value of x : {0}",x);
        Test(ref x);
        Console.WriteLine("Value of x : {0}",x);
    }
}