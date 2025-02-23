using System;
class IfElse{
    static void Main(){
        Console.WriteLine("Enter Your Age: ");
        int age=Convert.ToInt32(Console.ReadLine());
        if(age>17){
            Console.WriteLine("You are Eligible for Voting...");
        }else{
            Console.WriteLine("You are not Eligible for Voting...");
        }
    }
}