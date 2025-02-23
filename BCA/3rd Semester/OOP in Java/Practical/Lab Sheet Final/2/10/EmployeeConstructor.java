// WAP using parameterized Employee constructor with two parameters id and name. While creating the objects obj1 and obj2 passed two arguments so that this constructor gets invoked after creation of obj1 and obj2.
class Employee{
    int id;
    String name;
    Employee(int id, String name){
        this.id=id;
        this.name=name;
    }
    void Display(){
        System.out.println("ID = "+id+"\nName = "+name);
    }
}
class EmployeeConstructor{
    public static void main(String ags[]){
        Employee obj1=new Employee(103,"Anish");
        Employee obj2=new Employee(205,"Manoj");
        obj1.Display();
        obj2.Display();
    }
}