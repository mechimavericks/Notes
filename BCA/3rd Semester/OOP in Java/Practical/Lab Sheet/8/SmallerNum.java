// WAP to find smallest among two numbers.
import java.util.Scanner;
public class SmallerNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Number: ");
        int num1=sc.nextInt(),num2=sc.nextInt();
        if(num1<num2)
            System.out.println(num1+" is Smaller.");
        else    
        System.out.println(num2+" is Smaller.");
    }       
}
