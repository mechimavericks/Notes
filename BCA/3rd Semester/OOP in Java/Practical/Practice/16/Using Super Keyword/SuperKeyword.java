class Parent{
    void Display(){
        System.out.println("Parent Class");
    }
}
class Child extends Parent{
    void Display(){
        System.out.println("Child Class");
        Display();
    }
}
class SuperKeyword{
    public static void main(String args[]){
        Child obj = new Child();
        obj.Display();
    }
}