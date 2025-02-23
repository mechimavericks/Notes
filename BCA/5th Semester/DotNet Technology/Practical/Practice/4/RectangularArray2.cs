using System;
class RectangularArray2{
    static void Main(){
        int[,] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         Console.Write(arr[i,j]+"\t");
        //     }
        //     Console.WriteLine();
        // }
        int counter=0;
        foreach (int item in arr){
            Console.Write(item+"\t");
            counter++;
            if(counter==3){
                Console.WriteLine();
                counter=0;
            }
        }
    }
}