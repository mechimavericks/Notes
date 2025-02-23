// Write a program of your choice to show the implementation of this keyword.
class Data{
    int id;
    String name;
    void Student(int id, String name){
        this.id=id;
        this.name=name; //here this.name represet the variable of Data not the variable of Student
    }
    void Display(){
        System.out.println("ID = "+id+"\nName = "+name);
    }
}
public class ThisDemo {
    public static void main(String args[]){
        Data d1=new Data();
        d1.Student(101,"Shree");
        d1.Display();
    }
}
