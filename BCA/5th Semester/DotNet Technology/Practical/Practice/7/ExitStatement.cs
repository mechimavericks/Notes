using System;
class ExitStatement{
    static void Main(){
        for(int i=0;i<=10;i++){
            for(int j=0;j<=10;j++){
                Console.WriteLine("{0}:{1}",i,j);
                if(i==5 && j==5){
                    Console.WriteLine("Exiting...");
                    Environment.Exit(1);
                }
            }
        }
    }
}