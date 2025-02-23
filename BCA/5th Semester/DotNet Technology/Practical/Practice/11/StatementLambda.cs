using System;
class StatementLambda{
    public delegate void MyDel(int x, int y);    
    static void Main(){
        MyDel del =(x,y)=>{
            Console.WriteLine("Sum : {0}",(x+y));
            Console.WriteLine("Difference : {0}",(x-y));
        };
        del(10,20);
    }
}