// WAP to find area of circle. [area=pi*r*r] (use pi as constant)
import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius of Circle: ");
        int r=sc.nextInt();
        final float pi=3.14f;
        System.out.println("Area of Circle = "+(pi*r*r));
    }
}
