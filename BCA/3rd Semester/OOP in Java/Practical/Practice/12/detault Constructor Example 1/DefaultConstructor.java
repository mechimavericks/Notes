import java.util.Scanner;
class DefaultConstructor{
    int a,b;
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     DefaultConstructor ds=new DefaultConstructor();
     System.out.println("Enter the Two Numbers: ");
     ds.a=sc.nextInt();
     ds.b=sc.nextInt();  
     System.out.println("Value\nA = "+ds.a+"\nB = "+ds.b);
    }
}