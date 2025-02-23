class Modifier{
    int a=10,b=20;
    int Sum(){ // here the sum is using default access modifier and it can be only access in same package.
        return a+b;
    }
    protected int Sub(){ // this can be accessed only in same package and through the help of child classes if the child classes is public.
        return b-a;
    }
    private int Mul(int x, int y){ // it cannot be access out of the class
        return x*y;
    }
    public void Display(){
        System.out.println("Addition = "+Sum()+"\nSubtraction = "+Sub()+"\nMultiplication = "+Mul(5,6));
    }
}
public class AccessModifier {
    public static void main(String[] args) {
        Modifier obj=new Modifier();
        obj.Display();
    }    
}
