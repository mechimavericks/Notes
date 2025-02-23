class ThrowDemo{
    public static void main(String args[]){
        int a=10;
        a=a/0;
        throw new ArithmeticException("Divided By Zero");
    }
}