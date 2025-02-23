// Write a program which has two functions with same name, one for addition of two integers and other for addition of three integers.
class Function{
    void Addition(int a, int b){
        System.out.println("Sum of Two Integer = "+(a+b));
    }
    void Addition(int a, int b, int c){
        System.out.println("Sum of Three Integer = "+(a+b+c));
    }
}
public class SameFunctionExample {
    public static void main(String args[]){
        Function f1=new Function();
        f1.Addition(50,60);
        f1.Addition(10,20,30);
    }
}
