// Write a C# program to demonstrate exception handling using try, catch and finally block.
using System;
class ExceptionHandeling{
    static void Main(){
        int a=10,b=0;
        try{
            Console.WriteLine("Division of {0} and {1} is {2}.",a,b,a/b);
        }catch(Exception e){
            Console.WriteLine(e.Message);
        }finally{
            Console.WriteLine("Finally block is executed.");
        }
    }
}