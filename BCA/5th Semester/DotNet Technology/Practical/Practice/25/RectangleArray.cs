using System;
namespace Array{
    class RectangleArray{
        public static void Main(){
            int[,] arr=new int[2,3]{
                {2,3,5},
                {6,7,8}
            };
            for(int i=0;i<2;i++){
                for(int j=0;j<3;j++){
                    Console.Write(arr[i,j]+"\t");
                }
                Console.WriteLine("\n");
            }
        }
    }
}