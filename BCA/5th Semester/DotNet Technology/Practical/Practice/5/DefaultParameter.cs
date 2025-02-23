using System;
class DefaultParameter{
    static void Test(int x=5){
        Console.WriteLine("Value of X : {0}",x);
    }
    static void Main(){
        int x=10;
        Test();
        Test(x);
    }
}