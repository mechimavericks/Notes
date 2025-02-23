// WAP to check whether a number is exactly by 5 and 10.
import java.util.Scanner;
public class DivBy5and10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=sc.nextInt();
        if(num%5==0 && num%10==0)
            System.out.println(num+" is Divisible by 5 and 10.");
        else    
        System.out.println(num+" is Not Divisible by 5 and 10.");

    }
}