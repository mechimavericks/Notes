using System;
using System.Collections.Generic;
class GenericClass{
    public static void Main(){
        List<int> list=new List<int>(){1,2,3,4,5,6,7};
        list.Add(10);
        foreach(int i in list){
            Console.WriteLine(i);
        }
    }
}