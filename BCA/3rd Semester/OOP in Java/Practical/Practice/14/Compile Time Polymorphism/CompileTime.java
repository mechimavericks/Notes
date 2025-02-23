class Compile{
    int Sum(int a, int b){
        return a+b;
    }
    int Sum(int a, int b , int c){
        return a+b+c;
    }
    float Sum(float a, float b){
        return a+b;
    }
}
class CompileTime{
    public static void main(String[] args) {
        Compile obj=new Compile();
        System.out.println("Sum of Two Integers = "+obj.Sum(10,15));
        System.out.println("Sum of Three Integers = "+obj.Sum(10,15,40));
        System.out.println("Sum of Two Float = "+obj.Sum(3.2f,5.6f));
    }
}