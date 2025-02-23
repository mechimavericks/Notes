using System;
class JaggedArray1{
    static void Main(){
        int [][] arr={
            new int[]{1,2,3},
            new int[]{4,5},
            new int[]{6,7,8,9}
        };
        // for(int i=0;i<arr.Length;i++){
        //     for(int j=0;j<arr[i].Length;j++){
        //         Console.Write(arr[i][j]+"\t");
        //     }
        //     Console.WriteLine();
        // }

        foreach(int[] ar in arr){
            foreach(int item in ar){
                Console.Write(item+"\t");
            }
            Console.WriteLine();
        }
    }
}