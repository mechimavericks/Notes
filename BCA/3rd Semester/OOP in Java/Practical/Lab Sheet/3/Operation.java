// WAP to add, subtract, multiply and divide two numbers.
import java.util.Scanner;
public class Operation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.println("Addition = "+(a+b)+"\nSubtract = "+(a-b)+"\nMultiplication = "+(a*b)+"\nDivision = "+(a/b));
    }
}