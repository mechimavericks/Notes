// WAP to find largest among three numbers.
import java.util.Scanner;
public class LargerNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three Numbers: ");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        if(a>b&&a>c)
            System.out.println(a+" is Largest.");
        else if(b>c)
            System.out.println(b+" is Largest.");
        else 
        System.out.println(c+" is Largest.");
    }
    
}
