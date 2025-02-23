class Calc{
    int Div(int a, int b)throws ArithmeticException{
        return a/b;
    }
    String Age(int n){
        if(n<0)
            throw new ArithmeticException("Age Cannot be Negative.");
        else
            return "Valid Age";
    }
}
class ThrowsDemo{
    public static void main(String args[]){
        Calc obj = new Calc();
            try{System.out.println(obj.Div(10,2));
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            System.out.println(obj.Age(-5));
        }catch(ArithmeticException error){
            System.out.println(error);
        }
    }
}