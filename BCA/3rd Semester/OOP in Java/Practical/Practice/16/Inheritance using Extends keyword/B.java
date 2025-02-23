class A{
    void Display(){
        System.out.println("Super Class.");
    }
}
class B extends A{
    void Print(){
        System.out.println("Child Class.");
    }
    public static void main(String args[]){
        B obj= new B();
        obj.Display();
        obj.Print();
    }
}