// Write a program to show the use of switch case statement.
import java.util.Scanner;
public class SwitchCase {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("***Option***\nAdditon(+)\nSubraction(-)\nMultiplication(*)\nDivision(/)\nModolus(%)\nEnter Your Option(+,-,*,/,%) = ");
        char ch=sc.next().charAt(0);
        System.out.println("Enter a Two Number:");
        int a=sc.nextInt(),b=sc.nextInt();
        switch(ch){
            case '+':
                System.out.println("Addition= "+(a+b));
                break;
            case '-':
                System.out.println("Subtraction = "+(a-b));
                break; 
            case '*':
                System.out.println("Multiplication = "+(a*b));
                break;
            case '/':
                System.out.println("Division = "+(a/b));
                break; 
            case '%':
                System.out.println("Modolus = "+(a%b));
                break;
            default:
                System.err.println("Invalid Entry.");
        }
    }
}
