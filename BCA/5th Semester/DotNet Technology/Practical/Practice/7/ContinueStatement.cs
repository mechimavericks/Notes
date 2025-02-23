using System;
class ContinueStatement{
    static void Main(){
        for(int i=0;i<10;i++){
            if(i==4){
                continue;
            }
            Console.WriteLine(i);
        }
    }
}