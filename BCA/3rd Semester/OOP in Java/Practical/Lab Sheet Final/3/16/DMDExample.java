// Dynamic Method Dispatch
class Parent{
    void Output(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    void Output(){
        System.out.println("Child");
    }
    void Display(){
        System.out.println("This is new Method");
    }
}
class DMDExample{
    public static void main(String args[]){
        Parent obj = new Child();
        obj.Display();
    }
}