using System;
class Switch{
    static void Main(){
        Console.WriteLine("Enter Two Number: ");
        int a=Convert.ToInt32(Console.ReadLine());
        int b=Convert.ToInt32(Console.ReadLine());
        failedOperator: 
        Console.Write("Enter a Operator: ");
        char op=Convert.ToChar(Console.ReadLine());
        switch(op){
            case '+':
                Console.WriteLine("Sum : {0}",(a+b));
                break;
            case '-': 
                Console.WriteLine("Difference : {0}",(a-b));
                break;
            case '*': 
                Console.WriteLine("Multiplication : {0}",(a*b));
                break;
            case '/': 
                Console.WriteLine("Division : {0}",(a/b));
                break;
            default:
                Console.WriteLine("Invalid Operator.");
                goto failedOperator;

        }
    }
}