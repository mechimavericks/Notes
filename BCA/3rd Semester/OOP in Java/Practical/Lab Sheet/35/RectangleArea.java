// Modify above program to read length and breadth of a rectangle in main() function and supply them in parameterized constructor to initialize its data members.
import java.util.Scanner;
class Rectangle{
    int length,breadth;
    Rectangle(int l, int b){
        length=l;
        breadth=b;
    }
    void DisplayArea(){
        System.out.println("Area = "+(length*breadth));
    }    
}
public class RectangleArea {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length and Breadth of Rectangle");
        int len=sc.nextInt(),bre=sc.nextInt();
        Rectangle R=new Rectangle(len, bre);
        R.DisplayArea();
    }
}
