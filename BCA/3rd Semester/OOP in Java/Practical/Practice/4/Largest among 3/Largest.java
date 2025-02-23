//Java Program to find the largest of three numbers using if..else..if
import java.util.Scanner;
public class Largest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Number: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3)
            System.out.println(num1+" is Largest Number.");
        else if(num2>num3)
            System.out.println(num2+" is Largest Number.");
        else
            System.out.println(num3+" is Largest Number.");
    }
}