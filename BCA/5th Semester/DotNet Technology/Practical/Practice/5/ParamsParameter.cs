using System;
class ParasParameter{
    static void Sum(params int[] arr){
        int sum=0;
        foreach(int data in arr){
            sum+=data;
        }
        Console.WriteLine($"Sum : {sum}");

    }
    static void Main(){
        Sum();
        Sum(10,5,15);
        Sum(10,5,150,152);
        Sum(10,5,15,15,889,89,98);
    }
}