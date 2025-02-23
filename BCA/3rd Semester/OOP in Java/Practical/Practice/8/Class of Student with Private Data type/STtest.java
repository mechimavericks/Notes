//WAP to create a class Student along with two methond getData(), printData() to get the value through argument and display the data in printData. Create the two objects s1,s2 to decleare and access the values from the STtest.
import java.util.Scanner;
class Student{
    private String name, address;
    private int age ;
    void getData(String d1, String d2, int num){
        name =d1;
        address = d2;
        age = num;
    }
    void printData(){
        System.out.println("Name = "+name+"\nAddress = "+address+"\nAge = "+age);
    }
}
class STtest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student();
        String name, address; int i, age;
        System.out.println("Enter the Name, Address and Age:");
        name=sc.nextLine();address=sc.nextLine();age=sc.nextInt();
        s1.getData(name, address,age);
        // s2.getData(name, address,age);

        s1.printData();
        // s2.printData();
    }
}