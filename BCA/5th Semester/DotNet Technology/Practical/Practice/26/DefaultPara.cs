using System;
class PassByRef{
    static void Disp(string name="Santosh"){
        Console.WriteLine("Welcome {0}",name);
    }
    public static void Main(){
        Disp();
        Disp("Manoj");
    }
}