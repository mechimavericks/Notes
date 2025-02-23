using System;
using System.Linq;
using System.Collections.Generic;
class LINQ4{
    static void Main(){
        List<int> list = new List<int>(){7,8,10,12,13,4};
        list.Add(10);
        list.Add(7);
        //LINQ Query to Select Numbers between than 5 and 10
        var res=from x in list
                where x>=5 && x<=10
                orderby x ascending
                select x;
        // Console.WriteLine(res);
        foreach (int item in res){
            Console.Write(item+"\t");
            
        }
    }
}