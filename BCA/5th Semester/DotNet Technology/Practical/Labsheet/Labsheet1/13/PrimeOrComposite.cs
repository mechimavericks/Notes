// Write a C# program to check whether a number is prime or composite usingaction delegate.
using System;
class PrimeOrComposite{
    static void Check(int n){
        int counter=0;
        for(int i=2;i<n;i++)
            if(n%i==0){
                counter++;
                break;
            }
        if(counter==0){
            Console.WriteLine("{0} is Prime Number.",n);
        }else{
            Console.WriteLine("{0} is Composite Number.",n);
        }
    }
    static void Main(){
        Action<int> obj = new Action<int>(Check);
        obj(5);
        obj(10);
        obj(13);
    }
}