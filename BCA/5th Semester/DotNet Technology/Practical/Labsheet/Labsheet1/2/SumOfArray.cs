// Write a C# program to calculate sum of array using reference type.
using System;
class SumOfArray{
    static void Sum(ref int[] arr){
        int sum=0;
        foreach(int i in arr)
            sum+=i;
        Console.WriteLine("Sum of Array is {0}",sum);
    }
    static void Main(){
        int[] arr = {5,26,23,1,26};
        Sum(ref arr);
    }
}