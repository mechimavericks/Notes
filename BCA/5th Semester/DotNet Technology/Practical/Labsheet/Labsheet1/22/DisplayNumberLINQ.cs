// Write a program in C# Sharp to create a list of numbers and display the numbers greater than 80 as output using LINQ. Also display all selected numbers in descending order.
using System;
using System.Collections.Generic;
using System.Linq;
class DisplayNumberLINQ{
    static void Main(){
        List<int> list = new List<int>(){100,30,80,180,470,48,480,6958,65,8,69,55,105,140,65,4,165,21,1,58,4,65,4,8};
        var filteredData=from x in list
                            where x > 80
                            orderby x descending
                            select x; 
        Console.WriteLine("Numbers greater than 80 are:");   
        foreach(var x in filteredData)
            Console.Write(x+"\t");
    }
}