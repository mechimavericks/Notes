class Calc{
    int a,b;
    void setValue(){
        a=10;b=20;
    }
    void Sum(){
        System.out.println("Sum = "+(a+b));
    }
}
class Abstraction extends Calc{
    public static void main(String args[]){
        Abstraction a = new Abstraction();
        a.setValue();
        a.Sum();
    }
}