using System;
//Exception Handeling Using Custom Exception Class
class BcaException : Exception{
    public BcaException(string msg):base(msg){}
}
class ThrowKeyword{
    static void Main(){
        int age;
        Console.Write("Enter Your Age: ");
        age=int.Parse(Console.ReadLine());
        try{
            if(age<18){
                throw new BcaException("Not Eligible to Vote!!!");
            }else{
                Console.WriteLine("You are Eligible to Vote!!!");
            }
        }catch(BcaException ex){
            Console.WriteLine(ex.Message);
        }
    }
}