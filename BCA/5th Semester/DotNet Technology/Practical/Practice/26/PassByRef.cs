using System;
class PassByRef{
    static void Increment(ref int i){
        i+=5;
    }
    public static void Main(){
        int i=10;
        Console.WriteLine(" Value of I Before Increment : {0}",i);
        Increment(ref i);
        Console.WriteLine(" Value of I After Increment : {0}",i);
    }
}