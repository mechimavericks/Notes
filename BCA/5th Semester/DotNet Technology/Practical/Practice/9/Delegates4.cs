using System;
delegate void Calc(int n);
class Factorial{
    int f=1,i=1;
    public void Fact(int n){
        while(i<=n){
            f*=i;
            i++;
        }
        Console.WriteLine($"Factorial of {n} is {f}.");
    }
}
class Delegates4{
    static void Main(){
        Factorial obj = new Factorial();
        // obj.Fact(5);
        Calc del = new Calc(obj.Fact);
        del(5);
    }
}