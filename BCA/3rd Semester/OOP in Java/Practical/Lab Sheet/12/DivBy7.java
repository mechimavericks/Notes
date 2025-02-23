// WAP to check whether a number is divisible by 7 or not.
import java.util.Scanner;
public class DivBy7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=sc.nextInt();
        if(num%7==0)
            System.out.println(num+" is Divisible by 7.");
        else 
            System.out.println(num+" is not Divisible by 7.");
    }
}