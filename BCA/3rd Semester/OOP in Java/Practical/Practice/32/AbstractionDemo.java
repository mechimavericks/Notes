abstract class MainClass{
    abstract void Disp();
}
class SubClass extends MainClass{
    void Disp(){
        System.out.println("Enjoy Coding...");
    }
}
class AbstractionDemo{
    public static void main(String args[]){
        SubClass obj = new SubClass();
        obj.Disp();
    }
}