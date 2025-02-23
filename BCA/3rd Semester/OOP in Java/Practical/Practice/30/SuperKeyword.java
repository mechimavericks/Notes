// Using the Super Keyword in Java
class A{
    int a=20;
    void Disp(){
        System.out.println("Class A");
    }
    A(){
        System.out.println("Constructor A");
    }
}
class B extends A{
    int a=50;
    void Disp(){
        super.Disp();
        System.out.println("Class B");
    }
    void ValueDisp(){
        System.out.println(super.a+"  "+a);
    }
    B(){
        super(); // this is automatically include if you don't write
        System.out.println("Constructor B");
    }
}
class SuperKeyword{
    public static void main(String args[]){
        B obj = new B();
        obj.Disp();
        obj.ValueDisp();
    }
}