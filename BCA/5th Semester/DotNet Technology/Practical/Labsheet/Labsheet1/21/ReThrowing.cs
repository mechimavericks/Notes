// Write a C# program for rethrowing of exception. 
using System;
class ReThrowing{
    static void Main(){
        Console.Write("Enter a number: ");
        int num = int.Parse(Console.ReadLine());
        try{
            if(num < 0)
                throw new Exception("Number is negative.");
            else
                Console.WriteLine("Number is positive.");
        }catch(Exception e){
            Console.WriteLine(e.Message);
            throw;
        }
    }
}