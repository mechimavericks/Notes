using System;
class ArrayTypeMisMatch{
    static void Main(){
        int[] arr=new int[2];
        try{
            arr[0]=5;
            //Compiler Shows The Error during Compile time 
            arr[1]="Santosh";
        }catch(ArrayTypeMisMatchException ex){
            Console.WriteLine(ex);
        }
    }
}