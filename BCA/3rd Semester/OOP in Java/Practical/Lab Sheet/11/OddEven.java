// WAP to check whether a number is odd or even
import java.util.Scanner;
public class OddEven{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=sc.nextInt();
        if(num%2==1)
            System.out.println(num+" is Odd Number.");
        else
            System.out.println(num+" is Even Number.");
    }
}