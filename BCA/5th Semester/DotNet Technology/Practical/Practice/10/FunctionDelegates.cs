using System;
class FunctionDelegates{
    static int Add(int x, int y ){
        return (x+y);
    }
    static void Main(){
        Func<int,int,int> del = Add;
        Console.WriteLine("Sum: {0}",del(20,10));

    }
}