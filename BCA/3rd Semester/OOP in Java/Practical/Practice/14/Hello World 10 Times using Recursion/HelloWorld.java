class Recursion{
    void Display(int n){
        if (n>0) {
            System.out.println("Hello World");
            Display(n-1);
        }
    }
}
class HelloWorld{
    public static void main(String[] args) {
        Recursion r=new Recursion();
        r.Display(10);
    }
}