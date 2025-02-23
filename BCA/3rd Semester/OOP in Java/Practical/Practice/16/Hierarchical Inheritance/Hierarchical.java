class Parent{
    void Display(){
        System.out.println("Parent");
    }
}
class Child1 extends Parent{
    void Print(){
        System.out.println("Child 1");
    }
}
class Child2 extends Parent{
    void Print(){
        System.out.println("Child 2");
    }
}
class Hierarchical{
    public static void main(String args[]) {
        Child1 obj1 = new Child1();
        Child2 obj2 = new Child2();
        obj1.Display();
        obj1.Print();
        obj2.Display();
        obj2.Print();
    }
}