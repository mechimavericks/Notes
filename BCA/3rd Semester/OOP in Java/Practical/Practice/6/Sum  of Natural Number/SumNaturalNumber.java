//Java Program to find sum of natural numbers using for loop
import java.util.Scanner;
public class SumNaturalNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("How Many Natural Number You Want to Sum:");
        int num=sc.nextInt(), sum=0;
        for(int i=1;i<=num;i++)
            sum+=i;
        System.out.println("Sum of Number from 1 to "+num+" is "+sum);
    }
}