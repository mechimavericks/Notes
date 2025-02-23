import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class ArrayIntString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("***Option***\n1. Integer Data\n2. String Data\nEnter Your Choice(1,2): ");
        int n=sc.nextInt();
        switch(n){
            case 1:
                IntegerData();
                break;
            case 2: 
                StringData();
                break;
            default: 
                System.out.print("Invalid Entry.");
        }
    }    
    static void IntegerData(){
        Scanner sc=new Scanner(System.in);
        System.out.print("How many Numbers you want to Enter: ");
        int n=sc.nextInt();
        System.out.println("Enter the "+n+" Numbers: ");
        int num[]=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("Entered Numbers are: ");
        for(int a:num){
            System.out.println(a);
        }
    }
    static void StringData(){
        Scanner sc=new Scanner(System.in);
        System.out.print("How many String you want to Enter: ");
        int n=sc.nextInt();
        System.out.println("Enter the "+n+" Name: ");
        String data[]=new String[n];
        for(int i=0;i<n;i++){
            data[i]=sc.next();
        }
        System.out.println("Entered Data are: ");
        for(String a:data){
            System.out.println(a);
        }
    }
}
