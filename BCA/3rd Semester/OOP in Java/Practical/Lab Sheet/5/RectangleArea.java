// WAP to area of rectangle. [area=l*b]
import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Lenght and Breadth: ");
        int len=sc.nextInt(),bre=sc.nextInt();
        System.out.println("Area of Rectangle = "+(len*bre));
    }
}
