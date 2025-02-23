using System;
class NullReferenceExceptionEx{
    static void Main(){
        string str="Santosh";
        string str1=null;
        try{
            Console.WriteLine(str.ToUpper());
            Console.WriteLine(str1.ToUpper());
        }catch(NullReferenceException ex){
            Console.WriteLine(ex);
        }
    }
}