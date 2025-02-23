using System;
class Delegates2{
    delegate void MyDel(int x, int y);
    static void Sum(int x, int y ){
        Console.WriteLine("Sum : {0}",(x+y));
    }
    static void Diff(int x, int y){
        Console.WriteLine("Sum : {0}",(x+y));
    }
    static void Main(){
        MyDel del = new MyDel(Sum);
        del+=Diff;
        del(30,10);
    }
}