class A{
    void disp(){
        System.out.println("Parent Class");
    }
}
class SingleInheritance extends A{
    public static void main(String args[]){
        SingleInheritance obj = new SingleInheritance();
        obj.disp();
    }
}