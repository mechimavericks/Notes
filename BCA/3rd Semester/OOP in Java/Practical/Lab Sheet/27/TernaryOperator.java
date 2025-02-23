// WAP to show the use of ternary operator.
import java.util.Scanner;
class TernaryOperator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 4 Numbers:");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
        a=(a>b)?a:b;
        a=(a>c)?a:c;
        a=(a>d)?a:d;
        System.out.println(a+" is Greater.");
    }
}