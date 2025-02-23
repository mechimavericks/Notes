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
class MultilevelInheritance extends B{
    public static void main(String args[]){
        MultilevelInheritance obj = new MultilevelInheritance();
        obj.DispA();
        obj.DispB();
    }
}