using System;
class ExceptionHandeling{
    static void Main(){
        try{
            int a=10;
            Console.WriteLine("Division: {0}",(a/0));
            // Used When Exception is not clearly known
        }catch(Exception e){
            Console.WriteLine("Error : {0}",e);
        }
    }
}