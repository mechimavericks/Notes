using System;
class IndexOutOfRangeEx{
    static void Main(){
        int[] arr=new int[2];
        try{
            arr[0]=10;
            arr[2]=3;
        }catch(IndexOutOfRangeException ex){
            Console.WriteLine(ex);
            Console.WriteLine("Error Occured");
        }
    }
}
