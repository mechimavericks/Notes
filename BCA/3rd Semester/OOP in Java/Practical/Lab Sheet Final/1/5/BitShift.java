// Bitwise Operator Shifting
import java.util.Scanner;
class BitShift{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        System.out.println("Before Shifting = "+num+"\nAfter Shifiting = "+(num>>>2));
    }
}