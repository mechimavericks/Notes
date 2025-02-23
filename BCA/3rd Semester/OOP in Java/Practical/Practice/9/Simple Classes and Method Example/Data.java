class Student{
    private String name;
    private int age;
    void getData(String n, int a){
        name = n;
        age =a;
    }
    void printData(){
        System.out.println("Name = "+name+"\nAge = "+age);
    }
}
class Data{
    public static void main(String args[]){
    Student d1=new Student();
    Student d2=new Student();
    d1.getData("Anish",21);
    d2.getData("Hari",21);
    d1.printData();
    d2.printData();
    }
}