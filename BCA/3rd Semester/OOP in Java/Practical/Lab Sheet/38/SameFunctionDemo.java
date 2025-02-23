// Write a program which has two functions with same name and same number of arguments, one for addition of two integers and other for addition of two double values.
class Calculation{
    void Addition(int a, int b){
        System.out.println("Sum of Integers = "+(a+b));
    }
    void Addition(double a, double b){
        System.out.println("Sum of Double = "+(a+b));
    }
}
public class SameFunctionDemo {
    public static void main(String args[]) {
        Calculation c1=new Calculation();
        c1.Addition(20, 30);
        c1.Addition(52.60, 8.12);
    }
}
