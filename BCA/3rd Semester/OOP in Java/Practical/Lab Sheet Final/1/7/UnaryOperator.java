// Unary Operator Example: Complement (~)
import java.util.Scanner;
class UnaryOperator{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        System.out.println("Before Complement = "+num+"\nAfter Complement = "+(~num));
    }
}

