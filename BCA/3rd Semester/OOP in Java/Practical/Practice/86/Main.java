import calc.Sum;
import calc.Mul;
import calc.Div;
import calc.Sub;
class Main{
    public static void main(String args[]){
        Sum s=new Sum();
        Sub su=new Sub();
        Div d=new Div();
        Mul m=new Mul();
        s.Addition(5,10);
        su.Subtraction(10,5);
        d.Division(4,2);
        m.Multiply(4,2);
    }
}