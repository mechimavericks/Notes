import java.util.Scanner;
class TryCatchDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Two Number: ");
        int a=sc.nextInt(),b=sc.nextInt();
        try{
            System.out.println(a+"/"+b+" = "+(a/b));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}