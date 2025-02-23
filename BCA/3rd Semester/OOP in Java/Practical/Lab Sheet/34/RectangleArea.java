// Define a class Rectangle with data members: length and breadth. Initialize its data members with some fixed values (i.e. say 100 and 200 for length and breadth respectively) using a constructor. Write a program to use an object of the class to calculate area of a rectangle.
class Rectangle{
    int len,bre;
    Rectangle(int l, int b){
        len=l;
        bre=b;
    }
    void Area(){
        System.out.println("Area of Rectangle = "+(len*bre));
    }
}
public class RectangleArea {
    public static void main(String args[]) {
        Rectangle obj=new Rectangle(15,20);
        obj.Area();
    }
}
