class A{
    void DispA(){
        System.out.println("Class A");
    }
}
class B extends A{
    void DispB(){
        System.out.println("Class B");
    }
}
class C extends A{
    void DispC(){
        System.out.println("Class C");
    }
}
class HierarchicalInheritance{
    public static void main(String args[]){
        C c = new C();
        B b = new B();
        c.DispA();
        c.DispC();
        b.DispA();
        b.DispB();
    }
}
