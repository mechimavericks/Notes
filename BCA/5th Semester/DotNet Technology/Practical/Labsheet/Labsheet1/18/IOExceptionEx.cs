// Write a C# program to handle IOException.
using System;
using System.IO;
class IOExceptionEx{
    static void Main(){
        try{
            StreamReader sr = new StreamReader("data.txt");
            Console.WriteLine(sr.ReadToEnd());
        }catch(IOException e)  {
            Console.WriteLine(e.Message);
        }
    }
}