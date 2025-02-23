// Write a C# program to calculate sum of all elements of rectangular array.
using System;
class SumOfRectArray{
    static void Main(){
        int[,] arr = new int[3,4]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int sum = 0;
        foreach(int i in arr)
            sum += i;
        Console.WriteLine("Sum : {0}",sum);
    }
}