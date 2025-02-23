//Java Program to display Fibonacci Series using while loop
import java.util.Scanner;
public class Fibonacci{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many Term Your want to Display:");
        int num=sc.nextInt();
        int a=0,b=1,c,i=3;
        System.out.print(a+"\t"+b);
        while(i<=num){
            c=a+b;
            a=b;
            b=c;
            i++;
            System.out.print("\t"+c);
        }
    }
}