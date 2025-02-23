// Create three classes Add, Sub, Mul and Calculator into a package
import calcualtor.Sub;
import calcualtor.Div;
import calcualtor.Mul;
import calcualtor.Add;
class Calculator{
    public static void main(String args[]){
        Sub s = new Sub();
        Add a = new Add();
        Mul m = new Mul();
        Div d = new Div();
        int add = a.Addition(10,5);
        int sub = s.Subtraction(10,5);
        int mul = m.Multiplication(10,5);
        int div = d.Division(10,3);
        System.out.println("A = 10 and B = 5\nAddition = "+add+"\nSubtraction = "+sub+"\nMultiplication = "+mul+"\nDivision = "+div);
    }
}