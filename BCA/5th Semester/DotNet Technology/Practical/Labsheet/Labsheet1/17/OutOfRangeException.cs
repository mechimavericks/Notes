// Write a C# program to handle index out of range exception.
using System;
class OutOfRangeException{
    static void Main(){
        int[] arr = new int[5];
        try{
            for(int i=0;i<10;i++)
                arr[i]=i;
        }catch(Exception e){
            Console.WriteLine(e.Message);
        }
    }
}