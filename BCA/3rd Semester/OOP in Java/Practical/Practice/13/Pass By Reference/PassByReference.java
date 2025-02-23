class Reference{
    int a=50;
    void Sum(Reference obj){
        obj.a=obj.a+20;
    }
}
public class PassByReference {
 public static void main(String[] args) {
    Reference r=new Reference();
    System.out.println("Value of A Before Calling = "+r.a);
    r.Sum(r);
    System.out.println("Value of A Calling Calling = "+r.a);
 }   
}
