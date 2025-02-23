class Calc{
    void Sum(int a, int b){
        System.out.println("Sum = "+(a+b));
    }
 void Sum(int a, int b, int c){
        System.out.println("Sum = "+(a+b+c));
    }
 void Sum(double a, double b){
        System.out.println("Sum = "+(a+b));
    }
}
class CompileTimePolymorphism{
    public static void main(String args[]){
        Calc obj = new Calc();
        obj.Sum(5,6);
        obj.Sum(6,10,6);
        obj.Sum(5.2,6.3);
    }
}