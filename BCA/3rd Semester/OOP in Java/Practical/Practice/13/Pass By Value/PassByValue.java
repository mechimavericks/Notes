class CallByValue{
    int a=20;
    void Sum(int a){
        a=a+10;
    }
}
class PassByValue{
   public static void main(String[] args) {
    CallByValue obj=new CallByValue();
    System.out.println("Value of A Before Calling = "+obj.a);
    obj.Sum(60);
    System.out.println("Value of A Calling Calling = "+obj.a);
   }
}