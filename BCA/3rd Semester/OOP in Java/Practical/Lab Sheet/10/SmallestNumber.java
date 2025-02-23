// WAP to find smallest among three numbers.
import java.util.Scanner;
public class SmallestNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three Number:");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        if(a<b&&a<c)
            System.out.println(a+" is Smallest.");
        else if(b<c)
        System.out.println(b+" is Smallest.");
        else    
        System.out.println(c+" is Smallest.");
    }
}