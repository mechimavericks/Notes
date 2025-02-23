// . WAP to check whether a number a number is divisible by 7 but not by 13
import java.util.Scanner;
public class DivBy7and13{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=sc.nextInt();
        if(num%7==0 && num%13==0)
            System.out.println(num+" is Divisible by 7 and 13.");
        else    
        System.out.println(num+" is Not Divisible by 7 and 13.");
    }
}