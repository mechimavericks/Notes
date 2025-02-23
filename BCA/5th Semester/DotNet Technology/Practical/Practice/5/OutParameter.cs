using System;
class OutParameter{
    static void Test(int x,int y, out int sum){
        sum = x+y;
    }
    static void Main(){
        int sum,res;
        Test(10,5,out sum);
        Test(10,10,out res);
        Console.WriteLine($"Sum : {sum}");
        Console.WriteLine($"Sum : {res}");
    }
}