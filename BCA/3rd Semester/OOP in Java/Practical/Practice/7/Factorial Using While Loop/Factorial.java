// Java Program to find factorial using while loop
import java.util.Scanner;
class Factorial{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=sc.nextInt(),i=1,fact=1;
        while(i<=num){
            fact*=i;
            i++;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}