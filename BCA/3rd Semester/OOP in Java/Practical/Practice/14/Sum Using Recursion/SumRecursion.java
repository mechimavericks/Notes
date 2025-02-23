import java.util.Scanner;
class Recursion{
    int Sum(int n){
        if(n==1)
            return 1;
        else 
            return n+Sum(n-1);
    }
}
class SumRecursion{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Recursion s=new Recursion();
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        System.out.println("Sum = "+s.Sum(n));
    }
}