//WAP to create a class of student with dat "Name, city and Age" along with method printData to display the Data. Create the two objects s1,s23 to declare and access the values. 
class Student{
    String name,city;
    int age;
    void printData(){
        System.out.println("Name = "+name);
        System.out.println("City = "+city);
        System.out.println("Age = "+age);
    }
}
class CreatingClass{
 public static void main(String[] args) {
     Student s1 = new Student();
    Student s2 = new Student();
    s1.name = "Ram Shah";
    s1.city = "Kathmandu";
    s1.age = 20;
    s2.name = "Geeta";
    s2.city = "Jhapa";
    s2.age = 30;
    System.out.println("S1 Data Printing:");
    s1.printData();
    System.out.println("S2 Data Printing:");
    s2.printData();
    }
    
}