// Write a C# program to demonstrate aggregate functions using LINQ.
using System;
using System.Linq;
class AggregateLINQ{
    static void Main(string[] args){
        int[] arr={4,8,10,48,17,46,79,48,15,20};
        var res=from x in arr
            where x>(
                from y in arr
                select y
            ).Average()
            select x;
        foreach (int data in res){
            Console.WriteLine(data);
        }
    }
}