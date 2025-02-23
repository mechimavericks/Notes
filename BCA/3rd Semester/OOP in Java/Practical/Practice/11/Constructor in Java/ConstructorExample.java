import java.util.Scanner;
class Calc{
    int sum,sub;
    Calc(int x, int y){
        sum = x+y;
        sub = x-y;
    }
    void Addition(){
        System.out.println("Addition = "+sum);
    }
    void Subtraction(){
        System.out.println("Subtraction = "+sub);
    }
}
class ConstructorExample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Number: ");
        int a=sc.nextInt(), b=sc.nextInt();
        Calc c = new Calc(a,b);
        c.Addition();
        c.Subtraction();
    }
}