using System;
class DividByZeroException{
    static void Main(){
        try{
            int a=10,b=0,res;
            res=a/b;
        }catch(DivideByZeroException ex){
            Console.WriteLine("Error : {0}",ex);
        }finally{
            Console.WriteLine("It Always Run at every Situation");
        }
    }
}