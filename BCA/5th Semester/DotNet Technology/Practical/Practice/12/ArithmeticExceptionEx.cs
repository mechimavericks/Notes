using System;
class ArithmeticExceptionEx{
    static void Main(){
        int a=10,b=0,res;
        try{
            res=a/b;
        }catch(ArithmeticException ex){
            Console.WriteLine("Error: {0}", ex.Message);
        }
    }
}