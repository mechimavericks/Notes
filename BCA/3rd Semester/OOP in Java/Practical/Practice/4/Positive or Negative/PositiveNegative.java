// Java Program to check if number is positive or negative
import java.util.*;
class PositiveNegative{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=sc.nextInt();
        if(num>0)
            System.out.println(num+" is Positive Number.");
        else if(num<0)
            System.out.println(num+" is Negative Number.");
        else
            System.out.println(num+" is Neither Positive Nor Negative.");
    }
}