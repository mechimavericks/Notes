using System;
class ReturnStatement{
    static void Test(){
        Console.WriteLine("Hello");
        Console.WriteLine("Hello");
        return;
        Console.WriteLine("Hello");
        
    }
    static void Main(){
        Test();
    }
}