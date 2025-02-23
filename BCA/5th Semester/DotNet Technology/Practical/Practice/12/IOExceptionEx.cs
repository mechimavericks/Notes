using System;
using System.IO;
class IOExceptionEX{
    static void Main(){
        try{
            StreamReader sr = new StreamReader("Test1.txt");
            string text = sr.ReadToEnd();
            Console.WriteLine(text);
        }catch(IOException ex){
            Console.WriteLine(ex.Message);
        }
    }
}