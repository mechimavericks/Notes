import java.util.*;
public class UserInput{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number:");
       a=sc.nextInt();
         System.out.println("Enter the Second Number:");
        b=sc.nextInt();
        c=a+b;
        System.out.println("Sum = "+c);
    }
}
