class Sum{
    void Disp(int a, int b){
        System.out.println("Sum = "+(a+b));
    }
    void Disp(float a, float b){
        System.out.println("Sum = "+(a+b));
    }
    void Disp(int a, int b, int c){
        System.out.println("Sum = "+(a+b+c));
    }
}
class MethodOverloading{
    public static void main(String args[]){
        Sum obj = new Sum();
        obj.Disp(5,10);
        obj.Disp(5.5f,10.3f);
        obj.Disp(5,10,-3);
    }
}