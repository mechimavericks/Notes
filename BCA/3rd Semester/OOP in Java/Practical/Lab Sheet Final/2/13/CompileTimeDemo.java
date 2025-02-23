// Demonstrate Simple Calculator using Java. Here we have two definitions of the same method add() which add method would be called is determined by the parameter list at the Compile Time.
class Calc{
    void add(int x, int y){
        System.out.println("Integer Addition = "+(x+y));
    }
    void add(float x, float y){
        System.out.println("Float Addition = "+(x+y));
    }
}
class CompileTimeDemo{
    public static void main(String[] args) {
        Calc c1=new Calc();
        c1.add(15,25);
        c1.add(5.62f,63.31f);
    }
}