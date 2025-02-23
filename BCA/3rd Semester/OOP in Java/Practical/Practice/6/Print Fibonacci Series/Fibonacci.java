//. Java Program to print Fibonacci Series using for loop
import java.util.Scanner;
class Fibonacci{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter How Many Term You Like to Display:");;
        int num=sc.nextInt();
        int a=0,b=1,c;
        System.out.print(a+"\t"+b+"\t");
        for(int i=3;i<=num;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+"\t");
        }
    }
}