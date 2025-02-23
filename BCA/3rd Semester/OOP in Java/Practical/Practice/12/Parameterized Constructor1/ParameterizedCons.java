import java.util.Scanner;
class Calculation{
    int s,su,mul,div;
    Calculation(int x, int y){
        s=x+y;
        su=x-y;
        mul=x*y;
        div=x/y;
    }
    void Display(){
        System.out.println("Sum = "+s+"\nSubtraction = "+su+"\nMultiplication = "+mul+"\nDivision = "+div);
    }
}
class ParameterizedCons{
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter TWo Number: ");
        int a=sc.nextInt(),b=sc.nextInt();
        Calculation obj = new Calculation(a,b);
        obj.Display();
    }
}