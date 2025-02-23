using System;
using System.Linq;
class LINQ1{
    static void Main(){
        int[] arr={5,3,11,12,9,6,2,1,11};
        //LINQ Query to Select Numbers Greater than 5
        var res=from x in arr
                where x>5
                select x;
        // Console.WriteLine(res);
        foreach (int item in res){
            Console.Write(item+"\t");
            
        }
    }
}