// Java Program to make a Simple Calculator using Switch Case
import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Operation\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n\nEnter Your Selection: ");
        int sw=sc.nextInt();
        System.out.println("Enter a Two Number:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        switch (sw) {
            case 1:
                System.out.println("Addition = "+(num1+num2));
                break;
            case 2:
                System.out.println("Subtraction = "+(num1-num2));
              break;            
            case 3:
                System.out.println("Multiplication = "+(num1*num2));
                break;            
            case 4:
               System.out.println("Division = "+(num1/num2));
                break; 
            case 5:
               System.out.println("Modulus = "+(num1%num2));
               break;
            default:
                System.out.println("Invalid Entry");
                break;
        }
    }
}