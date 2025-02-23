using System;
class IfElseIf{
    static void Main(){
        int num;
        Console.Write("Enter a Number: ");
        num=Convert.ToInt32(Console.ReadLine());
        if(num%3 ==0 && num%7==0){
            Console.WriteLine("{0} is Divisible By 3 and 7",num);
        }else if (num%3==0){
            Console.WriteLine("{0} is Divisible By 3",num);
        }else if (num%7==0){
            Console.WriteLine("{0} is Divisible By 7",num);
        }else{
            Console.WriteLine("{0} Not Divisioble by 3 and 7.",num);
        }
    }
}