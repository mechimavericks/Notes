//Java Program to check if number is even or odd
import java.util.Scanner;
public class OddEven{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=sc.nextInt();
        if(num%2==0)
            System.out.println(num+" is Even Number.");
        else
            System.out.println(num+" is Odd Number.");
    }
}