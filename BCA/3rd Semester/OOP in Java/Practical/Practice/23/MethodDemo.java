class MethodDemo{
    public static void main(String args[]){
        MethodDemo obj = new MethodDemo();
        Sum(20,10); //Doesn't required to create object for static method
        obj.Sub(20,10);  // required to create object for non static method
    }
    static void Sum(int a, int b){   
        System.out.println("Sum = "+(a+b));
    }
    void Sub(int a, int b){
        System.out.println("Sub = "+(a-b));
    }
}