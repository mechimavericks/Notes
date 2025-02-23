using System;
class ValueType{
    static void Main(){
        int a=10;
        Console.WriteLine(a);
        Test(a);
        Console.WriteLine(a);
    }
    static void Test(int a){
        a+=10;
    }
}