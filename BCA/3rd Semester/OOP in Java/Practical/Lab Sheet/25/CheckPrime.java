// WAP to check whether a number is prime or not.
import java.util.Scanner;
public class CheckPrime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt(),count=0;
        for(int i=2;i<num;i++)
            if(num%i==0){
                count++;
                break;
            }
        if(count==0)
            System.out.println(num+" is Prime Number.");
        else 
            System.out.println(num+" is not Prime Number.");
    }
}