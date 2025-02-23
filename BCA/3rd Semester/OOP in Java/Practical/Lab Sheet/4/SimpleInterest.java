// WAP to find simple interest. [si=(p*t*r)/100]
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Principle Amount, Rate of Interest and Time Period:");
        int p=sc.nextInt(),t=sc.nextInt();
        float r=sc.nextFloat(),interest=(p*t*r)/100;
        System.out.println("Total Interest = "+interest);
    }    
}
