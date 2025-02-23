using System;
class GotoStatement{
    static void Main(){
        label:
        for(int i=0;i<5;i++){
            Console.WriteLine("i= {0}",i);
        }
        Console.WriteLine("Do You Want to Run Again(y/n):");
        string ch = Console.ReadLine();
        if(ch=="y" || ch == "Y")
            goto label;
        
    }
}