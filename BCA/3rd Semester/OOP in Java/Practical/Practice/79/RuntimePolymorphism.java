class Student{
    void Disp(){
        System.out.println("I am Student.");
    }
}
class Girl extends Student{
    void Disp(){
        super.Disp();
        System.out.println("I am a Girl");
    }
}
class Boy extends Student{
    void Disp(){
        super.Disp();
        System.out.println("I am a Boy");
    }
}
class RuntimePolymorphism{
    public static void main(String args[]){
        Girl g = new Girl();
        Boy b = new Boy();
        g.Disp();
        b.Disp();
    }
}