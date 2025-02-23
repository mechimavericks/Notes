using System;
class AnonymousFunction{
    public delegate void MyDel(int x, int y);
    public delegate void Fact(int x);
    static void Main(){
        MyDel del = delegate(int x ,int y){
            Console.WriteLine("Sum : {0}\nDifference : {1}",(x+y),(x-y));
        };
        del(20,10);
        Fact ft= delegate(int n ){
            int fact=1,i=1;
            do{
                fact*=i;
                i++;
            }while(i<=n);
            Console.WriteLine("Factorial of {0} is {1}.",n,fact);
        };
        ft(5);

    }
}