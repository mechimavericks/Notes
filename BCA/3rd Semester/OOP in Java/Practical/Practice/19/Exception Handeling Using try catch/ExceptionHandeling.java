import java.util.Scanner;
class ExceptionHandeling{
    public static void main(String args[]){
        try{
            Scanner sc = new Scanner(System.in);
            int a,b;
            System.out.println("Enter two Number for Division: ");
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println("Division of "+a+" and "+b+" is "+(a/b));
        }catch(Exception fail){
            System.out.println("Program Fails. Reason : "+fail);
        }
    }
}