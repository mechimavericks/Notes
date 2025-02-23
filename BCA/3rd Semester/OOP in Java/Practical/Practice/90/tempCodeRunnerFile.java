class Disp{
    int flag=0;
    synchronized void Display1()throws Exception{
        while(flag==1)
            wait();
        System.out.println("Thread 1");
        flag=1;
        notify();
    }
    synchronized void Display2() throws Exception{
        while(flag==0)
            wait();
        System.out.println("Thread 2");
        flag=0;
        notify();
    }
}
class Thread1 extends Thread{
    Disp obj = new Disp();
    public void run(){
        try{
            for(;;)
        obj.Display1();
        }catch(Exception e){};
    }
}
class Thread2 extends Thread{
    Disp obj = new Disp();
    public void run(){
        try{
            for(;;)
        obj.Display2();
        }catch(Exception e){};
    }
}
class InterThreadCommunication{
    public static void main(String args[]){
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        t1.start();
        t2.start();
    }
}