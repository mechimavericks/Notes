// Modify above program to read length and breadth of a rectangle in main() function and supply them in parameterized constructor to initialize its data members.
using System;
class Rectangle{
    private int length,breadth;
    public Rectangle(int l, int b){
        length = l;
        breadth = b;
    }
    public void Area(){
        Console.WriteLine($"Area of Rectangle : {this.length*this.breadth}");
    }
}
class Program{
    static void Main(){
        Rectangle r = new Rectangle(50,100);
        r.Area();
    }
}