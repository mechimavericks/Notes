interface A{
    void DispA();
}
interface B{
    void DispB();
}
class  Child implements A,B {
    public void DispA(){
        System.out.println("A");
    }
    public void DispB(){
        System.out.println("B");
    }
    public void Disp(){
        System.out.println("Child");
    }
}
class Multiple{
    public static void main(String args[]){
        Child obj = new Child();
        obj.Disp();
        obj.DispA();
        obj.DispB();
    }
}