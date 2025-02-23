using System;
using System.IO;
class FileReaderWriter{
    static void Main(){
        //writing in file
        // StreamWriter sw = new StreamWriter("Test.txt");
        // string msg="Welcoeme to C#";
        // sw.Write(msg);
        StreamReader sr = new StreamReader("Test.txt");
        string text = sr.ReadToEnd();
        Console.WriteLine(text);
    }
}