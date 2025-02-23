using System;
class JaggedArray{
    public static void Main(){
        int[][] arr = new int[][]{
            new int[] {10,20,30},
            new int[] {5,6,8,10,20,80},
            new int[] {2,3}
        };
        foreach(int[] el in arr){
            foreach(int data in el){
                Console.Write(data +"   ");
            }
            Console.WriteLine();
        }
    }
}