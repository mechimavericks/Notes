using System;
class RectangularArray1{
    static void Main(){
        int[,] arr=new int[2,3];
        // arr[0,0]=10;
        // arr[1,1]=20;
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                Console.Write("Enter the Value of [{0} {1}]: ",i,j);
                arr[i,j]=Convert.ToInt32(Console.ReadLine());
                Console.WriteLine();
            }
        }
         for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                Console.Write("{0}\t",arr[i,j]);
            }
            Console.WriteLine();
        }
    }
}