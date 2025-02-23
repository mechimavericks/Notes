// Thead by implementing  thread class;
//Here the output will change everythime whenever we run it due to theread
class Task1 implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++)
            System.out.println("Thread 1");
    }
}
class Task2 implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++)
            System.out.println("Thread 2");
    }
}
class ThreadDemo{
    public static void main(String args[]){
        Task1 t1=new Task1();
        Task2 t2=new Task2();
        Thread th1=new Thread(t1);
        Thread th2=new Thread(t2);
        th1.start();
        th2.start();
        for(int i=1;i<=5;i++)
            System.out.println("Main Thread");
    }
}