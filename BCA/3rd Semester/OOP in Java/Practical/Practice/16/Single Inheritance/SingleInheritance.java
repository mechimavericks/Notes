class Parent{
    void Display(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    void Print(){
        System.out.println("Child");
    }
}
class SingleInheritance{
    public static void main(String args[]) {
        Child obj = new Child();
        obj.Display();
        obj.Print();
    }
}