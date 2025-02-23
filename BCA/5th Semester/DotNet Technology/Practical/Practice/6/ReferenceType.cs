using System;
class ReferenceType{
    static void Testing(int[] arr){
        arr[3]=60;
    }
    static void Main(){
        int[] arr={10,20,30,40,50};
        foreach (int item in arr){
            Console.Write($"{item}\t");            
        }
        Testing(arr);
        Console.WriteLine();
        foreach (int item in arr){
            Console.Write($"{item}\t");            
        }

    }
}