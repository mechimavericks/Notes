using System;
class SumOfTwoNumbers{
    static void Main(){
        Console.WriteLine("Enter Two Numebers: ");
        int a=Convert.ToInt32(Console.ReadLine());
        int b=Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("Sum of {0} and {1} is {2}.",a,b,(a+b));
    }
}