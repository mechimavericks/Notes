class Parent{
    void Disp(){
        System.out.println("I am Parent Class.");
    }
}
class Inheritance extends Parent{
    void Disp1(){
        System.out.println("I am Child Class");
    }
    public static void main(String args[]){
        Inheritance obj = new Inheritance();
        obj.Disp();
        obj.Disp1();
    }
}