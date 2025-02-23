import java.util.Scanner;
class Calculation{
    int v1,v2;
    Calculation(int v1,int v2){
        this.v1=v1;
        this.v2=v2;
        System.out.println("Calculation of "+v1+" and "+v2+" is: ");
    }
    Calculation(Calculation c){
        System.out.println("Sum = "+(c.v1+c.v2)+"\nSubtract = "+(c.v1-c.v2)+"\nMultiplication = "+(c.v1*c.v2));
    }
}
class CopyConstructorExp{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Number: ");
        int a=sc.nextInt(),b=sc.nextInt();
        Calculation obj=new Calculation(a,b);
        Calculation CopyObj=new Calculation(obj);
    }   
}