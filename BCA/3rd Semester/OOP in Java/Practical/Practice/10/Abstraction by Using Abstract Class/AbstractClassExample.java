import java.util.Scanner;
abstract class Calculation{
    void Input(){
        System.out.println("Enter the TWo Numbers: ");
    }
    abstract void Calc(int a, int b);
}
class Sum extends Calculation{
    void Calc(int x, int y){
        System.out.println("Addition = "+(x+y));
    }
} 
class Sub extends Calculation{
    void Calc(int x, int y){
        System.out.println("Subtraction = "+(x-y));
    }
}
class Product extends Calculation{
    void Calc(int x, int y){
        System.out.println("Product = "+(x*y));
    }
}
class Division extends Calculation{
    void Calc(int x, int y){
        System.out.println("Division = "+(x/y));
    }
}
class Modolus extends Calculation{
    void Calc(int x, int y){
        System.out.println("Modolus = "+(x%y));
    }
}
class AbstractClassExample{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Calculation s=new Sum();
        Calculation su=new Sub();
        Calculation p=new Product();
        Calculation d=new Division();
        Calculation m=new Modolus();
        s.Input();
        int a=sc.nextInt(),b=sc.nextInt();
        s.Calc(a,b);
        su.Calc(a,b);    
        p.Calc(a,b) ;
        d.Calc(a,b);
        m.Calc(a,b);
    }
}