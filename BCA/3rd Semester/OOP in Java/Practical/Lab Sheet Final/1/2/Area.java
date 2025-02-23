// Write a Program to print the area of triangle. Save it with name Area.java in your folder. (area = 1/2 (b × h)
import java.util.Scanner;
class Area{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Base and height of Triangle:");
        float b=sc.nextInt();
        float h=sc.nextInt();
        System.out.println("Area = "+(b*h)/2);
    }
}