using System;
class UsingParams{
    static void SumArr(params int[] arr){
        int add=0;
        foreach(int el in arr){
            add+=el;
        }
        Console.WriteLine("Sum : {0}",add);
    }
    public static void Main(){
        int[] arr={10,20,30,40,20,10};
        SumArr(arr);
    }
}