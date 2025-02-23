// Write a C# program to check whether a number is odd or even using function delegate. 
using System;
class FunctionDelegates{

    static string CheckOddEven(int n){
        if(n%2==0)
            return "Even";
        else
            return "Odd";
    }
    static void Main(){
        Func<int,string> obj = new Func<int, string>(CheckOddEven);
        Console.WriteLine("5 is {0}", obj(5));
        Console.WriteLine("10 is {0}", obj(10));
    }
}