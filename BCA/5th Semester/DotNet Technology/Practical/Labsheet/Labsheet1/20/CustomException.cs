// Write a C# program to input two numbers. If both numbers are equal then throw your own custom exception. Otherwise calculate sum of two numbers.
using System;
class EqualException:Exception{
    public EqualException(string msg):base(msg){}
}
class CustomException{
    static void Main(){
        Console.Write("Enter first number: ");
        int num1 = int.Parse(Console.ReadLine());
        Console.Write("Enter second number: ");
        int num2 = int.Parse(Console.ReadLine());
        try{
            if(num1 == num2)
                throw new EqualException("Both numbers are equal.");
            else
                Console.WriteLine("Sum of {0} and {1} is {2}", num1, num2, num1+num2);
        }catch(EqualException e){
            Console.WriteLine(e.Message);
        }
    }
}