using System;
class ActionDelegate{
    static void Sum(int x, int y){
        Console.WriteLine($"Sum of {x} and {y} is {(x+y)}");
    }
    static void Main(){
        Action<int,int> del = Sum;
        del(10,20);
    }
}