using System;
class MulticastingDelegates{
    static void Sum(int x, int y){
        Console.WriteLine("Sum : {0}",(x+y));
    }
    static void diff(int x, int y){
        Console.WriteLine("Difference : {0}",(x-y));
    }
    static void Mul(int x, int y){
        Console.WriteLine("Multiplication : {0}",(x*y));
    }
    static void Main(){
        Action<int,int> del = Sum;

        //Addng the function
        del+=diff;
        del+=Mul;
        del(20,10);

        //Removing the Function
        del-=Sum;
        del(20,10);
    }
}