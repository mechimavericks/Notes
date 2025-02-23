class A{
    synchronized void Disp(int i){
        System.out.println("Thread "+i+" is Using");
    }
}
class Thread1 extends Thread{
    A a =new A();
    public void run(){
        for(;;)
            a.Disp(1);
    }
}
class Thread2  extends Thread{
    A a =new A();
    public void run(){
        for(;;)
            a.Disp(2);
    }
}
class SynchronizedThread{
    public static void main(String args[]){
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        t1.start();
        t2.start();
    }
}