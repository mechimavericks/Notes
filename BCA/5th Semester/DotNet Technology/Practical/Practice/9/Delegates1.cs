using System;
class Delegates1{
    delegate void Msg();
    void Message1(){
        Console.WriteLine("Welcome to C#");
    }
    static void Message2(){
        Console.WriteLine("WELCOME TO C#");
    }
    static void Main(){
        Delegates1 obj= new Delegates1();
        Msg del = new Msg(obj.Message1);
        del=del+Message2;
        del();
    }
}