//  Overriding Methods Example
class Parent{
    void Disp(){
        System.out.println("Parent Class");
    }
}
class Child extends Parent{
    void Disp(){
        System.out.println("Child Class");
    }
    void Message(){
        Disp();
    }
}
class OverridingExample{
    public static void main(String args[]){
        Child obj = new Child();
        obj.Message();
    }
}