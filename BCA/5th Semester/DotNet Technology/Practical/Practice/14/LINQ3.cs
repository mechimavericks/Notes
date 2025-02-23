using System;
using System.Linq;
class LINQ3{
    static void Main(){
        int[] arr={5,3,8,12,9,6,2,1,11};
        //LINQ Query to Select Numbers between than 5 and 10
        var res=from x in arr
                where x>=5 && x<=10
                orderby x descending
                select x;
        // Console.WriteLine(res);
        foreach (int item in res){
            Console.Write(item+"\t");
            
        }
    }
}