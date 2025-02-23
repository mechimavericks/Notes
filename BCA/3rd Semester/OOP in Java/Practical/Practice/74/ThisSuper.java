class Calc{
    int a,b;
    void Disp(){
        System.out.println("Sum = "+(a+b));
    }
}
class ThisSuper extends Calc{
    int a,b;
    void Init(int a, int b){
        super.a=this.a=a;
        super.b=this.b=b;
        Disp();
    }
    void Disp(){
        System.out.println("A = "+a+"\nB = "+b);
       super.Disp();
    }
    public static void main(String args[]){
        ThisSuper obj = new ThisSuper();
        // System.out.println("A = "+a+"\nB = "+b);
        
        obj.Init(10,5);
    }
}