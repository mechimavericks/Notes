// Thead by Extending thread class;
//Here the output will change everythime whenever we run it due to theread
class Thread1 extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=5;i++)
            System.out.println("Thread 1");
    }
}
class Thread2 extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=5;i++)
            System.out.println("Thread 2");
    }
}
class ThreadDemo{
    public static void main(String args[]){
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        t1.start();
        t2.start();
        for(int i=1;i<=5;i++)
            System.out.println("Main Thread");
    }
}