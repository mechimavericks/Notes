// Write a program in JAVA to demonstrate the method and constructor overloading.
class Cons{
    int x,y;
    Cons(){
    }
    Cons(int a, int b){
        x=a;
        y=b;
    }
    void Sum(int x, int y){
        System.out.println("Sum of Integer = "+(x+y));
    }
    void Sum(float x, float y){
        System.out.println("Sum of Float = "+(x+y));
    }
    void PrintData(){
        System.out.println("X = "+x+"\nY = "+y);
    }
}
class OverloadingDemo{
    public static void main(String[] args) {
        Cons c1=new Cons();
        Cons c2=new Cons(10,20);
        c2.PrintData();
        c1.Sum(10,20);
        c1.Sum(3.2f,4.3f);
    }
}