class Cons{
    int a,b;
    //default constructor is automatically created
    Cons(int a, int b){  //it is parameterized constructor
        this.a=a;
        this.b=b;
        System.out.println(a+" "+b);    
    }
}
class CopyCons{
    CopyCons(Cons c){ //it is copy constructor 
        System.out.println(c.a+" "+c.b);
    }
}
class ConstructorDemo{
    public static void main(String args[]){
        Cons obj = new Cons(10,15);
        CopyCons cobj=new CopyCons(obj);
    }
}