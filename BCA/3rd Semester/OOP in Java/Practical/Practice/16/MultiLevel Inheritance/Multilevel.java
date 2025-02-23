class Parent{
    void Display(){
        System.out.println("Parent CLass");
    }
}
class Child extends Parent{
    void Print(){
        System.out.println("Child Class");
    }
}
class SubChild extends Child{
    void SubPrint(){
        System.out.println("SubChild Class");
    }
}
class Multilevel{
    public static void main(String args[]) {
        SubChild obj = new SubChild();
        obj.Display();
        obj.Print();
        obj.SubPrint();
    }
}