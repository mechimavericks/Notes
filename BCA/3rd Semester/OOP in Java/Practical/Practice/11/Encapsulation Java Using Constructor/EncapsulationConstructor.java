import java.util.Scanner;
class Calculation{
    private int sum,diff,mul,div,mod;
    Calculation(int x, int y){
        sum=x+y;
        diff=x-y;
        mul=x*y;
        div=x/y;
        mod=x%y;
    }
    void Addition(){
        System.out.println("Addition = "+sum);
    }
    void Subtraction(){
        System.out.println("Subtraction = "+diff);
    }
    void Multiplication(){
        System.out.println("Multiplication = "+mul);
    }
    void Division(){
        System.out.println("Division = "+div);
    }
    void Modolus(){
        System.out.println("Modolus = "+mod);
    }
}
class EncapsulationConstructor{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter TWo Number: ");
        int a=sc.nextInt(),b=sc.nextInt();
        Calculation calc = new Calculation(a,b);
        calc.Addition();
        calc.Subtraction();
        calc.Multiplication();
        calc.Division();
        calc.Modolus();
    }
}