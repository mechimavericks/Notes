import java.util.Scanner;
class ThrowsDemo{
    public static void main(String args[]) throws ArithmeticException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Two Number: ");
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.println(a+" / "+b+" = "+(a/b));
    }
}