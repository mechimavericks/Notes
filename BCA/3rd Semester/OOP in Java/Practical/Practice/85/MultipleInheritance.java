interface Sum{
    void Sum();
}
interface Sub{
    void Sub();
}
class A implements Sum,Sub{
    int a=10,b=5;
    public void Sum(){
        System.out.println("Sum = "+(a+b));
    }
    public void Sub(){
        System.out.println("Sub = "+(a-b));
    }
}
class MultipleInheritance{
    public static void main(String args[]){
        A a=new A();
        a.Sum();
        a.Sub();
    }
}