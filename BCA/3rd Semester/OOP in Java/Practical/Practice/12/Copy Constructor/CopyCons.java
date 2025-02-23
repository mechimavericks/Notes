class Calc{
    int a,b,c;
    Calc(){
        a=10;
        b=20;
        System.out.println("Sum = "+(a+b));
    }
    Calc(Calc o){
        System.out.println("Sum = "+(o.a+o.b));
    }
}
class CopyCons{
    public static void main(String constructor[]) {
        Calc c=new Calc();
        Calc c1=new Calc(c);
    }
}