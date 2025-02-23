//  Write a program to define a class named Box which has data length, breadth and height and public functions ReadData() for reading data members and Volume() to calculate volume of box
import java.util.Scanner;
class Box{
    private int length, breadth, height;
    public void ReadData(int l, int b, int h){
        length =l;
        breadth = b;
        height = h;
    }
    public int Volume(){
       int vol=length*breadth*height;
       return vol;
    }
}
class CalculateVolume{
    public static void main(String args[]){
        Box b1= new Box();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Length, Breadth and Heigth: ");
        int l= sc.nextInt(),b=sc.nextInt(),h=sc.nextInt();
        b1.ReadData(l,b,h);
        System.out.println("Volume = "+b1.Volume());
    }
}