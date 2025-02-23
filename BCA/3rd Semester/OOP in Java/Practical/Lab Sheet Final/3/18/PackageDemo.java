// Using Packages Demo
import info.Name;
import java.util.Scanner;
class PackageDemo{
    public static void main(String args[]){
        Name name = new Name();
        Scanner sc = new Scanner(System.in);
        System.out.println("What is Your Name: ");
        String n =sc.nextLine();
        name.Name(n);
    }
}