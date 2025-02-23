class Calc{
    private int a,b,sum;
    void setValue(int a, int b){
        this.a=a;
        this.b=b;
        Sum();
    }
    private void Sum(){
        sum=a+b;
    }
    void getResult(){
        System.out.println("Sum = "+sum);
    }
}
class Encapsulation{
    public static void main(String san[]){
        Calc c= new Calc();
        c.setValue(10,5);
        c.getResult();
    }
}