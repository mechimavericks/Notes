// Write a program to create a class Student2 along with two method getData(), printData() to get the value through argument and display the data in printData. Create the two objects s1 ,s2 to declare and access thevalues from class STtest.
import java.util.Scanner;
class Student2{
    private String name, address;
    private int roll;
    void getData(int r, String n, String a){
        roll = r;
        name =n; 
        address = a;
    }
    void printData(){
        System.out.println("Roll No. = "+roll+"\nName = "+name+"\nAddress = "+address);
    }
}
class STtest{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
        System.out.println("Enter the Roll No., Name and Address of Two Student:");
        int r=sc.nextInt();
        String n=sc.next(), a=sc.next();
        s1.getData(r,n,a);
        r=sc.nextInt();
        n=sc.next();
        a=sc.next();
        s2.getData(r,n,a);
        s1.printData();
        s2.printData();
    }
}