using System;
class Delegates3{
    delegate int Calc(int x, int y);
    int Sum(int x, int y){
        return x+y;
    }
    static void Main(){
        Delegates3 obj = new Delegates3();
        Calc del = new Calc(obj.Sum);
        Console.WriteLine($"Sum = {del(20,10)}");
    }
}