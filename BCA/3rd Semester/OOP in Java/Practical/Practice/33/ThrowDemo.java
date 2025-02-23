class ThrowDemo{
    static int Div(int a, int b){
        if(b<=0)
            throw new ArithmeticException("Cannot Divide by Zero");
        else 
            return a/b;
    }
    public static void main(String args[]){
        try{
            System.out.println(Div(5,0));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}