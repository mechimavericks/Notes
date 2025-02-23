// 7. Write a C# program to calculate product of each row of jagged array.
using System;
class ProductOfJaggedArray{
    static void Main(){
        int[][] arr ={
            new int[]{1,2,3,4},
            new int[]{5,6,7},
            new int[]{8,9},
        };
        foreach(int[] ar in arr){
            int product = 1;
            foreach(int num in ar)
                product *= num;
            Console.WriteLine("Product : {0}",product);
        }
    }
}