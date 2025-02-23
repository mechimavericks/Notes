using System;
namespace Bca{
public class A{
    public void Fact(){
        int n=5,fact=1;
        for(int i=1;i<=n;i++)
            fact*=i;
        Console.WriteLine("Factorial of {0} is {1}.",n,fact);
    }
}
}