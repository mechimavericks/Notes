import java.util.Scanner;
class Factorial{
    int Fact(int n){
        if(n==0|| n==1)
            return 1;
        else
            return n*Fact(n-1);
    }
}
class FactorialRecursion{
    public static void main(String[] args) {
        Factorial f=new Factorial();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number for Factorial:  ");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" is "+f.Fact(n));
    }
}