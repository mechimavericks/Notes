using System;
class FindLargest{
    static int Largest(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.Length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static void Main(){
        int[] arr = {10,22,13,144,50,150,142,155,10,15};
        Console.WriteLine("Largest : {0}",Largest(arr));
    }
}