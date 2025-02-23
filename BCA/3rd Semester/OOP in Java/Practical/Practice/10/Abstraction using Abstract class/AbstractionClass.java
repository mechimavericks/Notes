abstract class Student{
    void DressCode(){
        System.out.println("Uniform, Shoes and Tie.");
    }
    abstract void Dress();
}
class Boy extends Student{
    void Dress(){
        System.out.println("Black Paint, White Shirt and Black Shoes.");
    }
}
class Girl extends Student{
    void Dress(){
        System.out.println("Black Sural, White Kurtha.");
    }
}
class AbstractionClass{
    public static void main(String[] args) {
        //This is one way to create object
        Student boy=new Boy();
        Student girl=new Girl();
        System.out.println("For Boys:");
        boy.DressCode();
        boy.Dress();
        System.out.println("For Girls:");
        girl.DressCode();
        girl.Dress();

        System.out.println("\n\n\n\n");
        //This is another way to create object
        Boy b=new Boy();
        Girl g=new Girl();
        System.out.println("For Boys:");
        b.DressCode();
        b.Dress();
        System.out.println("For Girls:");
        g.DressCode();
        g.Dress();

    }
}