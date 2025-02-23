// Write a C# program to handle NullReferenceException.
using System;
class NullReference{
    static void Main(){
        try{
            string str = null;
            Console.WriteLine(str.Length);
        }catch(NullReferenceException e){
            Console.WriteLine(e.Message);
        }
    }
}