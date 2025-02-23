using System;
class SumElinJaggedArray{
    public static void Main(){
        int[][] arrs=new int[][]{
            new int[]{10,20,30,40,50},
            new int[]{5,6,8}
        };
        foreach(int[] arr in arrs){
            int sum=0;
            foreach(int el in arr){
                sum+=el;
            }
            Console.WriteLine(sum);
        }
    }
}