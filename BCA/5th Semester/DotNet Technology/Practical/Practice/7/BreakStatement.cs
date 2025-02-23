using System;
class BreakStatement{
    static void Main(){
        for(int i=0;i<10;i++){
            if(i==4){
                break;
            }
            Console.WriteLine(i);
        }
    }
}