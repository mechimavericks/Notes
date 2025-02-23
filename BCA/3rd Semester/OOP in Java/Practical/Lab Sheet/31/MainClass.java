// Write a program to define a class with its data members and function members. Use object of this class in main program to access its members.
class Data{
    String name;
    int age;
    void Display(){
        System.out.println("Name = "+name+"\nAge = "+age);
    }
}
class MainClass{
    public static void main(String args[]){
        Data obj = new Data();
        obj.name= "Hari Dahal";
        obj.age = 28;
        obj.Display();
    }
}