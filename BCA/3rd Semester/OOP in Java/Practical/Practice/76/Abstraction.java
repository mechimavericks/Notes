abstract class People{
    void Disp(){
        System.out.println("I am Human");
    }
    abstract void Gender();
}
class Women extends People{
    void Gender(){
        System.out.println("Women");
    }
}
class Men extends People{
    void Gender(){
        System.out.println("Men");
    }
}
class Abstraction{
    public static void main(String args[]){
        Women w=new Women();
        Men m = new Men();
        w.Disp();
        w.Gender();
        m.Disp();
        m.Gender();
    }
} 